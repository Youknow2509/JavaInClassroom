package week4.paint.Example;

import week4.paint.Paint.Circle;
import week4.paint.Paint.Point2D;
import week4.paint.Paint.Point3D;
import week4.paint.Paint.Shape;

public class TestPoint {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(1, 1);
        Point2D p2 = new Point2D(2, 5);
        Point3D p3 = new Point3D(1, 2, 5);
        Circle c1 = new Circle(2, 1, 5);

        Shape[] lPoint = {p1, p2, p3, c1};

        for (Shape s : lPoint) {
            System.out.println(s);
        }

        double sum = 0;
        for (Shape p : lPoint) {
            sum += p.distance(new Point3D(0, 0, 0));
        }
        System.out.println("Sum of distance: " + sum);
    }
}
