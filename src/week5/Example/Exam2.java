package week5.Example;

import week5.try_catch.InvalidNumberException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam2 {

    // Hàm main
    public static void main(String[] args) {
        // Variables
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] list;
        int c = 0;
        //
        list = input.split(" ");
        try {
            for (int i = 0; i < list.length; i++) {
                c++;
                Double number = Double.parseDouble(list[i]);
            }
            System.out.println("True, có " + c + " số.");
        } catch (NumberFormatException e) {
            System.out.println("False.");
        } finally {
            scanner.close();
        }
    }
}
