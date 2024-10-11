package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * 完成用户登录功能
 * 程序启动后要求用户输入用户名和密码，然后取userinfo表中检索是否存在该注册用户，如果可以
 * 检索出记录则认为是登录成功，否则登录失败
 * 步骤:
 * 1:首先获取用户输入的用户名和密码
 * 2:连接数据库
 * 3:执行SELECT语句，将用户输入的用户名和密码作为过滤条件去userinfo表中查询数据
 * 4:如果结果集查询到了记录则说明登录成功
 *   否则就是登录失败
 */
public class LoginDemo {
    public static void main(String[] args) {
//        System.out.println("欢迎登录");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入用户名");
//        String username = scanner.nextLine();
//        System.out.println("请输入密码");
//        String password = scanner.nextLine();

        UserInfo userInfo = InputUtil.getInputObject(new UserInfo(),"欢迎登录","登录");
        System.out.println(userInfo);
        try (
                Connection connection = DBUtil.getConnection();
        ){
            Statement statement = connection.createStatement();
            /*
                如果用户输入的密码为:
                a' OR '1'='1
                则会出现SQL注入攻击问题
             */
            String sql = "SELECT id,username,password,nickname,age " +
                    "FROM userinfo " +
                    "WHERE username='"+userInfo.getUsername()+"' AND password='"+userInfo.getPassword()+"'";
            //System.out.println(sql);
            ResultSet resultSet = statement.executeQuery(sql);
            if(resultSet.next()){
                System.out.println("登录成功");
            }else{
                System.out.println("登录失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
