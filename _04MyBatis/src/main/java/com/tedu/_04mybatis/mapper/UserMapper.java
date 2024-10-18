package com.tedu._04mybatis.mapper;

import com.tedu._04mybatis.pojo.User;
import com.tedu._04mybatis.pojo.UserVO1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    @Insert(
            "INSERT INTO user(username,password,nickname,created)"+
                    "VALUE (#{username},#{password},#{nickname},#{created})"
    )
    int insert(User user);
    UserVO1 selectUserAndBlogById(Integer id);
}
