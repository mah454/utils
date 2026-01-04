package ir.moke.model;

import java.nio.file.Path;
import java.nio.file.WatchEvent;

public record FullPathWatchEvent(WatchEvent.Kind<?> kind,
                                 String fileName,
                                 Path fullPath,
                                 int count) {
}
