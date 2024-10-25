package com.tedu.egmvcboot.exception;

import com.tedu.egmvcboot.result.JsonResult;
import com.tedu.egmvcboot.result.Status;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public JsonResult doHandleIllegalArgumentException(IllegalArgumentException e){
        System.out.println("出现了参数不合法异常");
        return new JsonResult(Status.OPERATION_FAILED,e.getMessage());
    }
    @ExceptionHandler
    public JsonResult doHandleException(Exception e){
        log.error(e.getMessage(),e);
        return new JsonResult(Status.OPERATION_FAILED,e.getMessage());
    }
    @ExceptionHandler
    public JsonResult doHandleMethodArgumentNotValidException(MethodArgumentNotValidException e){
        log.warn(e.getFieldError().getDefaultMessage());
        return new JsonResult(Status.VALIDATED_ERROR,e.getFieldError().getDefaultMessage());
    }
    @ExceptionHandler
    public JsonResult doHandleConstraintViolationException(ConstraintViolationException e){
        log.warn(e.getMessage());
        return new JsonResult(Status.OPERATION_FAILED,e.getMessage());
    }
}
