package com.tedu.egmvcboot.pojo.entity;

import io.swagger.models.auth.In;
import lombok.Data;

@Data
public class Article {
    private Integer id;
    private String title;
    private String content;
    private Integer userId;
}
