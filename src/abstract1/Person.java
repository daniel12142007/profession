package abstract1;

public abstract class Person<T, V> {
    private T name;
    private V age;

    public Person(T name, V age) {
        this.name = name;
        this.age = age;
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
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public abstract int Function(int b);
}
