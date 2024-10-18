package com.tedu._05springmvc.controller;

import com.tedu._05springmvc.mapper.UserInfoMapper;
import com.tedu._05springmvc.pojo.dto.UserDTO;
import com.tedu._05springmvc.pojo.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @RequestMapping("/reg")
    @ResponseBody
    public String reg(UserDTO userDTO){
        UserInfo userInfo=new UserInfo();
        userInfo.setUsername(userDTO.getUsername());
        userInfo.setPassword(userDTO.getPassword());
        userInfo.setNickname(userDTO.getNickname());
        userInfo.setAge(userDTO.getAge());
        int num=userInfoMapper.insertUserInfo(userInfo);
        return num>0?"注册成功":"注册失败";
    }
    /*public String reg(UserDTO userDTO){

        System.out.println(userDTO);

        return "注册成功";
    }*/

}
