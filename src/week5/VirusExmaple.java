package week5;

import java.io.File;

public class VirusExmaple {
    private static int count = 0;
    public static void ScanFile(File f) {
        System.out.println(f.getAbsoluteFile());
        if (f.isDirectory()) {
            File [] lFiles = f.listFiles();
            for (File file : lFiles) {
                ScanFile(file);
            }
        } else {
            String fileName = f.getName();
            if (fileName.endsWith(".exe") || fileName.endsWith(".bat") || fileName.endsWith(".out")) {
                System.out.println("Virus detected: " + fileName);
                count++;
            }
        }
    }
    public static void main(String[] args) {
        String path = "/Users/v/code";
        File f = new File(path);
        ScanFile(f);
        System.out.println("Total virus detected: " + count);
    }
}
