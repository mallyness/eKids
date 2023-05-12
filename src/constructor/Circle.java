package constructor;

public class Circle {

    private final double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    public Circle(int radius) {
        this.diameter = 2 * radius;
    }

    public double calculateArea() {
        return Math.PI * diameter * diameter / 4;
    }
}
