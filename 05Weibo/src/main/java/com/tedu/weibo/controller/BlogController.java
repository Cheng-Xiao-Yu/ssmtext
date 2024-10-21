package com.tedu.weibo.controller;

import com.tedu.weibo.mapper.BlogMapper;
import com.tedu.weibo.pojo.dto.WeiboDTO;
import com.tedu.weibo.pojo.entity.Blog;
import com.tedu.weibo.pojo.entity.User;
import com.tedu.weibo.pojo.vo.BlogIndexVO;
import com.tedu.weibo.pojo.vo.WeiboDetailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/v1/weibo")
public class BlogController {
    @Autowired
    private BlogMapper blogMapper;
    @PostMapping("/insert")
    public int addBlog(@RequestBody WeiboDTO weiboDTO, HttpSession session){
        User user=(User)session.getAttribute("user");
        if (user==null){
            return 2;
        }
        Blog blog=new Blog();
        blog.setContent(weiboDTO.getContent());
        blog.setCreated(new Date());
        blog.setUserId(user.getId());
        blogMapper.insert(blog);
        return 1;
    }
    @GetMapping("/selectIndex")
    public List<BlogIndexVO> findIndexBlog(){
        return blogMapper.findAll();
    }
    @GetMapping("/selectById")
    public WeiboDetailVO findById(Integer id){
        return blogMapper.findById(id);
    }
}
