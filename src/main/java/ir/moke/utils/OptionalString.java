package ir.moke.utils;

import ir.moke.MokeException;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class OptionalString {

    private final String value;

    private OptionalString(String value) {
        this.value = value;
    }

    public static OptionalString of(String value) {
        return new OptionalString(value);
    }

    public boolean check(Predicate<String> predicate) {
        return predicate.test(this.value);
    }

    public <U> U parse(Predicate<String> predicate, Function<String, ? extends U> parser) {
        try {
            if (check(predicate)) {
                return Objects.requireNonNull(parser).apply(this.value);
            } else {
                throw new MokeException("Failed to parse %s".formatted(this.value));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public <U> U parseOrGet(Predicate<String> predicate, Function<String, ? extends U> parser, Supplier<? extends U> supplier) {
        try {
            if (check(predicate)) {
                return Objects.requireNonNull(parser).apply(this.value);
            } else {
                return Objects.requireNonNull(supplier).get();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
