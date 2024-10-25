package com.tedu.egmvcboot.controller;

import com.tedu.egmvcboot.mapper.UserMapper;
import com.tedu.egmvcboot.pojo.dto.UserArticleDTO;
import com.tedu.egmvcboot.pojo.dto.UserLoginDTO;
import com.tedu.egmvcboot.pojo.dto.UserRegistDTO;
import com.tedu.egmvcboot.pojo.entity.Article;
import com.tedu.egmvcboot.pojo.entity.User;
import com.tedu.egmvcboot.pojo.vo.ArticleVO;
import com.tedu.egmvcboot.pojo.vo.UserVO;
import com.tedu.egmvcboot.result.JsonResult;
import com.tedu.egmvcboot.result.Status;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Slf4j
@RestController
@RequestMapping("/v1/users")
public class UserController {
    @Autowired
    private UserMapper userMapper;
/*    @PostMapping("/reg")
    public JsonResult addUser(UserRegistDTO userRegistDTO){
        User user=new User();
        BeanUtils.copyProperties(userRegistDTO,user);
        user.setCreated(new Date());
        if (userMapper.findByUsername(userRegistDTO.getUsername())!=null){
            return new JsonResult(Status.OPERATION_FAILED);
        }
        userMapper.insert(user);
        return JsonResult.success();
    }*/
    @PostMapping("/login")
    public JsonResult login(@RequestBody UserLoginDTO userLoginDTO, HttpSession session){
        UserVO userVO=userMapper.selectUser(userLoginDTO.getUsername(), userLoginDTO.getPassword());
        log.debug("uservo:"+userVO);
        User user=new User();
        BeanUtils.copyProperties(userVO,user);
        user.setUsername(userLoginDTO.getUsername());
        log.debug("user:"+user);
        if (userVO!=null){
            session.setAttribute("user",user);
            return JsonResult.success(userVO);
        }else {
            return new JsonResult(Status.USERNAME_PASSWORD_ERROR);
        }
    }
    @PostMapping("/article")
    public JsonResult setArticle(@RequestBody UserArticleDTO userArticleDTO,HttpSession session){
        User user=(User)session.getAttribute("user");
        log.debug("user:"+user);
        if (user==null)
            return new JsonResult(Status.NOT_LOGIN);
        Article article=new Article();
        BeanUtils.copyProperties(userArticleDTO,article);
        article.setUserId(user.getId());
        log.debug("article"+article);
        userMapper.insertArticle(article);
        return JsonResult.success();
    }
    @GetMapping("/selectByArticleId")
    public JsonResult findArticle(Integer id){
        ArticleVO articleVO=userMapper.selectByArticleId(id);
        return JsonResult.success(articleVO);
    }
}
