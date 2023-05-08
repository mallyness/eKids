package constructor;

public class Person {
    private String name;
    private int age;

    // No-args constructor
    public Person() {
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Parameterized overloaded constructor
    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person defaultPerson = new Person();
        System.out.println(defaultPerson);

        Person personWithAllParam = new Person("Bob", 18);
        System.out.println(personWithAllParam);

        Person personWithName = new Person("Alice");
        System.out.println(personWithName);
    }
}
