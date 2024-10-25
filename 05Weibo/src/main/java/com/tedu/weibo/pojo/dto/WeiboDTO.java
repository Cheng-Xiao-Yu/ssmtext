package com.tedu.weibo.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
/*@AllArgsConstructor
@NoArgsConstructor*/
public class WeiboDTO {
    @ApiModelProperty(value = "博客内容",required = true,example = "我又发了一条微博")
private String content;
}
