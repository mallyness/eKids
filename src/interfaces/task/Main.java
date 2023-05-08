package interfaces.task;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(1, 2);
        shapes[1] = new Circle(3, 4);
        shapes[2] = new Rectangle(5, 6);
        shapes[3] = new Rectangle(7, 8);

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
