package ir.moke.utils;

import ir.moke.MokeException;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.OVERFLOW;

public class FileSystemUtils {

    public static void watchPathAsync(Path path, Consumer<WatchEvent<?>> pathConsumer, List<WatchEvent.Kind<?>> kinds) {
        Thread.startVirtualThread(() -> watchPath(path, pathConsumer, kinds));
    }

    public static void watchPath(Path path, Consumer<WatchEvent<?>> pathConsumer, List<WatchEvent.Kind<?>> kinds) {
        if (!Files.isDirectory(path))
            throw new IllegalArgumentException("path %s should be a directory".formatted(path));
        try (WatchService watchService = path.getFileSystem().newWatchService()) {
            path.register(watchService, kinds.toArray(WatchEvent.Kind[]::new));
            WatchKey key;
            while ((key = watchService.take()) != null) {
                List<WatchEvent<?>> events = key.pollEvents();
                for (WatchEvent<?> event : events) {
                    pathConsumer.accept(event);
                }

                key.reset();
            }
        } catch (Exception e) {
            throw new MokeException(e);
        }
    }

    public static void watchPathRecursiveAsync(Path root, Consumer<WatchEvent<Path>> eventConsumer, List<WatchEvent.Kind<?>> kinds, int maxDepth) {
        Thread.startVirtualThread(() -> watchPathRecursive(root, eventConsumer, kinds, maxDepth));
    }

    @SuppressWarnings("unchecked")
    public static void watchPathRecursive(Path root, Consumer<WatchEvent<Path>> eventConsumer, List<WatchEvent.Kind<?>> kinds, int maxDepth) {
        try (WatchService watcher = root.getFileSystem().newWatchService()) {
            int rootDepth = root.getNameCount();
            Files.walkFileTree(root, Set.of(), maxDepth, new SimpleFileVisitor<>() {
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                    try {
                        int depth = dir.getNameCount() - rootDepth;
                        if (depth > maxDepth) return FileVisitResult.SKIP_SUBTREE;
                        dir.register(watcher, kinds.toArray(WatchEvent.Kind[]::new));
                        WatchKey key;
                        while ((key = watcher.take()) != null) {
                            Path watchedDir = (Path) key.watchable();
                            int watchedDepth = watchedDir.getNameCount() - rootDepth;
                            for (WatchEvent<?> pollEvent : key.pollEvents()) {
                                WatchEvent.Kind<?> kind = pollEvent.kind();
                                if (kind == OVERFLOW) continue;

                                WatchEvent<Path> ev = (WatchEvent<Path>) pollEvent;
                                eventConsumer.accept(ev);
                                Path fullPath = watchedDir.resolve(ev.context());

                                if (kind == ENTRY_CREATE && Files.isDirectory(fullPath)) {
                                    Files.walkFileTree(fullPath, Set.of(), maxDepth - watchedDepth, new SimpleFileVisitor<>() {
                                        @Override
                                        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                                            dir.register(watcher, kinds.toArray(WatchEvent.Kind[]::new));
                                            return FileVisitResult.CONTINUE;
                                        }
                                    });
                                }
                            }
                            key.reset();
                        }
                    } catch (Exception e) {
                        throw new MokeException(e);
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            throw new MokeException(e);
        }
    }
}
