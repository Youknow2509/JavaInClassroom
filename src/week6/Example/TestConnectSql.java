package week6.Example;

import java.sql.*;

public class TestConnectSql {
    public static void main(String[] args) {

        String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1435;encrypt=true;trustServerCertificate=true" +
                ";username=sa" +
                ";password=P@ss12345;";
        Connection con = null;
        Statement stmt = null;

        try {
            Class.forName(myDriver);
            con = DriverManager.getConnection(url);
            stmt = con.createStatement();
            String sql = "USE QLDiemQT07 SELECT * FROM DIEMTHI";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("MaSinhVien") + " " + rs.getString("MaMonHoc") + " " + rs.getString("DiemHocPhan"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
