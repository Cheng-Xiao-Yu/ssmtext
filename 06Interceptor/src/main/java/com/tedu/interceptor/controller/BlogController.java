package com.tedu.interceptor.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {
    @PostMapping("/weibo/add")
    public String addBlog(){
        System.out.println("BlogController:addBlog");
        return "发表成功";
    }
}
