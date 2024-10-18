package cn.tedu.springmvc2.controller;

import cn.tedu.springmvc2.mapper.UserMapper;
import cn.tedu.springmvc2.pojo.dto.UserDTO;
import cn.tedu.springmvc2.pojo.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 处理与用户相关的请求操作
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    /**
     *  和用户相关操作大致会包含:注册，登录，修改，删除
     *
     *  http://localhost:8080/users/reg?参数...
     *  http://localhost:8080/users/login?参数...
     *  http://localhost:8080/users/update?参数...
     *  ...                        /delete?参数...
     *
     *  和博客相关的
     *  http://localhost:8080/blog/write
     */
    @RequestMapping("/users/reg")
    //@ResponseBody
    public String reg(UserDTO userDTO){
        System.out.println(userDTO);
        return "注册成功";
    }

    @RequestMapping("/users/delete")
    //@ResponseBody
    public String delete(){
        return "删除用户";
    }

    @RequestMapping("/users/update")
    //@ResponseBody
    public String update(){
        return "修改用户";
    }
    @RequestMapping("/users/delete")
    //@ResponseBody
    public String delete(int id){
        System.out.println("删除用户id为："+id+"条记录");
        int num= userMapper.deleteById(id);
        return num>0?"删除成功":"删除失败";
    }
    @RequestMapping("/users/findAll")
    public List<UserVO> findAll(){
        return userMapper.findAll();
    }

}
