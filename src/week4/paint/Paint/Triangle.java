package week4.paint.Paint;

public class Triangle {
    // Attributes
    private Point2D a, b, c;
    // Constructor
    public Triangle(Point2D a, Point2D b, Point2D c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    // Getters and Setters
    public Point2D getA() {
        return a;
    }
    public void setA(Point2D a) {
        this.a = a;
    }
    public Point2D getB() {
        return b;
    }
    public void setB(Point2D b) {
        this.b = b;
    }
    public Point2D getC() {
        return c;
    }
    public void setC(Point2D c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
    // TO DO
}
