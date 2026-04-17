package ir.moke.utils.fs;

import ir.moke.MokeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.OVERFLOW;

public class FileSystemUtils {
    private static final Logger logger = LoggerFactory.getLogger(FileSystemUtils.class);

    public static void watchPathAsync(Path path, List<WatchEvent.Kind<Path>> kinds, Consumer<FullPathWatchEvent> eventConsumer) {
        Thread.startVirtualThread(() -> watchPath(path, kinds, eventConsumer));
    }

    public static void watchPath(Path path, List<WatchEvent.Kind<Path>> kinds, Consumer<FullPathWatchEvent> eventConsumer) {
        if (!Files.isDirectory(path))
            throw new IllegalArgumentException("path %s should be a directory".formatted(path));
        try (WatchService watchService = path.getFileSystem().newWatchService()) {
            path.register(watchService, kinds.toArray(WatchEvent.Kind[]::new));
            WatchKey key;
            while ((key = watchService.take()) != null) {
                List<WatchEvent<?>> events = key.pollEvents();
                for (WatchEvent<?> event : events) {
                    @SuppressWarnings("unchecked")
                    WatchEvent<Path> ev = (WatchEvent<Path>) event;
                    Path fullPath = ev.context();
                    eventConsumer.accept(new FullPathWatchEvent(ev.kind(), ev.context().toString(), fullPath, ev.count()));
                }

                key.reset();
            }
        } catch (Exception e) {
            throw new MokeException(e);
        }
    }

    public static void watchPathRecursiveAsync(Path root, List<WatchEvent.Kind<Path>> kinds, int maxDepth, Consumer<FullPathWatchEvent> eventConsumer) {
        Thread.startVirtualThread(() -> watchPathRecursive(root, kinds, maxDepth, eventConsumer));
    }

    public static void watchPathRecursive(Path root, List<WatchEvent.Kind<Path>> kinds, int maxDepth, Consumer<FullPathWatchEvent> eventConsumer) {
        try (WatchService watcher = root.getFileSystem().newWatchService()) {
            int rootDepth = root.getNameCount();
            Files.walkFileTree(root, Set.of(), maxDepth, new SimpleFileVisitor<>() {
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                    int depth = dir.getNameCount() - rootDepth;
                    if (depth > maxDepth) {
                        return FileVisitResult.SKIP_SUBTREE;
                    }
                    try {
                        dir.register(watcher, kinds.toArray(WatchEvent.Kind[]::new));
                    } catch (IOException ignored) {
                    }
                    return FileVisitResult.CONTINUE;
                }
            });

            while (!Thread.currentThread().isInterrupted()) {
                WatchKey key = watcher.take();
                Path watchedDir = (Path) key.watchable();
                int watchedDepth = watchedDir.getNameCount() - rootDepth;

                for (WatchEvent<?> event : key.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();
                    if (kind == OVERFLOW) continue;

                    @SuppressWarnings("unchecked")
                    WatchEvent<Path> ev = (WatchEvent<Path>) event;
                    Path fullPath = watchedDir.resolve(ev.context());
                    eventConsumer.accept(new FullPathWatchEvent(ev.kind(), ev.context().toString(), fullPath, ev.count()));

                    if (kind == ENTRY_CREATE && Files.isDirectory(fullPath) && watchedDepth + 1 <= maxDepth) {
                        Files.walkFileTree(fullPath, Set.of(), maxDepth - watchedDepth - 1,
                                new SimpleFileVisitor<>() {
                                    @Override
                                    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                                        try {
                                            dir.register(watcher, kinds.toArray(WatchEvent.Kind[]::new));
                                        } catch (IOException ignored) {
                                        }
                                        return FileVisitResult.CONTINUE;
                                    }
                                }
                        );
                    }
                }
                key.reset();
            }
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                logger.warn("Deactivate recursive watch filesystem {}", root);
            } else {
                logger.error("Unknown error", e);
            }
        }
    }
}
