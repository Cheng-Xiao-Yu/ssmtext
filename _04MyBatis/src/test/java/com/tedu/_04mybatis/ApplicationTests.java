package com.tedu._04mybatis;

import com.tedu._04mybatis.mapper.BlogMapper;
import com.tedu._04mybatis.mapper.CommentMapper;
import com.tedu._04mybatis.mapper.UserMapper;
import com.tedu._04mybatis.pojo.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class ApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private BlogMapper blogMapper;
    @Autowired
    private CommentMapper commentMapper;
    @Test
    void testUserMapperInsert() {

        System.out.println(userMapper);
        User user=new User();
        user.setUsername("范传奇");
        user.setPassword("123456");
        user.setNickname("奇奇");
        user.setCreated(new Date());
        int num=userMapper.insert(user);
        if (num>0){
            System.out.println("插入成功");
        }else{
            System.out.println("插入失败");
        }
    }
    @Test
    void testBlogMapperInsert() {
        System.out.println(blogMapper);
        Blog blog=new Blog();
        blog.setContent("范传奇6");
        //blog.setCreated("123456");
        blog.setUserId(1);
        blog.setCreated(new Date());
        int num=blogMapper.Insert(blog);
        if (num>0){
            System.out.println("插入成功");
        }else{
            System.out.println("插入失败");
        }
    }
    @Test
    void testBlogMapperDelete(){
        int num=blogMapper.deleteById(1);
        System.out.println(num>0?"删除成功":"删除失败");
    }
    @Test
    void testUpdateBlog(){
        Blog blog=new Blog();
        blog.setId(3);
        blog.setContent("hello");
        blog.setCreated(new Date());
        blog.setUserId(456);
        int num=blogMapper.updateById(blog);
        System.out.println(num>0?"更新成功":"更新失败");
    }
@Test
    void testSelectBlog(){
        Blog blog=blogMapper.selectById(2);
        System.out.println(blog);
}
@Test
    void testSelectAllBlog(){
    List<Blog>list=blogMapper.selectAll();
    for(Blog list1:list){
        System.out.println(list1);
    }
}
@Test
    void testSelectVO1(){
    BlogVO1 vo1= blogMapper.selectBlogVO1ById(2);
    System.out.println(vo1);
}
    @Test
    void testSelectVO2(){
        BlogVO2 vo2= blogMapper.selectBlogVO2ById(2);
        System.out.println(vo2);
    }
    @Test
    void testInsertComment(){
        Comment c=new Comment();
        c.setBlogId(10);
        c.setContent("我是第一333");
        c.setCreated(new Date());
        c.setUserId(122);
        int num= commentMapper.insertComment(c);
        System.out.println(num>0?"插入成功":"插入失败");
    }
    @Test
    void testDeleteComment(){
        int num=commentMapper.deleteCommentById(2);
        System.out.println(num>0?"删除成功":"删除失败");
    }
    @Test
    void testUpdateCommentById(){
        Comment c=new Comment();
        c.setId(1);
        c.setBlogId(1111);
        c.setContent("沙什么发666");
        c.setCreated(new Date());
        c.setUserId(2233);
        int num= commentMapper.updateCommentById(c);
        System.out.println(num>0?"插入成功":"插入失败");
    }
    @Test
    void testSelectById(){
        CommentVO1 c=commentMapper.selectCommentById(3);
        System.out.println(c);
    }
    @Test
    void testSelectCommentByUSerId(){
        List<Comment>c=commentMapper.selectCommentByUserId(43);
        for (Comment c1:c){
            System.out.println(c1);
        }
    }
    @Test
    void testDynamicUpdateBlog(){
        Blog blog=new Blog();
        blog.setId(2);
        blog.setContent("今天周三");
        System.out.println(blog);
        int num=blogMapper.dynamicUpdateBlogById(blog);
        System.out.println(num>0?"修改成功":"修改失败");
    }
    @Test
    void testDynamicDeleteBlog(){
        Integer[]a={4,5};
        int num=blogMapper.dynamicDeleteBlogById(a);
        System.out.println("删除了"+num+"条记录");
    }
    @Test
    void testDynamicDeleteBlog2(){
        List<Integer>a=new ArrayList<>();
        a.add(7);
        a.add(8);
        int num=blogMapper.dynamicDeleteBlogById2(a);
        System.out.println("删除了"+num+"条记录");
    }@Test
    void testBlogResultMap(){
        BlogVO3 blogVO3=blogMapper.selectResultMap(9);
        System.out.println(blogVO3);
    }
    @Test
    void testSelectUserAndBlog(){
        UserVO1 userVO1= userMapper.selectUserAndBlogById(1);
        System.out.println(userVO1);
    }
    @Test
    void testBlogAndCommentById(){
        BlogVO4 blogVO4= blogMapper.selectBlogAndCommentById(10);
        System.out.println(blogVO4);
    }
    @Test
    void testCountBlog(){
        int count= blogMapper.countBlog();
        System.out.println("一共"+count+"条语句");
    }
    }

