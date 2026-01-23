package ir.moke.utils;

import ir.moke.MokeException;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class OptionalString {

    private final String value;
    private static final OptionalString EMPTY = new OptionalString(null);

    private OptionalString(String value) {
        this.value = value;
    }

    public static OptionalString of(String value) {
        return new OptionalString(Objects.requireNonNull(value));
    }

    public <U> Optional<U> map(Function<String, ? extends U> mapper) {
        Objects.requireNonNull(mapper);
        if (StringUtils.isEmpty(this.value)) return Optional.empty();
        return Optional.ofNullable(mapper.apply(value));
    }

    public boolean check(Predicate<String> predicate) {
        return predicate.test(this.value);
    }

    public <U> U parse(Predicate<String> predicate, Function<String, ? extends U> parser) {
        Objects.requireNonNull(parser);
        if (check(predicate)) {
            return parser.apply(this.value);
        } else {
            throw new MokeException("Failed to parse %s".formatted(this.value));
        }
    }
}
