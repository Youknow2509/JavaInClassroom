package week6.Students.Utils;

import week6.Students.Model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    // Var
    private final String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private final String url = "jdbc:sqlserver://localhost:1435;encrypt=true;trustServerCertificate=true" +
            ";username=sa" +
            ";password=P@ss12345;";

    // COnstructor
    public StudentDAO() {
    }
    // Method

    // Get connection
    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(myDriver);
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }

    // Get list of students
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        Connection conn = null;
        Statement st = null;
        try {
            Class.forName(myDriver);
            conn = getConnection();
            String query = "USE QLSV; SELECT * FROM SINHVIEN;";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getString("MASV"));
                student.setName(rs.getString("TENSV"));
                student.setLeaderId(rs.getString("LEARNER_ID"));
                students.add(student);
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return students;
    }

    // Remove student with MASV = id
    public void removeStudent(String id) {
        Connection conn = null;
        PreparedStatement st = null;

        try {
            Class.forName(myDriver);
            conn = getConnection();
            // Query
            String query = "USE QLSV; DELETE FROM SINHVIEN WHERE MASV = ?;";
            st = conn.prepareStatement(query);
            st.setString(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // UpdateStudent information of student with MASV = id
    public void updateStudent(String id, String name, String leaderId) {
        Connection conn = null;
        PreparedStatement st = null;

        try {
            Class.forName(myDriver);
            conn = getConnection();
            // Query
            String query = "USE QLSV; UPDATE SINHVIEN SET TENSV = ?, LEARNER_ID = ? WHERE MASV = ?;";
            st = conn.prepareStatement(query);
            st.setString(1, name);
            st.setString(2, leaderId);
            st.setString(3, id);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Add student
    public void addStudent(String id, String name, String leaderId) {
        Connection conn = null;
        PreparedStatement st = null;
        try {
            Class.forName(myDriver);
            conn = getConnection();
            // Query
            String query = "USE QLSV; INSERT INTO SINHVIEN VALUES (?, ?, ?);";
            st = conn.prepareStatement(query);
            st.setString(1, id);
            st.setString(2, name);
            st.setString(3, leaderId);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
