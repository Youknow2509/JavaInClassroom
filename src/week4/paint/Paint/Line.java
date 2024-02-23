package week4.paint.Paint;

public class Line {
    private Point2D a;
    private Point2D b;

    public Line(Point2D p1, Point2D p2) {
        this.a = p1;
        this.b = p2;
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
    // TO DO
}
