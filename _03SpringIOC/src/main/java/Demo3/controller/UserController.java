package Demo3.controller;

import Demo3.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserController {
    @Autowired
    private IUserService userService;
    public void doLogin(){
        System.out.println("UserController：收到来自用户希望进行登录的请求");
        System.out.println("UserController：获取用户提交的用户名和密码");
        System.out.println("UserController：开始处理用户的登录信息");
        boolean result=userService.login("张三","123456");
        if (result){
            System.out.println("UserController：向用户展示用户登录成功的页面信息");
        }else {
            System.out.println("UserController：向用户展示用户登录失败的页面信息");
        }
    }
}
