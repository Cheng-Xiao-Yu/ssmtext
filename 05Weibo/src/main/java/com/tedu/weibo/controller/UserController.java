package com.tedu.weibo.controller;

import com.tedu.weibo.mapper.UserMapper;
import com.tedu.weibo.pojo.dto.UserLoginDTO;
import com.tedu.weibo.pojo.dto.UserRegDTO;
import com.tedu.weibo.pojo.entity.User;
import com.tedu.weibo.pojo.vo.UserVO;
import com.tedu.weibo.result.JsonResult;
import com.tedu.weibo.result.Status;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
@Slf4j
@RestController
@RequestMapping("/v1/users")
@Api(tags="用户模块")
public class UserController {
    private Map<String,User> users = new HashMap<>();
    @Autowired
    private UserMapper userMapper;
    @PostMapping("/reg")
    @ApiOperation("用户注册")
    public JsonResult addUser(@RequestBody UserRegDTO userRegDTO){
        log.trace("UserController:addUser()");
        log.info("UserController:用户处理功能");
        log.debug("UserRegDTO:"+userRegDTO);
        User user=new User();
        BeanUtils.copyProperties(userRegDTO,user);
        user.setCreated(new Date());
        log.debug("User:"+user);
        if(userMapper.findByUsername(userRegDTO.getUsername())!=null){
            return new JsonResult(Status.USERNAME_EXISTS);
        }
        userMapper.insert(user);
        System.out.println(userRegDTO);


        //
        return JsonResult.success();
    }
    @PostMapping("/login")
    @ApiOperation("用户登录")
    public JsonResult login(@RequestBody @Validated UserLoginDTO userLoginDTO, @ApiIgnore HttpSession session){
        /*
            登录:
            1:首先我们根据登录的用户名查询表中对应的记录
            2:如果记录存在
                2.1:用登录输入的密码和该用户注册时的密码比对一致则登录成功，返回:1
                2.2:如果比对不一致，密码错误，返回:2
            3:如果没有该记录，说明用户名错误，返回:3
         */
        User user = userMapper.findByUsername(userLoginDTO.getUsername());
        if(user!=null){//该用户存在(用户名正确)
            if(user.getPassword().equals(userLoginDTO.getPassword())){//一致，密码正确，登录成功
                //将当前用户信息存入session对象
                session.setAttribute("user",user);
                return JsonResult.success();
            }else{
                return new JsonResult(Status.PASSWORD_ERROR);
            }
        }else{
            return new JsonResult(Status.USERNAME_ERROR);//用户名错误
        }
    }
    @GetMapping("/currentUser")
    @ApiOperation("查看登录信息")
    public JsonResult currentUser(@ApiIgnore HttpSession session){
        //问题:该方法无法单独得知此用户是否登录过，要联合login方法
        User user = (User)session.getAttribute("user");
        System.out.println("当前登录用户信息是:"+user);
        if(user==null){
            return new JsonResult(Status.NOT_LOGIN);
        }
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(user,userVO);
        return JsonResult.success(userVO);
    }

    @GetMapping("/logout")
    @ApiOperation("用户登出")
    public JsonResult logout(@ApiIgnore HttpSession session){
        session.removeAttribute("user");
        return JsonResult.success();
    }
}
