package ir.moke.utils;

import ir.moke.EventConsumer;
import ir.moke.MokeException;
import ir.moke.utils.date.CalendarType;
import ir.moke.utils.date.DatePattern;
import ir.moke.utils.date.DateTimeUtils;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Stream;

public class FileUtils {

    public static long length(Path path) {
        return path.toFile().length();
    }

    public static boolean isEmptyDirectory(Path path) {
        if (!isDirectory(path)) {
            throw new MokeException("Path %s is not directory".formatted(path.toString()));
        }
        return listFiles(path).toList().isEmpty();
    }

    public static boolean isDirectory(Path path) {
        return Files.isDirectory(path);
    }

    public static Stream<Path> listFiles(Path root) {
        try {
            return Files.list(root);
        } catch (IOException ignore) {
        }
        return Stream.empty();
    }

    public static List<Path> listFiles(Path root, String pattern) {
        try (Stream<Path> paths = Files.walk(root)) {
            PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:" + pattern);
            return paths.filter(Files::isRegularFile)
                    .filter(path -> matcher.matches(path.getFileName()))
                    .toList();
        } catch (IOException e) {
            return List.of();
        }
    }

    public static List<Path> listFileTree(Path root, String pattern, boolean ignoreAccessDenied, int maxDepth) {
        List<Path> list = new ArrayList<>();
        try {
            Files.walkFileTree(root, Set.of(), maxDepth, new SimpleFileVisitor<>() {
                @Override
                public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                    return ignoreAccessDenied ? FileVisitResult.SKIP_SUBTREE : FileVisitResult.TERMINATE;
                }

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                    if (pattern != null) {
                        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:" + pattern);
                        if (pathMatcher.matches(file)) list.add(file);
                    } else {
                        list.add(file);
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            throw new MokeException(e);
        }
        return list;
    }

    public static void delete(Path path) {
        try {
            if (isFileExists(path)) {
                Files.delete(path);
            }
        } catch (IOException e) {
            throw new MokeException(e.getMessage());
        }
    }

    public static void delete(List<Path> paths, EventConsumer<String> consumer) {
        for (int i = 0; i < paths.size(); i++) {
            Path path = paths.get(i);
            consumer.accept(path.toString(), paths.size(), i);
            boolean isDirectory = isDirectory(path);
            if (isDirectory) {
                deleteDirectory(path);
            } else {
                delete(path);
            }
        }
    }

    public static Path findOldest(Path directoryPath) {
        if (!Files.isDirectory(directoryPath, LinkOption.NOFOLLOW_LINKS)) return null;
        return listFiles(directoryPath)
                .sorted(Comparator.comparingLong(value -> value.toFile().lastModified()))
                .toList()
                .getFirst();
    }

    public static void deleteDirectory(Path directory) {
        if (isFileExists(directory)) {
            try (Stream<Path> walk = Files.walk(directory)) {
                walk.sorted(Comparator.reverseOrder())
                        .map(Path::toFile)
                        .forEach(File::delete);
            } catch (IOException e) {
                throw new MokeException(e.getMessage());
            }
        }
    }

    public static void makeDirectory(Path path) {
        try {
            if (isFileExists(path)) return;
            Files.createDirectory(path);
        } catch (IOException e) {
            throw new MokeException(e.getMessage());
        }
    }

    public static void writeContent(File file, byte[] content) {
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(content);
            fos.flush();
        } catch (IOException e) {
            throw new MokeException(e.getMessage());
        }
    }

    public static void writeContent(Path path, byte[] content, StandardOpenOption... openOption) {
        try {
            Files.write(path, content, openOption);
        } catch (IOException e) {
            throw new MokeException(e);
        }
    }

    public static void writeContent(File file, String str) {
        writeContent(file, str.getBytes());
    }

    public static void createBackup(Path source, String suffix) {
        try {
            FileTime lastModifiedTime = Files.getLastModifiedTime(source, LinkOption.NOFOLLOW_LINKS);
            suffix = suffix != null ? suffix : DateTimeUtils.toString(lastModifiedTime.toInstant().atZone(ZoneId.systemDefault()), Locale.ENGLISH, CalendarType.GREGORIAN, DatePattern.MINIMIZED_DATE_TIME_PATTERN);

            Path backup = Paths.get(source.toFile().getAbsolutePath() + "-" + suffix);
            Files.copy(source, backup, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new MokeException(e.getMessage());
        }
    }

    public static boolean isFileExists(Path path) {
        return Files.exists(path, LinkOption.NOFOLLOW_LINKS);
    }

    public static String readFileAsString(String fileName) {
        try {
            final File file = new File(fileName);
            return Files.readString(file.toPath());
        } catch (IOException e) {
            throw new MokeException(e.getMessage());
        }
    }

    public static List<String> readAllLines(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            throw new MokeException(e.getMessage());
        }
    }

    public static String readFileAsString(Path path) {
        try {
            return Files.readString(path);
        } catch (IOException e) {
            throw new MokeException(e.getMessage());
        }
    }

    public static byte[] readFileAsBytes(Path path) {
        try {
            return Files.readAllBytes(path);
        } catch (IOException e) {
            return null;
        }
    }

    public static byte[] readFileChunk(Path fullPath, int index, int bufferSize) {
        try {
            long offset = (long) index * bufferSize;

            try (FileInputStream fis = new FileInputStream(fullPath.toFile())) {
                // Move to the correct position in the file
                if (fis.skip(offset) != offset) {
                    throw new IOException("Failed to skip to offset: " + offset);
                }

                byte[] buffer = new byte[bufferSize];
                int bytesRead = fis.read(buffer);

                if (bytesRead == -1) {
                    return new byte[0]; // Reached EOF
                }

                // Return exact number of bytes read
                return bytesRead < bufferSize ? Arrays.copyOf(buffer, bytesRead) : buffer;
            }
        } catch (Exception e) {
            throw new MokeException(e.getMessage());
        }
    }

    public static void move(Path source, Path dest) {
        try {
            Files.move(source, dest, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new MokeException("Failed move %s".formatted(source.getFileName()));
        }
    }

    public static void move(List<Path> sourceList, Path destination, EventConsumer<String> consumer) {
        int total = sourceList.size();
        for (int i = 0; i < total; i++) {
            Path source = sourceList.get(i);
            consumer.accept(source.toString(), total, i);
            move(source, destination.resolve(source.getFileName()));
        }
    }

    public static void copy(Path source, Path destination) {
        try {
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new MokeException("Failed copy %s".formatted(source.getFileName()));
        }
    }

    public static void copy(List<Path> sourceList, Path destination, EventConsumer<String> consumer) {
        int total = sourceList.size();
        for (int i = 0; i < total; i++) {
            Path source = sourceList.get(i);
            consumer.accept(source.toString(), total, i);
            copy(source, destination.resolve(source.getFileName()));
        }
    }

    public static void replaceLine(File file, String content, int lineIndex) {
        try {
            List<String> lineList = Files.readAllLines(file.toPath());
            lineList.set(lineIndex, content);
            String newContent = String.join("\n", lineList);

            Files.write(file.toPath(), newContent.getBytes(), StandardOpenOption.WRITE);
        } catch (IOException e) {
            throw new MokeException(e.getMessage());
        }
    }

    public static void createDirectory(Path path) {
        try {
            if (!isFileExists(path)) Files.createDirectory(path);
        } catch (IOException e) {
            throw new MokeException(e.getMessage());
        }
    }

    public static String getParentDir(String path) {
        if (path.endsWith("/")) path = path.substring(0, path.length() - 1);
        return path.replaceFirst("/[^/]+$", "/");
    }

    public static void createRandomFile(Path path, long size) {
        try (RandomAccessFile raf = new RandomAccessFile(path.toFile(), "rw")) {
            raf.setLength(size);
        } catch (IOException e) {
            throw new MokeException(e.getMessage());
        }
    }

    public static void createFile(Path path) {
        try {
            Files.createFile(path);
        } catch (IOException e) {
            throw new MokeException(e.getMessage());
        }
    }

    public static void writeChunk(Path path, byte[] chunkData, int chunkIndex, int fixedChunkSize, long totalSize) {
        try (RandomAccessFile raf = new RandomAccessFile(path.toFile(), "rw")) {
            long offset = (long) chunkIndex * fixedChunkSize; // ✅ fixed size used
            raf.seek(offset);
            raf.write(chunkData);

            // Optional: ensure total size is enforced
            if ((offset + chunkData.length) >= totalSize) {
                raf.setLength(totalSize);
            }
        } catch (Exception e) {
            throw new MokeException(e.getMessage());
        }
    }
}
