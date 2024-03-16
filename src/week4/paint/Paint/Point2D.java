package week4.paint.Paint;

public class Point2D implements Shape {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D(){
        super();
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
        x += dx;
        y += dy;
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

    @Override
    public Point2D tam() {
        return null;
    }

    // Trả về điểm đối xứng qua gốc toạ độ
    public Point2D symmetric() {
        return new Point2D(-x, -y);
    }

    // Tịnh tiến điểm một khoảng dx, dy
    // Điểm đối xứng
    public Point2D diemDoiXungQua(Point2D p) {
        Point2D t = new Point2D();
        t.setX(2*p.getX() - this.getX());
        t.setY(2*p.getY() - this.getY());
        return t;
    }
    // Xoay điểm góc alpha so với điểm p
    public void xoay(double alpha, Point2D p) {
        this.setX(p.getX()
                + (this.getX() - p.getX()) * Math.cos(alpha)
                - (this.getY() - p.getY()) * Math.sin(alpha));
        this.setY(p.getY()
                + (this.getX() - p.getX()) * Math.sin(alpha)
                + (this.getY() - p.getY()) * Math.cos(alpha));
    }

}
