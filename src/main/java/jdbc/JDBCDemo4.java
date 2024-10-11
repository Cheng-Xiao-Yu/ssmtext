package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo4 {
    public static void main(String[] args) {
        try(Connection con=DBUtil.getConnection();){
            Statement stmt=con.createStatement();
            String sql="DELETE FROM userinfo WHERE id=2";
            int num=stmt.executeUpdate(sql);
            if (num>0){
                System.out.println("删除成功");
            }else{
                System.out.println("删除失败");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
