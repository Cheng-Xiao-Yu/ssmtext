/*
package com.tedu.springmvc3.controller;

import com.tedu.springmvc3.mapper.UserMapper;
import com.tedu.springmvc3.pojo.dto.UserDTO;
import com.tedu.springmvc3.pojo.entity.User;
import com.tedu.springmvc3.pojo.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/users/reg")
//    @ResponseBody
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

    */
/**
     * http://localhost:8080/users/delete?id=5
     * 删除id为5的用户
     *
     * @return
     *//*

    @RequestMapping("/users/delete")
//    @ResponseBody
    public String delete(int id){
        System.out.println("删除用户id为:"+id+"的记录");
        int num = userMapper.deleteById(id);
        return num>0?"删除成功":"删除失败";
    }

    */
/**
     * 根据用户名修改用户信息(可以修改密码，修改昵称)
     * @return
     *//*

    @RequestMapping("/users/update")
//    @ResponseBody
    public String update(UserDTO userDTO){
        System.out.println(userDTO);
        User user = new User();
        BeanUtils.copyProperties(userDTO,user);
        System.out.println(user);
        int num = userMapper.updateByUsername(user);
        return num>0?"修改成功":"修改失败";
    }
    @RequestMapping("/users/findAll")
    public List<UserVO> findAll(){
        return userMapper.findAll();
    }
}
*/
