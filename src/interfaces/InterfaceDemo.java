package interfaces;

public class InterfaceDemo {

    public static void main(String[] args) {
        Printable printable = new Book("The Count of Monte Cristo", "Alexandre Dumas");
        printable.print();
    }
}
