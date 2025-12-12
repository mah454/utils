package ir.moke.utils;

import ir.moke.EventConsumer;
import ir.moke.MokeException;

import java.io.*;
import java.nio.file.*;
import java.nio.file.FileSystem;
import java.util.List;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class ArchiveUtils {

    public static void zip(List<String> srcFiles, String fileName, EventConsumer<String> consumer) {
        try {
            Path outputZip = Paths.get(srcFiles.getFirst()).getParent().resolve("%s.zip".formatted(fileName));
            try (FileOutputStream fos = new FileOutputStream(outputZip.toFile());
                 ZipOutputStream zipOut = new ZipOutputStream(fos)) {

                int totalSize = srcFiles.size();
                for (int i = 0; i < srcFiles.size(); i++) {
                    File fileToZip = new File(srcFiles.get(i));

                    if (fileToZip.isDirectory()) {
                        // Add an empty directory entry
                        String dirName = fileToZip.getName() + "/";
                        zipOut.putNextEntry(new ZipEntry(dirName));
                        zipOut.closeEntry();
                        if (consumer != null) consumer.accept(dirName, totalSize, i);
                        continue;
                    }

                    try (FileInputStream fis = new FileInputStream(fileToZip)) {
                        ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
                        zipOut.putNextEntry(zipEntry);

                        byte[] bytes = new byte[1024];
                        int length;
                        while ((length = fis.read(bytes)) >= 0) {
                            zipOut.write(bytes, 0, length);
                        }
                        zipOut.closeEntry();
                        if (consumer != null) consumer.accept(zipEntry.getName(), totalSize, i);
                    }
                }
            }
        } catch (Exception e) {
            throw new MokeException(e);
        }
    }

    public static void unzip(Path archive, Path target, EventConsumer<String> consumer) {
        Objects.requireNonNull(archive);
        Objects.requireNonNull(target);

        try (ZipFile zipFile = new ZipFile(archive.toFile())) {
            List<? extends ZipEntry> list = zipFile.stream().toList();
            for (int i = 0; i < list.size(); i++) {
                ZipEntry zipEntry = list.get(i);
                Path outPath = target.resolve(zipEntry.getName());

                if (zipEntry.isDirectory()) {
                    FileUtils.makeDirectory(outPath);
                } else {
                    FileUtils.makeDirectory(outPath.getParent());
                    try (InputStream is = zipFile.getInputStream(zipEntry); OutputStream os = Files.newOutputStream(outPath)) {
                        if (consumer != null) consumer.accept(zipEntry.getName(), list.size(), i);
                        is.transferTo(os);
                    } catch (IOException e) {
                        throw new MokeException(e);
                    }
                }
            }
        } catch (Exception e) {
            throw new MokeException(e.getMessage());
        }
    }

    public static byte[] extractFile(Path archive, String fileName) throws IOException {
        try (FileSystem fileSystem = FileSystems.newFileSystem(archive)) {
            Path path = fileSystem.getPath(fileName);
            return Files.readAllBytes(path);
        }
    }

    private static Path zipSlipProtect(ZipEntry zipEntry, Path targetDir) throws IOException {
        Path targetDirResolved = targetDir.resolve(zipEntry.getName());
        Path normalizePath = targetDirResolved.normalize();
        if (!normalizePath.startsWith(targetDir)) {
            throw new IOException("Bad zip entry: " + zipEntry.getName());
        }

        return normalizePath;
    }
}
