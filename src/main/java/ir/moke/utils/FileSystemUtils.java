package ir.moke.utils;

import java.nio.file.*;
import java.util.List;
import java.util.function.Consumer;

public class FileSystemUtils {

    public static void watchPathAsync(Path path, Consumer<Path> pathConsumer, WatchEvent.Kind<Path> kinds) {
        Thread.startVirtualThread(() -> watchPath(path, pathConsumer, kinds));
    }

    public static void watchPath(Path path, Consumer<Path> pathConsumer, WatchEvent.Kind<Path> kinds) {
        if (!Files.isDirectory(path))
            throw new IllegalArgumentException("path %s should be a directory".formatted(path));
        try (WatchService watchService = path.getFileSystem().newWatchService()) {
            path.register(watchService, kinds);
            WatchKey key;
            while ((key = watchService.take()) != null) {
                List<WatchEvent<?>> events = key.pollEvents();
                for (WatchEvent<?> event : events) {
                    pathConsumer.accept((Path) event.context());
                }

                key.reset();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
