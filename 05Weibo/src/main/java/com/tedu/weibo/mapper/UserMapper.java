package com.tedu.weibo.mapper;

import com.tedu.weibo.pojo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insert(User user);
    User findByUsername(String username);
}
