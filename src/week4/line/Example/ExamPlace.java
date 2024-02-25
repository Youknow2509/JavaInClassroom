package week4.line.Example;

import week4.line.Line.LineOxy;
import week4.line.Line.MPOxyz;
import week4.paint.Paint.Point2D;

import java.util.ArrayList;

public class ExamPlace { // Coppy ExamLine and edit it

    // Edit RandomLine method
    private static void RandomLine(ArrayList<LineOxy> lines, int n) {
        for (int i = 0; i < n; i++) {
            if (Math.random() > 0.5) {
                lines.add(new LineOxy((int) (Math.random() * 10), (int) (Math.random() * 10), (int) (Math.random() * 10)));
            } else {
                lines.add(new MPOxyz((int) (Math.random() * 10), (int) (Math.random() * 10), (int) (Math.random() * 10), (int) (Math.random() * 10)));
            }
        }
    }
    private static void ShowLines(ArrayList<LineOxy> lines) {
        for (LineOxy line : lines) {
            System.out.println(line);
        }
    }
    public static void main(String[] args) {

        ArrayList<LineOxy> lines = new ArrayList<>();
        // Tao ra n duong thang va mat phang ngau nhien
        final int n = 2;
        RandomLine(lines, n);
        // Hien thi cac duong thang
        ShowLines(lines);
        // Tinh tong khoang cach toi goc toa do
        double sumDistance = 0;
        for (LineOxy line : lines) {
            sumDistance += line.distance();
        }
        System.out.println("Tong khoang cach toi goc toa do: " + sumDistance);
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
