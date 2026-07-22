package ir.moke.test;

public record Person(long id,
                     String name) {

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
