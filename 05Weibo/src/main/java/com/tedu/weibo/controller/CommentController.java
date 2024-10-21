package com.tedu.weibo.controller;

import com.tedu.weibo.mapper.CommentMapper;
import com.tedu.weibo.pojo.dto.CommentDTO;
import com.tedu.weibo.pojo.entity.Blog;
import com.tedu.weibo.pojo.entity.Comment;
import com.tedu.weibo.pojo.entity.User;
import com.tedu.weibo.pojo.vo.CommentDetailVO;
import com.tedu.weibo.pojo.vo.WeiboDetailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/v1/comment")
public class CommentController {
    @Autowired
    private CommentMapper commentMapper;
@PostMapping("/insert")
    public int addComment(@RequestBody CommentDTO commentDTO, HttpSession session){
    User user=(User)session.getAttribute("user");
    if (user==null){
        return 2;
    }
    Comment comment=new Comment();
    comment.setContent(commentDTO.getContent());
    comment.setCreated(new Date());
    comment.setUserId(user.getId());
    comment.setBlogId(commentDTO.getWeiboId());
    commentMapper.insert(comment);
    return 1;
}
@GetMapping("/selectByWeiboId")
    public List<CommentDetailVO> findByWeiboId(Integer id){
    return commentMapper.findByWeiboId(id);
}
}
