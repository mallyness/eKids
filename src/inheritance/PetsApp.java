package inheritance;

public class PetsApp {

    public static void main(String[] args) {
        Animal[] pets = createAnimal();
        for (Animal pet : pets) {
            pet.sound();
        }

        Animal.checkAccess();
    }

    private static Animal[] createAnimal() {
        Animal[] pets = new Animal[5];
        pets[0] = new Cat("Tiger");
        pets[1] = new Cat("Chester");
        pets[2] = new Dog("Khan", "German Shepherd");
        pets[3] = new Dog("Jessie", "Jack Russell");
        pets[4] = new Animal("unknown");
        return pets;
    }
}
