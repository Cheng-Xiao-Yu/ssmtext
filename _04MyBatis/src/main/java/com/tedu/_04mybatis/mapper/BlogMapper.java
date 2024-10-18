package com.tedu._04mybatis.mapper;

import com.tedu._04mybatis.pojo.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BlogMapper {
    int Insert(Blog blog);
    int deleteById(Integer id);
    //@Update("UPDATE blog SET content=#{content},created=#{created},user_id=#{userId} "+
    //"WHERE id=#{id}")
    int updateById(Blog blog);
    /*@Select("SELECT id,content,created,user_id userId"+
    " FROM blog"+
    " WHERE id=#{id}")*/
    Blog selectById(Integer id);
    //@Select("SELECT id,content,created,user_id userId"+
    //        " FROM blog")
    List<Blog> selectAll();
    //@Select("SELECT content,created"+
     //       " FROM blog"+
     //       " WHERE id=#{id}")
    BlogVO1 selectBlogVO1ById(Integer id);
    //@Select("SELECT content,user_id userId"+
     //       " FROM blog"+
      //      " WHERE id=#{id}")
    BlogVO2 selectBlogVO2ById(Integer id);
    int dynamicUpdateBlogById(Blog blog);
    int dynamicDeleteBlogById(Integer[] ids);
    int dynamicDeleteBlogById2(List<Integer> ids);
    BlogVO3 selectResultMap(Integer id);
    BlogVO4 selectBlogAndCommentById(Integer id);
    int countBlog();
}
