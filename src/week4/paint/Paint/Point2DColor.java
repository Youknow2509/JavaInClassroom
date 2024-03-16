package week4.paint.Paint;

public class Point2DColor extends Point2D {
    private String color;

    public Point2DColor(double x, double y, String color) {
        super(x, y);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Point2DColor{" + "x=" + getX() + ", y=" + getY() + ", color='" + color + '\'' + '}';
    }
}
