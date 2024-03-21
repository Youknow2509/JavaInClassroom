package week5;

import java.io.*;

public class FileRead {
    
    private static void ReadFile(String path) {
        File file = new File(path);
        FileReader fr = null;
        BufferedReader br = null;
        String line = "";
        double sum = 0;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                String [] ch = line.split(" ");
                for (String string : ch) {
                    try {
                        sum += Double.parseDouble(string);
                    } catch (NumberFormatException e) {
                        System.out.println("Khong the chuyen doi " + string + " thanh so thuc");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    System.out.println("Khong the dong BufferedReader");
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (Exception e) {
                    System.out.println("Khong the dong FileReader");
                }
            }
        }
        System.out.println("Sum: " + sum);
    }
    public static void main(String[] args) {
        String path = "/Users/v/code/java/projects/ExamClassRoom/src/week5/dataRead.txt";
        ReadFile(path);
    }
}
