package com.tedu.egweibo.controller;

import com.tedu.egweibo.mapper.UserMapper;
import com.tedu.egweibo.pojo.dto.UserDTO;
import com.tedu.egweibo.pojo.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
@Slf4j
@RestController
@RequestMapping("v2/user")
@Api(tags = "用户板块")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @PostMapping("/reg")
    @ApiOperation("用户注册")
    public int addUser(@RequestBody UserDTO userDTO){
        if(userMapper.findByUsername(userDTO.getUsername())!=null){
            return 2;
        }
        User user=new User();
        BeanUtils.copyProperties(userDTO,user);
        user.setCreated(new Date());
        userMapper.insert(user);
        return 1;
    }
}
