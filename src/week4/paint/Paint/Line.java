package week4.paint.Paint;

public class Line implements Shape {
    private Point2D a;
    private Point2D b;

    public Line(Point2D p1, Point2D p2) {
        this.a = p1;
        this.b = p2;
    }

    public Line() {
        super();
    }

    public Point2D getP1() {
        return a;
    }

    public void setP1(Point2D p1) {
        this.a = p1;
    }

    public Point2D getP2() {
        return b;
    }

    public void setP2(Point2D p2) {
        this.b = p2;
    }

    @Override
    public String toString() {
        return "Line{" +
                "p1=" + a +
                ", p2=" + b +
                '}';
    }

    public double length(){
        return a.distance(b);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double circ() {
        return 0;
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
    }

    @Override
    public void rotate(double alpha) {
        double x1 = a.getX();
        double y1 = a.getY();
        double x2 = b.getX();
        double y2 = b.getY();
        a.setX(x1 * Math.cos(alpha) - y1 * Math.sin(alpha));
        a.setY(x1 * Math.sin(alpha) + y1 * Math.cos(alpha));
        b.setX(x2 * Math.cos(alpha) - y2 * Math.sin(alpha));
        b.setY(x2 * Math.sin(alpha) + y2 * Math.cos(alpha));
    }

    @Override
    public void zoom(double ratio) {
        if (ratio > 0){
            a.setX(a.getX() * ratio);
            a.setY(a.getY() * ratio);
            b.setX(b.getX() * ratio);
            b.setY(b.getY() * ratio);
        } else {
            a.setX(a.getX() / -ratio);
            a.setY(a.getY() / -ratio);
            b.setX(b.getX() / -ratio);
            b.setY(b.getY() / -ratio);
        }
    }
}
