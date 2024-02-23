package week4.paint.Paint;

public class Point2D implements Shape {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double circ() {
        return 0;
    }

    // Trả về khoảng cách tới gốc toạ độ
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public void move(double dx, double dy) {

    }

    @Override
    public void rotate(double alpha) {

    }

    @Override
    public void zoom(double ratio) {

    }
    @Override
    // Trả về khoảng cách hai điểm
    public double distance(Point2D point) {
        return Math.sqrt((x - point.x) * (x - point.x) + (y - point.y) * (y - point.y));
    }

    // Trả về điểm đối xứng qua gốc toạ độ
    public Point2D symmetric() {
        return new Point2D(-x, -y);
    }

    // Tịnh tiến điểm một khoảng dx, dy
    public void translate(double dx, double dy) {
        x += dx;
        y += dy;
    }
}
