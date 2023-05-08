package method;

public class Shape {

    private final String type;

    public Shape(String type) {
        this.type = type;
    }

    public void printInfo() {
        System.out.println("Shape type: " + type);
    }

    public void printInfo(String color) {
        System.out.println("Shape type: " + type + ", color: " + color);
    }

    private void printInfo(int anglesNumber) {
        System.out.println("Shape type: " + type + ", angles number: " + anglesNumber);
    }

    public static void main(String[] args) {
        Shape square = new Shape("square");
        square.printInfo();

        Shape triangle = new Shape("triangle");
        triangle.printInfo("red");

        Shape circle = new Shape("circle");
        circle.printInfo(0);
        triangle.printInfo(3);
    }
}
