package inheritance;

public class Dog extends Animal {

    private final String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void sound() {
        System.out.println(getName() + " (" + breed + ") says woof!");
    }
}
