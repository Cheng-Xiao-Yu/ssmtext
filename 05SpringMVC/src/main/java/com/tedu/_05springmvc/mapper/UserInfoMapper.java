package com.tedu._05springmvc.mapper;

import com.tedu._05springmvc.pojo.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserInfoMapper {
    int insertUserInfo(UserInfo userInfo);
}
