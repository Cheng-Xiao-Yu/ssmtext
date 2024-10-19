package com.tedu.springmvc4.mapper;

import com.tedu.springmvc4.pojo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insert(User user);
}
