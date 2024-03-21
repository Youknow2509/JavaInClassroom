package week4.paint.Example;

import week4.paint.Paint.Point2D;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExampleWeek5 {
    // Ham tinh tong khoang cach cac diem
    private static void SumDistance(List<Point2D> listPoint) {
        double sumDistance = 0;
        int size = listPoint.size();
        for (int i = 0; i < size - 1; i++) {
            sumDistance += listPoint.get(i).distance(listPoint.get(i + 1));
        }
        sumDistance += listPoint.get(size - 1).distance(listPoint.get(0));
        System.out.println("Number of Points: " + size);
        System.out.println("Total of distance: " + sumDistance);
    }
    // Ham in ra list cac diem
    private static void PrintListPoint(List<Point2D> listPoint) {
        for (Point2D point : listPoint) {
            System.out.println(point);
        }
    }
    // Ham doc file va tra ve list cac diem
    private static List<Point2D> ReadFileToListPoint(String path) {
        List<Point2D> res = new ArrayList<Point2D>();
        BufferedReader br = null;
        FileReader fr = null;
        String line;
        String [] dataLine;
        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                line = line.replace("[", ""); // Tham khao: https://www.digitalocean.com/community/tutorials/java-remove-character-string
                dataLine = line.split("]-");
                int size = dataLine.length;
                dataLine[size - 1] = dataLine[size - 1].replace("]", ""); // Xoa dau "]" cuoi cung
                for (int i = 0; i < size; i++) {
                    String [] dataPoint = dataLine[i].split(";");
                    Point2D point = new Point2D(Double.parseDouble(dataPoint[0]), Double.parseDouble(dataPoint[1]));
                    res.add(point);
                }
            }

        } catch (NumberFormatException e) {
            System.out.print("Loi dinh dang so: ");
            e.printStackTrace();
        }catch (FileNotFoundException e) {
            System.out.print("Loi khong tim thay file: ");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.print("Loi doc file: ");
            e.printStackTrace();
        }
        finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.print("Loi dong file");
                e.printStackTrace();
            }
        }
        return res;
    }
    // Ghi dữ liệu thành obj ra ngoài file
    private static void WriteDataObjToFile(List<Point2D> listPoint) {
        String path = "/Users/v/code/java/projects/ExamClassRoom/src/week4/paint/DataObjListPoint.txt";
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listPoint);
        } catch (NotSerializableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    // Đọc dữ liệu obj từ file
    private static List<Point2D> ReadDataObjFromFile(String path) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        List<Point2D> listPoint = null;
        try {
            fis = new FileInputStream(path);
            ois = new ObjectInputStream(fis);
            listPoint = (List<Point2D>) ois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return listPoint;
    }
    public static void main (String[] args) {
        //String path = "/Users/v/code/java/projects/ExamClassRoom/src/week4/paint/DataListPoint.txt";
        List<Point2D> listPoint = new ArrayList<Point2D>();
        //listPoint = ReadFileToListPoint(path);
        //PrintListPoint(listPoint);
        //SumDistance(listPoint);
        //WriteDataObjToFile(listPoint); // Ghi dữ liệu thành obj ra ngoài file để xử dụng đọc ngược lại dữ liệu vào
        String path1 = "/Users/v/code/java/projects/ExamClassRoom/src/week4/paint/DataObjListPoint.txt";
        listPoint = ReadDataObjFromFile(path1);
        PrintListPoint(listPoint);
    }
}
