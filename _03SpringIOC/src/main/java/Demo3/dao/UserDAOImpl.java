package Demo3.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDAOImpl implements IUserDAO{
    @Override
    public boolean findUser() {
        System.out.println("UserDAO：根据用户名去数据库中查询用户的信息");
        double r=Math.random();
        if(r>0.5){
            System.out.println("UserDAO：用户信息已找到，将其返回");
            return true;
        }else{
            System.out.println("UserDAO：该用户不存在");
            return false;
        }
    }
}
