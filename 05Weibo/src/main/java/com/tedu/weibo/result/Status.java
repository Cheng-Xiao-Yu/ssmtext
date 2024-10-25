package com.tedu.weibo.result;

import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {
    USERNAME_ERROR(1000,"用户名错误"),
    PASSWORD_ERROR(1001,"密码错误"),
    USERNAME_EXISTS(1002,"用户名被占用"),
    NOT_LOGIN(1003,"未登录"),
    OPERATION_SUCCESS(2001,"操作成功"),
    OPERATION_FAIL(2002,"操作失败"),
    UNKNOWN_ERROR(4000,"未知异常"),
    VALIDATE_FAILED(3000,"验证不通过");
    private Integer statusCode;
    private String message;
}
