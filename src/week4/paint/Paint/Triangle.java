package week4.paint.Paint;

public class Triangle implements Shape{
    // Attributes
    private Point2D a, b, c;
    // Constructor
    public Triangle(Point2D a, Point2D b, Point2D c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        super();
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

    @Override
    public double area() {
        double p = circ() / 2;
        return Math.sqrt(p * (p - a.distance(b)) * (p - b.distance(c)) * (p - c.distance(a)));
    }

    @Override
    public double circ() {
        return a.distance(b) + b.distance(c) + c.distance(a);
    }

    @Override
    public double distance() {
        return 0;
    }

    @Override
    public double distance(Point2D p) {
        return 0;
    }

    @Override
    public void move(double dx, double dy) {
        a.setX(a.getX() + dx);
        a.setY(a.getY() + dy);
        b.setX(b.getX() + dx);
        b.setY(b.getY() + dy);
        c.setX(c.getX() + dx);
        c.setY(c.getY() + dy);
    }

    @Override
    public void rotate(double alpha) {
        double x = (a.getX() + b.getX() + c.getX()) / 3;
        double y = (a.getY() + b.getY() + c.getY()) / 3;
        a.setX(x + (a.getX() - x) * Math.cos(alpha) - (a.getY() - y) * Math.sin(alpha));
        a.setY(y + (a.getX() - x) * Math.sin(alpha) + (a.getY() - y) * Math.cos(alpha));
        b.setX(x + (b.getX() - x) * Math.cos(alpha) - (b.getY() - y) * Math.sin(alpha));
        b.setY(y + (b.getX() - x) * Math.sin(alpha) + (b.getY() - y) * Math.cos(alpha));
        c.setX(x + (c.getX() - x) * Math.cos(alpha) - (c.getY() - y) * Math.sin(alpha));
        c.setY(y + (c.getX() - x) * Math.sin(alpha) + (c.getY() - y) * Math.cos(alpha));
    }

    @Override
    public void zoom(double ratio) {
        if (ratio > 0){
            a.setX(a.getX() * ratio);
            a.setY(a.getY() * ratio);
            b.setX(b.getX() * ratio);
            b.setY(b.getY() * ratio);
            c.setX(c.getX() * ratio);
            c.setY(c.getY() * ratio);
        } else {
            a.setX(a.getX() / -ratio);
            a.setY(a.getY() / -ratio);
            b.setX(b.getX() / -ratio);
            b.setY(b.getY() / -ratio);
            c.setX(c.getX() / -ratio);
            c.setY(c.getY() / -ratio);
        }
    }
}
