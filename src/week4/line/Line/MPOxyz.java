package week4.line.Line;

import week4.paint.Paint.Point2D;
import week4.paint.Paint.Point3D;

public class MPOxyz extends LineOxy { // Định nghĩa pt mặt phẳng: Ax + By + Dz + C = 0
    // Atributes
    private double d;
    // Constructors
    public MPOxyz(double a, double b, double d, double c) {
        super(a, b, c);
        this.d = d;
    }
    public MPOxyz() {
        super();
    }
    // Getters and Setters


    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "MP: " + getA() + "*x + " + getB() + "*y + " + d + "*z + " + getC() + " = 0";
    }
    // Tinh khoang cach tu 1 diem den mp
    public double distance() {
        return Math.abs(getC())
                / Math.sqrt(getA() * getA() + getB() * getB() + d * d);
    }
    public double distance(Point2D p) {
        double t = getA() * p.getX() + getB() * p.getY() + getC();
        if (p instanceof Point3D) {
            t += d * ((Point3D) p).getZ();
        }
        return Math.abs(t)
                / Math.sqrt(getA() * getA() + getB() * getB() + d * d);
    }
    // Kiem tra diem thuoc mat phang
    public boolean thuoc(Point2D p) { // Ax + By + c + Dz = 0
        double t = getA() * p.getX() + getB() * p.getY() + getC();
        if (p instanceof Point3D) {
            t += d * ((Point3D) p).getZ();
        }
        return  t  == 0;
    }

}
