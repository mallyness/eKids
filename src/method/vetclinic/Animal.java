package method.vetclinic;

public class Animal {
    private static int numAnimals = 0;
    private final String name;
    private final String species;
    private final int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
        numAnimals++;
    }

    public static int getNumAnimals() {
        return numAnimals;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age);
    }

    public static void printAllAnimals(Animal... animals) {
        System.out.println("Registered Animals:");
        for (Animal animal : animals) {
            animal.printInfo();
        }
    }

    public static void main(String[] args) {
        Animal dog = new Animal("Fluffy", "Dog", 3);
        Animal cat = new Animal("Whiskers", "Cat", 2);
        Animal fish = new Animal("Bubbles", "Fish", 1);

        Animal.printAllAnimals(dog, cat, fish);
        System.out.println("Total number of animals registered: " + Animal.getNumAnimals());
    }
}