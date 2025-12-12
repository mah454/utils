package ir.moke;

@FunctionalInterface
public interface EventConsumer<T> {

    void accept(T t, int total,int index);
}
