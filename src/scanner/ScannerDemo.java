package scanner;

import java.util.Random;

public class ScannerDemo {
    public static void main(String[] args) {
        int age = new Random().nextInt(1, 99);

        if (age <= 2) {
            System.out.println("Baby");
        } else if (age < 18) {
            System.out.println("Young");
        } else {
            System.out.println("Adult");
        }
    }
}
