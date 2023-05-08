package inheritance.protectedaccess;

import inheritance.Animal;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
        System.out.println(this.name);
        checkAccess();
    }
}
