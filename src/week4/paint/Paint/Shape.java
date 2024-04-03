package week4.paint.Paint;

public interface Shape {
    // Tính toán
    double area();
    double circ();
    double distance();
    double distance(Point2D p);
    Point2D tam();

    // Biến đổi
    void move(double dx, double dy);
    void rotate(double alpha);
    void zoom(double ratio);
}
