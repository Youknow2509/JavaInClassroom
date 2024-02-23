package week4.paint.Paint;

public class Circle implements Shape{
    private double Cx, Cy, R;
    // Constructor
    public Circle(double Cx, double Cy, double R) {
        super();
        this.Cx = Cx;
        this.Cy = Cy;
        this.R = R;
    }
    public Circle() {
        super();
    }
    // Getter and Setter
    public double getCx() {
        return Cx;
    }

    public double getCy() {
        return Cy;
    }

    public double getR() {
        return R;
    }

    public void setCx(double cx) {
        Cx = cx;
    }

    public void setCy(double cy) {
        Cy = cy;
    }

    public void setR(double r) {
        R = r;
    }
    // toString
    @Override
    public String toString() {
        return "Circle{" +
                "Cx=" + Cx +
                ", Cy=" + Cy +
                ", R=" + R +
                '}';
    }
    @Override
    // Method area
    public double area(){
        return Math.PI * R * R;
    }

    @Override
    public double circ() {
        return 0;
    }

    @Override
    public double distance() {
        return new Point2D(Cx, Cy).distance();
    }
    @Override
    public double distance(Point2D p) {
        return new Point2D(Cx, Cy).distance(p);
    }

    @Override
    // Method move
    public void move(double dx, double dy){
        Cx += dx;
        Cy += dy;
    }

    @Override
    public void rotate(double alpha) {

    }

    @Override
    public void zoom(double ratio) {

    }
}
