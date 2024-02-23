package week4.paint.Paint;

public class Rectangle {
    // Attributes
    private Point2D a, d; // Toạ độ hai đường chéo    a ----------- b
                            //                        -             -
    private Point2D b, c; //                          c ----------- d
    // Constructor
    public Rectangle(Point2D a, Point2D d) {
        this.a = a;
        this.d = d;
        this.b = new Point2D(d.getX(), a.getY());
        this.c = new Point2D(a.getX(), d.getY());
    }
    // Getters and Setters
    public Point2D getA() {
        return a;
    }
    public void setA(Point2D a) {
        this.a = a;
    }
    public Point2D getD() {
        return d;
    }
    public void setD(Point2D d) {
        this.d = d;
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
        return "Rectangle{" +
                "a=" + a +
                ", d=" + d +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
    // TO DO
}
