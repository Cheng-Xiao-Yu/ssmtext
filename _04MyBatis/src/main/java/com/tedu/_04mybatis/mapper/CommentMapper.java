package com.tedu._04mybatis.mapper;

import com.tedu._04mybatis.pojo.Comment;
import com.tedu._04mybatis.pojo.CommentVO1;
import org.apache.ibatis.annotations.*;

import javax.xml.crypto.Data;
import java.util.List;

/*private int id;
private String content;
private Data created;
private Integer userId;
private Integer blogId;*/
@Mapper
public interface CommentMapper {
    @Insert("INSERT INTO comment"+
    "(content,created,user_id,blog_id )  " +
            "VALUE (#{content},#{created},#{userId},#{blogId})")
    int insertComment(Comment comment);
    @Delete("DELETE FROM comment "+
    "WHERE id=#{id}")
    int deleteCommentById(Integer id);
    @Update("UPDATE comment SET content=#{content},created=#{created},user_id=#{userId},blog_id=#{blogId} " +
            "WHERE id=#{id}")
    int updateCommentById(Comment comment);
    @Select("SELECT content,user_id userId FROM comment " +
            "WHERE id=#{id}")
    CommentVO1 selectCommentById(Integer id);
    @Select("SELECT id,content,user_id userId FROM comment " +
            "WHERE user_id=#{userId}")
    List<Comment> selectCommentByUserId(Integer id);
}
