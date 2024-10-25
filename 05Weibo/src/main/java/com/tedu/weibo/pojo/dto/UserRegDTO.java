package com.tedu.weibo.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserRegDTO {
    @ApiModelProperty(value="用户名",required = true,example = "王克晶")
    private String username;
    @ApiModelProperty(value="密码",required = true,example = "123456")
    private String password;
    @ApiModelProperty(value="昵称",required = true,example = "克晶")
    private String nickname;
}
