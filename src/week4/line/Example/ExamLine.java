package week4.line.Example;

import week4.line.Line.LineOxy;
import week4.paint.Paint.Point2D;

import java.util.ArrayList;

public class ExamLine {

    private static void RandomLine(ArrayList<LineOxy> lines, int n) {
        for (int i = 0; i < n; i++) {
            LineOxy line = new LineOxy((int)(Math.random()*10), (int)(Math.random()*10), (int)(Math.random()*10));
            lines.add(line);
        }
    }
    private static void ShowLines(ArrayList<LineOxy> lines) {
        for (LineOxy line : lines) {
            System.out.println(line);
        }
    }
    public static void main(String[] args) {

        ArrayList<LineOxy> lines = new ArrayList<>();
        // Tao ra n duong thang ngau nhien
        final int n = 5;
        RandomLine(lines, n);
        // Hien thi cac duong thang
        ShowLines(lines);
        // Tinh tong khoang cach toi diem O(0, 0) cua cac duong thang
        double sumDistance = 0;
        for (LineOxy line : lines) {
            sumDistance += line.distance();
        }
        System.out.println("Tong khoang cach toi diem O(0, 0) cua cac duong thang: " + sumDistance);
        // Dem xem co bao nhieu duong thang di qua diem A(1, 1)
        Point2D A = new Point2D(1, 1);
        int count = 0;
        for (LineOxy line : lines) {
            if (line.thuoc(A)) {
                count++;
            }
        }
        System.out.println("So duong thang di qua diem A(1, 1): " + count);

    }
}
