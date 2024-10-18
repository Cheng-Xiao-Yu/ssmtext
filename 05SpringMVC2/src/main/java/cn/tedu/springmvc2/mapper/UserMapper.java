package cn.tedu.springmvc2.mapper;

import cn.tedu.springmvc2.pojo.entity.User;
import cn.tedu.springmvc2.pojo.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int insert(User user);
    int deleteById(Integer id);
    List<UserVO> findAll();
}
