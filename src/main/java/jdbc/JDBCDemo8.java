package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDemo8 {
    public static void main(String[] args) {
        String sql="INSERT INTO userinfo(username,password,nickname,age) VALUES(?,?,?,?)";
        try(Connection conn=DBUtil.getConnection();) {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,"张三");
            ps.setString(2,"668899");
            ps.setString(3,"阿三");
            ps.setInt(4,18);
            int num=ps.executeUpdate();
            if (num>0){
                System.out.println("成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
