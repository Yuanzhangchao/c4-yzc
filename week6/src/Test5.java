import java.sql.*;

public class Test5 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///test", "root", "nuanlexiatian");
            stmt = conn.createStatement();
            String sql = "select * from student_1 where sno = 's003'";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                String sno = rs.getString("SNO");
                String name = rs.getString("Name");
                int age = rs.getInt("Age");
                String college = rs.getString("College");
                System.out.println(sno + "," + name +"," + age+","+college);
            }
            else
                System.out.println("查询失败！");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
