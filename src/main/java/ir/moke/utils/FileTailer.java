package ir.moke.utils;

import ir.moke.MokeException;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.util.function.Consumer;

public class FileTailer implements Closeable, Runnable {
    private final File file;
    private final Consumer<String> consumer;
    private boolean isClosed;

    public FileTailer(File file, Consumer<String> consumer) {
        this.file = file;
        this.consumer = consumer;
    }

    private void start() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            /*
             * Skip to end of file and waiting for new lines .
             * */
            bufferedReader.skip(file.length());

            while (!isClosed) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    consumer.accept(line);
                }
            }
        } catch (Exception e) {
            throw new MokeException(e);
        }
    }

    @Override
    public void close() {
        isClosed = true;
    }

    @Override
    public void run() {
        start();
    }
}