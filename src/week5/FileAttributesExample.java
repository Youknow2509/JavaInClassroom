package week5;

import java.io.File;
import java.io.IOException;

public class FileAttributesExample {
    // Var
    private String nameFile;
    
    // Construct
    public FileAttributesExample() {}
    public FileAttributesExample(String n) {
        this.nameFile = n;
    }
    // Phương thức để tạo tệp tin mới
    public void createFile() {
        File file = new File(nameFile);
        try {
            if (file.createNewFile()) {
                System.out.println("Tạo tệp tin thành công: " + file.getAbsolutePath());
            } else {
                System.out.println("Tệp tin đã tồn tại.");
            }
        } catch (IOException e) {
            System.out.println("Lỗi tạo tệp tin: " + e);
        }
    }
    // Phương thức để kiểm tra các thuộc tính của tệp tin
    public void checkFileAttributes() {
        File file = new File(nameFile);
        if (file.exists()) {
            System.out.println("Đường dẫn: " + file.getAbsolutePath());
            System.out.println("Tên tệp tin: " + file.getName());
            System.out.println("Đọc được: " + file.canRead());
            System.out.println("Ghi được: " + file.canWrite());
            System.out.println("Kích thước: " + file.length() + " bytes");
        } else {
            System.out.println("Tệp tin không tồn tại.");
        }
    }
    // Phương thức để thay đổi các thuộc tính của tệp tin
    public void changeFileAttributes() {
        File file = new File(nameFile);
        if (file.exists()) {
            // Thay đổi quyền đọc và ghi
            file.setReadable(false);
            file.setWritable(false);
            System.out.println("Đã thay đổi quyền đọc và ghi của tệp tin.");
        } else {
            System.out.println("Tệp tin không tồn tại.");
        }
    }
    // Get set
    public String getNameFile() {
        return nameFile;
    }
    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }
}
