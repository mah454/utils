package ir.moke.utils;

import ir.moke.MokeException;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Consumer;

public class KMsg implements Closeable, Runnable, TtyAsciiCodecs {
    private boolean isClosed;
    private final Consumer<String> consumer;

    public KMsg(Consumer<String> consumer) {
        this.consumer = consumer;
    }

    public void start() {
        try (BufferedReader reader = new BufferedReader(new FileReader("/dev/kmsg"))) {
            String line;
            while ((line = reader.readLine()) != null && !isClosed) {
                String[] parts = line.split(",-;", 2);
                if (parts.length == 2) {
                    String metadata = parts[0];
                    String message = parts[1];

                    String[] metaParts = metadata.split(",");
                    String[] msgParts = message.split(": ", 2);
                    if (metaParts.length >= 3) {
                        String timestamp = metaParts[2];
                        if (msgParts.length == 2) {
                            consumer.accept("%s[%s] %s%s:%s %s".formatted(BLUE, timestamp, GREEN, msgParts[0], RESET, msgParts[1]));
                        } else {
                            consumer.accept("%s[%s]%s %s".formatted(BLUE, timestamp, RESET, message));
                        }
                    } else {
                        consumer.accept(message.trim());
                    }
                }
            }
        } catch (IOException e) {
            throw new MokeException("Error reading /dev/kmsg: " + e.getMessage());
        }
    }

    @Override
    public void close() {
        this.isClosed = true;
    }

    @Override
    public void run() {
        start();
    }
}
