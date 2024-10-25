package com.tedu.weibo.exception;

import com.tedu.weibo.result.JsonResult;
import com.tedu.weibo.result.Status;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    /*@ExceptionHandler
    //@ResponseBody
    public JsonResult doHandleRuntimeException(RuntimeException e){
        System.out.println("出现了RuntimeException!");
        return new JsonResult(Status.UNKNOWN_ERROR);
    }*/
    @ExceptionHandler
    public JsonResult doHandleIllegalArgumentException(IllegalArgumentException e){
        System.out.println("出现了参数不合法异常");
        System.out.println(e.getMessage());

        return new JsonResult(Status.OPERATION_FAIL,e.getMessage());
    }
    @ExceptionHandler
    public JsonResult doHandlerException(Exception e){
        log.error(e.getMessage(),e);
        return new JsonResult(Status.UNKNOWN_ERROR,e.getMessage());
    }
    @ExceptionHandler
    public JsonResult doHandleMethodArgumentNotValidException(MethodArgumentNotValidException e){
        String message1=e.getFieldError().getDefaultMessage();
        log.warn(message1,e);
        return new JsonResult(Status.VALIDATE_FAILED,message1);
    }
    @ExceptionHandler
    public JsonResult doHandleConstraintViolationException(ConstraintViolationException e){
        log.warn(e.getMessage(),e);
        return new JsonResult(Status.OPERATION_FAIL,e.getMessage().substring(e.getMessage().indexOf(":")+1).trim());
    }
}
