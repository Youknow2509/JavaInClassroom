package week5.Example;

import week5.FileAttributesExample;

public class ExWeek1 {
    public static void main(String [] arg) {
        String path = "/Users/v/code/java/projects/ExamClassRoom/src/week5/example.txt";
        FileAttributesExample fileAttributesExample = new FileAttributesExample(path);
        fileAttributesExample.createFile();
        fileAttributesExample.checkFileAttributes();
        //fileAttributesExample.changeFileAttributes();
    }
}
