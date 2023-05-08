package interfaces.task;

public abstract class Shape implements Drawable {

    protected final int x;
    protected final int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw();
}
