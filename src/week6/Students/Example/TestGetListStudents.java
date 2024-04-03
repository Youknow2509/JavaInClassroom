package week6.Students.Example;

import week6.Students.Model.Student;
import week6.Students.Utils.StudentDAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestGetListStudents {
    // Var
    private static StudentDAO studentDAO = null;
    private static List<Student> students = null;

    // Hien thi danh sach sinh vien
    private static void showListStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Xoa sinh vien theo MaSV
    private static void deleteStudent(String id) {
        System.out.println("After remove student with id = SV01");

        studentDAO.removeStudent(id);
        students = studentDAO.getStudents();
        showListStudents(students);
    }

    // Sua thong tin sinh vien
    private static void updateStudent(String id, String name, String leaderId) {
        System.out.println("After update student with id = " + id);

        studentDAO.updateStudent(id, name, leaderId);
        students = studentDAO.getStudents();
        showListStudents(students);
    }

    // Them sinh vien
    private static void addStudent(String id, String name, String leaderId) {
        System.out.println("After add student with id = " + id);

        studentDAO.addStudent(id, name, leaderId);
        students = studentDAO.getStudents();
        showListStudents(students);
    }

    // Find leader most students
    private static Student findLeaderMostStudents() {
        Student leader = null;
        Map<String, Integer> map = new HashMap<>();
        String id = "";
        int c = 0;
        for (Student student : students) {
            if (map.containsKey(student.getLeaderId())) {
                map.put(student.getLeaderId(), map.get(student.getLeaderId()) + 1);
            } else {
                map.put(student.getLeaderId(), 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > c) {
                c = entry.getValue();
                id = entry.getKey();
            }
        }
        for (Student student : students) {
            if (student.getId().equals(id)) {
                leader = student;
                break;
            }
        }
        return leader;
    }

    public static void main(String[] args) {
        // Get list of students
        studentDAO = new StudentDAO();
        students = studentDAO.getStudents();
        showListStudents(students);

        // Delete student
        //deleteStudent("SV01");

        // Update student
        //updateStudent("SV01", "Nguyen Van A", "SV02");

        // Add student
        // addStudent("SV06", "Dinh Van D", "SV02");

        // Find leader most students
        System.out.println("Leader most students: " + findLeaderMostStudents());

    }
}
