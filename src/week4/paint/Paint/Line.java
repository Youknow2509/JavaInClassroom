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
    public Point2D tam() {
        Point2D t = new Point2D();
        t.setX((a.getX() + b.getX())/2);
        t.setY((a.getY() + b.getY())/2);
        return t;
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
        Point2D tam = tam();
        a.xoay(alpha, tam);
        b.xoay(alpha, tam);
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
