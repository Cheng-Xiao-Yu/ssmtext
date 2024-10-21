package com.tedu.weibo.mapper;

import com.tedu.weibo.pojo.entity.Blog;
import com.tedu.weibo.pojo.vo.BlogIndexVO;
import com.tedu.weibo.pojo.vo.WeiboDetailVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface BlogMapper {
    int insert(Blog blog);
    List<BlogIndexVO>findAll();
    WeiboDetailVO findById(Integer id);
}
