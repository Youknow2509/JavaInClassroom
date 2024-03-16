package week4.oop;

import week4.oop.ps.Ps;

import java.util.ArrayList;

public class TestPs {
    public static void main(String[] args) {

        Ps ps1 = new Ps(2, 1);
        Ps ps2 = new Ps(-3, 4);
        System.out.println(ps1.phannguyen());
        System.out.println(ps2.phannguyen());
    }
}