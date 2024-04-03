package week4.paint.Example;

import week4.paint.Paint.Circle;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(1, 2, 3);
        Circle c2 = new Circle();

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("Area c1: " + c1.area()); 
        c1.move(3, 3);

        System.out.println(c1);
        System.out.println(c2);

    }
}