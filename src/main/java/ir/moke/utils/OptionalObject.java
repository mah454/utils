package ir.moke.utils;

import ir.moke.MokeException;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class OptionalObject<T> {

    private final T value;

    private OptionalObject(T value) {
        this.value = value;
    }

    public static <T> OptionalObject<T> of(T value) {
        return new OptionalObject<T>(value);
    }

    public boolean check(Predicate<? super T> predicate) {
        return predicate.test(this.value);
    }

    public <U> U parse(Predicate<T> predicate, Function<? super T, ? extends U> parser) {
        if (check(predicate)) {
            return Objects.requireNonNull(parser).apply(this.value);
        } else {
            throw new MokeException("Failed to parse %s".formatted(this.value));
        }
    }

    public <U> U parseOrGet(Predicate<T> predicate, Function<? super T, ? extends U> parser, Supplier<? extends U> supplier) {
        if (check(predicate)) {
            return Objects.requireNonNull(parser).apply(this.value);
        } else {
            return supplier == null ? null : supplier.get();
        }
    }

    public <U> U parseOrGet(Predicate<? super T> predicate, Function<? super T, ? extends U> parser, U u) {
        if (check(predicate)) {
            return Objects.requireNonNull(parser).apply(this.value);
        } else {
            return u;
        }
    }

    public <U> U parseOrThrows(Predicate<? super T> predicate, Function<? super T, ? extends U> parser, Supplier<? extends Throwable> supplier) throws Throwable {
        if (check(predicate)) {
            return Objects.requireNonNull(parser).apply(this.value);
        } else {
            throw supplier.get();
        }
    }
}
