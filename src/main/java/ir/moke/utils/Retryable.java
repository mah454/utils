package ir.moke.utils;

import java.time.Duration;
import java.util.function.Supplier;

public class Retryable {

    public static <T> T retry(int maxAttempts, Duration duration, Supplier<T> retryFunction) throws Exception {
        Exception lastException = new Exception();
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            try {
                retryFunction.get();
            } catch (Exception e) {
                lastException = e;
                if (attempt == maxAttempts) {
                    break;
                }
                Thread.sleep(duration.toMillis());
            }
        }
        throw lastException;
    }
}
