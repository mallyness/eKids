package inheritance;

public class Animal {

    protected final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sound() {
        System.out.println(name + " animal makes a sound.");
    }

    protected static void checkAccess() {
        System.out.println("Has access");
    }
}
