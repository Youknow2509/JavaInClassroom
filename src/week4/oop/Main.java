package week4.oop;

import week4.oop.ps.Ps;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Ps> list = new ArrayList<>();

        list.add(new Ps(1,4));
        list.add(new Ps(1,5));
        list.add(new Ps(2,6));
        list.add(new Ps(1, 2));
        list.add(new Ps(3, 4));
        list.add(new Ps(3, 1));

        System.out.println("Array list");
        for (Ps ps : list) {
            System.out.println(ps.toString());
        }
        Ps temp = new Ps();
        System.out.println("Element max in array list: " + temp.getMaxElement(list).toString());
        System.out.println(("Sum array list: " + temp.sumList(list).toString()));
        System.out.println("Number of elements in array list not Integer:  " + temp.countNotInteger(list));
    }
}
