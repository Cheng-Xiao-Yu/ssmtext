package com.tedu.egweibo.mapper;

import com.tedu.egweibo.pojo.dto.UserDTO;
import com.tedu.egweibo.pojo.entity.User;

public interface UserMapper {
    int insert(User user);
    User findByUsername(String username);
}
