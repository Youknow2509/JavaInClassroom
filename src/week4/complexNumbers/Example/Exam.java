package week4.complexNumbers.Example;

import week4.complexNumbers.number.ComplexNumber;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Exam {
    public static void main(String[] args) {

        ArrayList<ComplexNumber> complexNumbers = new ArrayList<>();

        final int n = 5;
        // Tạo ra dãy số ngẫu nhiên có n số
        RandomComplexNumber(complexNumbers, n);
        // In ra dãy số
        PrintComplexNumbers(complexNumbers);

        // Tính trung bình cộng dãy số
        ComplexNumber tbc = new ComplexNumber(0, 0);
        for (int i = 0; i < n; i++) {
            tbc = tbc.add(complexNumbers.get(i));
        }
        tbc = tbc.divide(n);
        System.out.println("Trung binh cong cua day la: " + tbc);

        // Tìm số có modunlus lớn nhất
        ComplexNumber modunlusMax = complexNumbers.get(0);
        for (int i = 1; i < n; i++) {
            if (modunlusMax.abs() < complexNumbers.get(i).abs()) {
                modunlusMax = complexNumbers.get(i);
            }
        }
        System.out.println("So co modunlus lon nhat la: " + modunlusMax);

        // Đếm số lượng số phức không có phần ảo
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (complexNumbers.get(i).getImaginary() == 0) {
                count++;
            }
        }
        System.out.println("So luong so phuc khong co phan ao la: " + count);
    }
    private static void RandomComplexNumber(ArrayList<ComplexNumber> complexNumbers, int n){
        for (int i = 0; i < n; i++) {
            complexNumbers.add(new ComplexNumber((int)(Math.random() * 10), (int)(Math.random() * 10)));
        }
    }
    private static void PrintComplexNumbers(ArrayList<ComplexNumber> complexNumbers){
        for (ComplexNumber c : complexNumbers) {
            System.out.println(c);
        }
    }
}
