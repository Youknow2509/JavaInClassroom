package week4.paint.Paint;

public class Circle {
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
    // Method area
    public double area(){
        return Math.PI * R * R;
    }
    // Method move
    public void move(double dx, double dy){
        Cx += dx;
        Cy += dy;
    }
}
