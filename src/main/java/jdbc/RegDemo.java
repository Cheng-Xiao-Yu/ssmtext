package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RegDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/tedu?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true","root","123456");
        System.out.println("成功连接数据库！");
        Statement statement=connection.createStatement();
        UserInfo userInfo=InputUtil.getInputObject(new UserInfo(),"注册吧");
        System.out.println(userInfo);
        reg(userInfo);

    }
    public static int reg(UserInfo userInfo) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                //数据库地址格式:jdbc:mysql://数据库IP:端口/数据库名?一堆参数
                "jdbc:mysql://localhost:3306/tedu?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true",
                "root",//数据库用户名
                "123456"//数据库密码
        );
        Statement statement = connection.createStatement();
        /*
            向userinfo表中插入一条记录

            INSERT INTO userinfo(username,password,nickname,age)
            VALUES('张三','123456','阿三',22)
         */
        String sql = "INSERT INTO userinfo(username,password,nickname,age) " +
                "VALUES('"+userInfo.getUsername()+"','"+userInfo.getPassword()+"','"+userInfo.getNickname()+"',"+userInfo.getAge()+")";
        System.out.println(sql);
        /*
            int executeUpdate(String sql)
            专门用于执行DML语句的(INSERT,UPDATE,DELETE)
            返回值表达执行该语句后影响了表中多少条记录
         */
        int num = statement.executeUpdate(sql);
        connection.close();
        return num;
    }
}
