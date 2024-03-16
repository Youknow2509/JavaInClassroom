package week4.paint.Example;

import week4.paint.Paint.Point2D;
import week4.paint.Paint.Point3D;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ExamPoint2 {
    public static void main(String[] args) {

        Point2D p1 = new Point2D(1, 1);
        Point2D p2 = new Point2D(2, 5);

        Point3D p3 = new Point3D(3, 4, 5);
        Point3D p4 = new Point3D(3, 5, 7);


        ArrayList<Point2D> lPoint = new ArrayList<>();
        lPoint.add(p1);
        lPoint.add(p2);
        lPoint.add(p3);
        lPoint.add(p4);

        // Hiển thị thông tin các điểm
        for (Point2D p : lPoint) {
            System.out.println(p);
        }
        // Tính tổng khoảng cách các điểm
        double sum = 0;
        for (int i = 1; i < lPoint.size(); i++) {
            sum += lPoint.get(i).distance(lPoint.get(i - 1));
        }
        System.out.println("Tổng khoảng cách các điểm: " + sum);
        // Thêm các điểm đối xứng vào danh sách
        int n = lPoint.size();
        for (int i = 0; i < n; i++) {
            lPoint.add(lPoint.get(i).symmetric());
        }
        System.out.println("Danh sách các điểm sau khi thêm điểm đối xứng:");
        for (Point2D p : lPoint) {
            System.out.println(p);
        }
        // Khoang cach min toi O(0, 0) cua diem 2D
        System.out.println("Diem 2D co khoang cach toi O(0, 0) nho nhat la: ");
        System.out.println(diem2DGanGocToaDoNhat(lPoint));
    }
    public static Point2D diem2DGanGocToaDoNhat(ArrayList<Point2D> lPoint) {
        Point2D pTemp = lPoint.get(0);
        double s = (pTemp).distance();
        for (int i = 1; i < lPoint.size(); i++) {
            Point2D p =  lPoint.get(i);
            if (p instanceof Point2D) {
                double distanceTemp = (p).distance();
                if (distanceTemp < s) {
                    s = distanceTemp;
                    pTemp = p;
                }
            }
        }
        return pTemp;
    }
}
