package com.tedu.redisdemo;

import com.tedu.redisdemo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class RedisDemoApplicationTests {
    @Autowired
    private RedisTemplate<String,Object>redisTemplate;
    @Test
    void contextLoads() {
        ValueOperations<String,Object>ops=redisTemplate.opsForValue();
        ops.set("hello","world");
        System.out.println(ops.get("hello"));
        User user=new User();
        user.setId(1);
        user.setUsername("王克晶");
        user.setPassword("123456");
        ops.set("王克晶",user);
        User u=(User)ops.get("王克晶");
        System.out.println(u);
        //HashOperations
    }


}
