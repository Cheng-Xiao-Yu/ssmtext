package com.tedu.weibo.pojo.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserVO {
    @ApiModelProperty(value = "用户ID",required = true,example = "1")
    private Integer id;
    @ApiModelProperty(value = "用户昵称",required = true,example = "晶晶")
    private String nickname;
    @ApiModelProperty(value = "密码",required = true,example = "123456")
    private String password;
}
