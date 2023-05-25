package interfaces.task;

public class Rectangle extends Shape implements Drawable {

    public Rectangle(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        System.out.printf("Rectangle with coordinates x=%d, y=%d was drawn.%n", x, y);
    }
}
