package com.tedu.interceptor.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @PostMapping("/reg")
    public String reg(){
        System.out.println("UserController.reg():开始用户注册");
        return "注册成功";
    }
    @PostMapping("/login")
    public String login(){
        System.out.println("UserController.login():开始用户登录");
        return "登录成功";
    }
    @PostMapping("/update")
    public String update(){
        System.out.println("UserController:update():开始更新用户信息");
        return "更新成功";
    }
    @PostMapping("/delete")
    public String delete(){
        System.out.println("UserController:delete():开始删除用户信息");
        return "删除成功";
    }
}
