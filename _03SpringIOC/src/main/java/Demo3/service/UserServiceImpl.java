package Demo3.service;

import Demo3.dao.IUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements IUserService{
    @Autowired
    private IUserDAO userDAO;
    @Override
    public boolean login(String username, String password) {
        System.out.println("UserService：开始处理登录业务");
        System.out.println("UserService：检查用户信息是否完整");
        System.out.println("UserService：开始获取用户的注册信息，用于比对登录");
        boolean result=userDAO.findUser();
        if (result){
            System.out.println("UserService：用户名密码正确，登录成功");
            return true;
        }else {
            System.out.println("UserService：用户名或密码不正确，登录失败");
            return false;
        }
    }
}
