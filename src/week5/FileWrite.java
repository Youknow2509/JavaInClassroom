package week5;

import java.io.*;

public class FileWrite {
    
    private static void WriteFile(String path) {
        File file = new File(path);
        FileWriter fr = null;
        BufferedWriter br = null;
        String data1 = "Hello!!";
        String data2 = "How are you?";
        try {
            fr = new FileWriter(file);
            br = new BufferedWriter(fr);

            br.write(data1);
            br.newLine();
            br.write(data2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (Exception e) {
                    System.out.println("Khong the dong FileWriteer");
                }
            }
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    System.out.println("Khong the dong BufferedWriteer");
                }
            }
        }
    }
    public static void main(String[] args) {
        String path = "/Users/v/code/java/projects/ExamClassRoom/src/week5/dataWrite.txt";
        WriteFile(path);
    }
}
