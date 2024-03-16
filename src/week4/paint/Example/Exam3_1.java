package week4.paint.Example;

import week4.paint.Paint.*;

import java.util.ArrayList;

public class Exam3_1 {
    public static void main(String[] args) {

        Line l = new Line(new Point2D(0, 1),
                            new Point2D(0, -1));
        l.rotate(Math.PI/2);
        System.out.println(l);

    }
    // Ham tao n hinh ngau nhien
    private static void RandomShape(ArrayList<Shape> shapes, int n){
        for (int i = 0; i < n; i++) {
            int type = (int) (Math.random() * 3);
            switch (type){
                case 0:
                    shapes.add(new Line(
                            new Point2D((int)(Math.random() * 10), (int)(Math.random() * 10)),
                            new Point2D((int)(Math.random() * 10), (int)(Math.random() * 10))
                    ));
                    break;
                case 1:
                    shapes.add(new Triangle(
                            new Point2D((int)(Math.random() * 10), (int)(Math.random() * 10)),
                            new Point2D((int)(Math.random() * 10), (int)(Math.random() * 10)),
                            new Point2D((int)(Math.random() * 10), (int)(Math.random() * 10))
                    ));
                    break;
                case 2:
                    shapes.add(new Rectangle(
                            new Point2D((int)(Math.random() * 10), (int)(Math.random() * 10)),
                            new Point2D((int)(Math.random() * 10), (int)(Math.random() * 10))
                    ));
                    break;
                case 3:
                    shapes.add(new Circle(
                            new Point2D((int)(Math.random() * 10), (int)(Math.random() * 10)),
                            (int)(Math.random() * 10)
                    ));
                    break;
            }
        }
    }
    // Ham in ra thong tin cua cac hinh trong list
    private static void printInfo(ArrayList<Shape> shapes){
        System.out.println("List of shapes: ");
        for (Shape shape : shapes) {
            System.out.println("    " + shape);
        }
        System.out.println();
    }
}
