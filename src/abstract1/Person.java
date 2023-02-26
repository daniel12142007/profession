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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public V getAge() {
        return age;
    }

    public void setAge(V age) {
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

    public abstract int Function(int b);
}
