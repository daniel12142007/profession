package abstract1;

public abstract class Person<T, V> {
    private Long id;
    private T name;
    private V age;

    public Person(Long id, T name, V age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
               "id->" + id +
               ", name->" + name +
               ", age->" + age +
               '}';
    }
}
