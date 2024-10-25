package com.tedu.weibo.controller;

import com.tedu.weibo.mapper.CommentMapper;
import com.tedu.weibo.pojo.dto.CommentDTO;
import com.tedu.weibo.pojo.entity.Blog;
import com.tedu.weibo.pojo.entity.Comment;
import com.tedu.weibo.pojo.entity.User;
import com.tedu.weibo.pojo.vo.CommentDetailVO;
import com.tedu.weibo.pojo.vo.WeiboDetailVO;
import com.tedu.weibo.result.JsonResult;
import com.tedu.weibo.result.Status;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/v1/comment")
@Api(tags="评论模块")
public class CommentController {
    @Autowired
    private CommentMapper commentMapper;
@PostMapping("/insert")
@ApiOperation("发表评论")
    public JsonResult addComment(@RequestBody CommentDTO commentDTO, @ApiIgnore HttpSession session){
    User user=(User)session.getAttribute("user");
    if (user==null){
        return new JsonResult(Status.NOT_LOGIN);
    }
    Comment comment=new Comment();
    comment.setContent(commentDTO.getContent());
    comment.setCreated(new Date());
    comment.setUserId(user.getId());
    comment.setBlogId(commentDTO.getWeiboId());
    commentMapper.insert(comment);
    return JsonResult.success();
}
@GetMapping("/selectByWeiboId")
@ApiOperation("查看微博所有评论")
    public JsonResult//List<CommentDetailVO>
    findByWeiboId(Integer id){
    return JsonResult.success(commentMapper.findByWeiboId(id));
}
}
