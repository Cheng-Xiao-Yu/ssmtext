package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/tedu?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true","root","123456");
        System.out.println("成功连接数据库！");
        Statement statement=connection.createStatement();
        String sql="CREATE TABLE userinfo(\n" +
                "    id INT PRIMARY KEY AUTO_INCREMENT,\n" +
                "    username VARCHAR(30),\n" +
                "    password VARCHAR(30),\n" +
                "    nickname VARCHAR(30),\n" +
                "    age INT(3)\n" +
                ")";
        statement.execute(sql);
        System.out.println("执行完毕");
        connection.close();
    }
}
