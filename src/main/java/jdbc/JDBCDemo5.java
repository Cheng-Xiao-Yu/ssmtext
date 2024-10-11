package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo5 {
    public static void main(String[] args) {
        try(Connection con=DBUtil.getConnection();) {
            Statement stmt=con.createStatement();
            String sql="SELECT id,name,salary,title FROM teacher";
            ResultSet rs=stmt.executeQuery(sql);
            while (rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                int salary=rs.getInt("salary");
                String title=rs.getString("title");
                System.out.println(id+" "+name+" "+salary+" "+title);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
