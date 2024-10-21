package com.tedu.weibo.mapper;


import com.tedu.weibo.pojo.entity.Comment;
import com.tedu.weibo.pojo.vo.CommentDetailVO;

import java.util.List;

public interface CommentMapper {
    int insert(Comment comment);
    List<CommentDetailVO>findByWeiboId(Integer id);
}
