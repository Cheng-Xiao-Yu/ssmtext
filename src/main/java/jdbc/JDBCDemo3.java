package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo3 {
    public static void main(String[] args) throws Exception {
        Connection connection= DBUtil.getConnection();
        System.out.println("成功连接数据库！");
        Statement statement=connection.createStatement();
        String sql="UPDATE userinfo \n" +
                "    SET nickname='晶晶'\n" +
                "    WHERE username='王克晶'\n";
        int num=statement.executeUpdate(sql);
        if (num>0){
            System.out.println("成功");}
            else{
            System.out.println("失败");};
        System.out.println("执行完毕");
        connection.close();
    }
}
