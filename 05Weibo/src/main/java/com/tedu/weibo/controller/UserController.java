package com.tedu.weibo.controller;

import com.tedu.weibo.mapper.UserMapper;
import com.tedu.weibo.pojo.dto.UserRegDTO;
import com.tedu.weibo.pojo.entity.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/v1/users")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @PostMapping("/reg")
    public int addUser(@RequestBody UserRegDTO userRegDTO){

        User user=new User();
        BeanUtils.copyProperties(userRegDTO,user);
        user.setCreated(new Date());
        userMapper.insert(user);
        System.out.println(userRegDTO);

        if(userMapper.findByUsername(userRegDTO.getUsername())!=null){
        return 2;
        }
        //
        return 1;
    }
}
