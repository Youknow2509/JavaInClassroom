package week5.Example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import week5.try_catch.InvalidNumberException;

public class Exam1 {
    private final static int SIZE = 10;
    // Khởi tạo tập số nguyên với các giá trị nhẫu nhiên
    private static List<Integer> randomize() {
        List<Integer> list = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add((int) (Math.random() * 100));
        }
        return list;
    }
    // In ra các phần tử trong tập số nguyên
    private static void print(List<Integer> list) {
        System.out.println("List of integers: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    // Hàm main
    public static void main(String[] args) {
        // Variables
        List<Integer> list = randomize();
        Scanner scanner = new Scanner(System.in);
        Integer input;

        //
        try {
            int index = Integer.parseInt(scanner.nextLine());
            if (index < 0 || index >= SIZE) {
                throw new InvalidNumberException("Giá trị nhập vào phải từ 0 đến " + (SIZE - 1));
            }
            System.out.println("Giá trị của phần tử " + index + " là: " + list.get(index));
        } catch (NumberFormatException e) {
            System.out.println("Lỗi dữ liệu nhập vào. Dữ liệu nhập vào phải là số nguyên.");
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
