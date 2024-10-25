package com.tedu.weibo.pojo.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class BlogIndexVO {
    @ApiModelProperty(value = "博客ID",required = true,example = "1")
    private Integer id;
    @ApiModelProperty(value = "博客内容",required = true,example = "这是一条博客")
    private String content;
    @ApiModelProperty(value = "用户昵称",required = true,example = "晶晶")
    private String nickname;
}
