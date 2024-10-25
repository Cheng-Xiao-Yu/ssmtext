package com.tedu.weibo.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.*;

@Data
public class UserLoginDTO {
    @ApiModelProperty(value = "用户名",required = true,example = "王克晶")
    @NotBlank(message = "用户名输错了，输的空格")
    //@Size(min=3,max=15,message = "用户名必须在3-15个字符之间")
    @Pattern(regexp = "^[\\u4e00-\\u9fa5a-zA-Z0-9_]{3,15}$",message = "只能是中文，字母，数字，下划线，长度在3-15之间")
    private String username;
    @ApiModelProperty(value = "密码",required = true,example = "123456")
    private String password;
}
