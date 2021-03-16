import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test2 {
    public static void main(String args[]){
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///test","root","nuanlexiatian");
            String sql = "insert into student_1 values ('s001','老大',20,'计算机学院'),('s002','老二',19,'计算机学院'),('s003','老三',18,'计算机学院'),('s004','老四',17,'计算机学院')";
            stmt = conn.createStatement();
            int i = stmt.executeUpdate(sql);
            if(i > 0){
                System.out.println("添加成功!");
            }
            else
                System.out.println("添加失败！");

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
