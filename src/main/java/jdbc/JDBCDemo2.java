package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo2 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/tedu?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true","root","123456");
        Statement statement = connection.createStatement();
        /*
            向userinfo表中插入一条记录

            INSERT INTO userinfo(username,password,nickname,age)
            VALUES('张三','123456','阿三',22)
         */
        String sql = "INSERT INTO userinfo(username,password,nickname,age) " +
                "VALUES('张三','123456','阿三',22)";
        /*
            int executeUpdate(String sql)
            专门用于执行DML语句的(INSERT,UPDATE,DELETE)
            返回值表达执行该语句后影响了表中多少条记录
         */
        int num = statement.executeUpdate(sql);
        if(num>0){
            System.out.println("插入完毕!");
        }

        connection.close();
    }
}
