package interfaces.task;

public class Circle extends Shape implements Drawable {

    public Circle(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        System.out.printf("Circle with coordinates x=%d, y=%d was drawn.%n", x, y);
    }
}
