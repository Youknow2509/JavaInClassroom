package week4.line.Line;

import week4.paint.Paint.Point2D;

public class LineOxy { // Định nghĩa pt đường thẳng: ax + by + c = 0
    // Atributes
    private double a, b, c;
    // Constructors
    public LineOxy(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public LineOxy(double a, double b) { // Contructor nhập pt đường thẳng dạng y = ax + b
        this.a = a;
        this.b = -1;
        this.c = b;
    }

    public LineOxy() {
        super();
    }
    // Getters and Setters

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Line: " + a + "*x + " + b + "*y + " + c + " = 0";
    }
    // Tinh khoang cach tu 1 diem den duong thang
    public double distance() {
        return Math.abs(c)
                / Math.sqrt(a * a + b * b);
    }
    public double distance(Point2D p) {
        return Math.abs(a * p.getX() + b * p.getY() + c)
                / Math.sqrt(a * a + b * b);
    }
    public double distance(double x, double y) {
        return Math.abs(a * x + b * y + c)
                / Math.sqrt(a * a + b * b);
    }
    // Kiểm tra 1 điểm có thuộc đường thẳng không
    public boolean thuoc(Point2D p) {
        return a * p.getX() + b * p.getY() + c == 0;
    }
    public boolean thuoc(double x, double y) {
        return a * x + b * y + c == 0;
    }

}
