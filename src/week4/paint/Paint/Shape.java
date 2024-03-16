package week4.paint.Paint;

public interface Shape {
    // Tính toán
    public double area();
    public double circ();
    public double distance();
    public double distance(Point2D p);
    public Point2D tam();

    // Biến đổi
    public void move(double dx, double dy);
    public void rotate(double alpha);
    public void zoom(double ratio);
}
