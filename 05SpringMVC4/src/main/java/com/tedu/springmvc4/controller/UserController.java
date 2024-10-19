package com.tedu.springmvc4.controller;

import com.tedu.springmvc4.mapper.UserMapper;
import com.tedu.springmvc4.pojo.dto.UserDTO;
import com.tedu.springmvc4.pojo.entity.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping(value="/users/reg",method= RequestMethod.POST)
    public String reg(UserDTO userDTO){
        System.out.println(userDTO);

        User user = new User();
//        user.setUsername(userDTO.getUsername());
//        user.setPassword(userDTO.getPassword());
//        user.setNickname(userDTO.getNickname());
        BeanUtils.copyProperties(userDTO,user);
        user.setCreated(new Date());
        System.out.println("user:"+user);

        int num = userMapper.insert(user);

        return num>0?"注册成功":"注册失败";
    }
}
