package com.tedu.weibo.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CommentDTO {
    @ApiModelProperty(value = "微博ID",required = true,example = "1")
    private Integer weiboId;
    @ApiModelProperty(value = "评论内容",required = true,example = "666")
    private String content;
}
