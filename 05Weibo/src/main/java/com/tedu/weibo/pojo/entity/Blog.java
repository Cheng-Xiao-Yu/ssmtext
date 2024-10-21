package com.tedu.weibo.pojo.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Blog {
    private Integer id;
    private String content;
    private Date created;
    private Integer userId;
}
