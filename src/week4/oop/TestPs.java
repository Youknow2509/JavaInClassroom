package week4.oop;

import week4.oop.ps.Ps;

import java.util.ArrayList;

public class TestPs {
    public static void main(String[] args) {

        Ps ps1 = new Ps(1, 2);
        Ps ps2 = new Ps(1, 3);

        System.out.println("Ps 1: " +ps1.toString());
        System.out.println("Ps 2: " +ps2.toString());
        Ps tong = new Ps();
        tong = ps1.tong(ps2);
        System.out.println("Tổng: " + ps1.tong(ps2).toString());
        Ps hieu = new Ps();
        hieu = ps1.hieu(ps2);
        System.out.println("Hiệu: " + ps1.hieu(ps2).toString());
        Ps tich = new Ps();
        tich = ps1.tich(ps2);
        System.out.println("Tích: " + ps1.tich(ps2).toString());
        Ps thuong = new Ps();
        thuong = ps1.thuong(ps2);
        System.out.println("Thương: " + ps1.thuong(ps2).toString());

        ArrayList<Ps> list = new ArrayList<>();
        list.add(ps1);
        list.add(ps2);
        list.add(new Ps(1,4));
        list.add(new Ps(1,5));
        list.add(new Ps(2,6));

    }
}