package com.tedu.egmvcboot.mapper;

import com.tedu.egmvcboot.pojo.entity.Article;
import com.tedu.egmvcboot.pojo.entity.User;
import com.tedu.egmvcboot.pojo.vo.ArticleVO;
import com.tedu.egmvcboot.pojo.vo.UserVO;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
     void insert(User user);
     User findByUsername(String username);
     UserVO selectUser(@Param("username") String username, @Param("password")String password);
     void insertArticle(Article article);
     ArticleVO selectByArticleId(Integer id);
}
