package com.tedu.weibo.controller;

import com.tedu.weibo.mapper.BlogMapper;
import com.tedu.weibo.pojo.dto.WeiboDTO;
import com.tedu.weibo.pojo.entity.Blog;
import com.tedu.weibo.pojo.entity.User;
import com.tedu.weibo.pojo.vo.BlogIndexVO;
import com.tedu.weibo.pojo.vo.WeiboDetailVO;
import com.tedu.weibo.result.JsonResult;
import com.tedu.weibo.result.Status;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/v1/weibo")
@Api(tags="博客模块")
@Validated
public class BlogController {
    @Autowired
    private BlogMapper blogMapper;
    @PostMapping("/insert")
    @ApiOperation("发表微博")
    public JsonResult addBlog(@RequestBody WeiboDTO weiboDTO, @ApiIgnore HttpSession session){
        User user=(User)session.getAttribute("user");
        if (user==null){
            return new JsonResult(Status.NOT_LOGIN);
        }
        Blog blog=new Blog();
        blog.setContent(weiboDTO.getContent());
        blog.setCreated(new Date());
        blog.setUserId(user.getId());
        blogMapper.insert(blog);
        return JsonResult.success();
    }
    @GetMapping("/selectIndex")
    @ApiOperation("首页微博列表")
    public JsonResult findIndexBlog(){
        return JsonResult.success(blogMapper.findAll());
    }
    @GetMapping("/selectById")
    @ApiOperation("查看微博详情")
    @ApiImplicitParam(name="id",value = "博客ID",required = true,example = "1",dataType = "int")
    public JsonResult findById(@Range(min=1,max =999) Integer id){
        if (id<1){
            throw new IllegalArgumentException("ID不能<1");
        }
        return JsonResult.success(blogMapper.findById(id));
    }
    @ApiImplicitParams(
            {@ApiImplicitParam(name="id",value = "博客ID",required = true,example = "1",dataType = "int"),
            @ApiImplicitParam(name="nickname",value = "昵称",required = true,example = "克晶",dataType = "String")}
    )
    @GetMapping("/findByIdAndNickname")
    @ApiOperation("通过ID和昵称查找博客")
    public JsonResult findByIdAndNickname(Integer id,String nickname){
        return JsonResult.success();
    }
}
