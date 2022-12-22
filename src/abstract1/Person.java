package abstract1;

public abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws Eror{
        if (age<0){
            throw new Eror("Ты не родился");
        }if (age>100){
            throw new Eror("Ты сдох");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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
