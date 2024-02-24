package week4.paint.Paint;

public class Rectangle implements Shape{
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

    public Rectangle() {
        super();
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

    @Override
    public double area() {
        return a.distance(b) * b.distance(c);
    }

    @Override
    public double circ() {
        return 2 * (a.distance(b) + b.distance(c));
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
        d.setX(d.getX() + dx);
        d.setY(d.getY() + dy);
    }

    @Override
    public void rotate(double alpha) {
        double x = a.getX();
        double y = a.getY();
        a.setX(x * Math.cos(alpha) - y * Math.sin(alpha));
        a.setY(x * Math.sin(alpha) + y * Math.cos(alpha));
        x = b.getX();
        y = b.getY();
        b.setX(x * Math.cos(alpha) - y * Math.sin(alpha));
        b.setY(x * Math.sin(alpha) + y * Math.cos(alpha));
        x = c.getX();
        y = c.getY();
        c.setX(x * Math.cos(alpha) - y * Math.sin(alpha));
        c.setY(x * Math.sin(alpha) + y * Math.cos(alpha));
        x = d.getX();
        y = d.getY();
        d.setX(x * Math.cos(alpha) - y * Math.sin(alpha));
        d.setY(x * Math.sin(alpha) + y * Math.cos(alpha));
    }

    @Override
    public void zoom(double ratio) {
        if (ratio > 0){
            a.setX(a.getX() * ratio);
            a.setY(a.getY() * ratio);
            d.setX(d.getX() * ratio);
            d.setY(d.getY() * ratio);
        } else {
            a.setX(a.getX() / -ratio);
            a.setY(a.getY() / -ratio);
            d.setX(d.getX() / -ratio);
            d.setY(d.getY() / -ratio);
        }
    }
}
