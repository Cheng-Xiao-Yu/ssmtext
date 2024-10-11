package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDemo7 {
    public static void main(String[] args) {
        String username = "范传奇";
        String password = "a' OR '1'='1";

        try (
                Connection connection = DBUtil.getConnection();
        ){
            String sql = "SELECT id,username,password,nickname,age " +
                    "FROM userinfo " +
                    "WHERE username=? AND password=?";
            //先通过连接对象将预编译SQL发送给数据库，让其理解我们要做什么(生成执行计划)
            PreparedStatement ps = connection.prepareStatement(sql);
            //其次我们再次指定"?"对应的值是什么
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                System.out.println("登录成功");
            }else{
                System.out.println("登录失败");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
