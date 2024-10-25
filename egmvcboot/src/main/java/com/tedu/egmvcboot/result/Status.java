package com.tedu.egmvcboot.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {
    OPERATION_SUCCESS(10100,"操作成功"),
    OPERATION_FAILED(10200,"操作失败"),
    USERNAME_PASSWORD_ERROR(10300,"用户名或密码错误"),
    NOT_LOGIN(10400,"未登录"),
    VALIDATED_ERROR(10500,"参数校验失败");
    private Integer statusCode;
    private String message;
}
