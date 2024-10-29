package com.tedu.weibo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LogAspect {
    @Before("execution(public com.tedu.weibo.result.JsonResult com.tedu.weibo.controller.*.*(..))")
    public void before(JoinPoint joinPoint){
        String className=joinPoint.getClass().getSimpleName();
        String methodName=joinPoint.getSignature().getName();
        log.info(className+"."+methodName+"():开始执行。。。");
    }
    @AfterReturning(value = "execution(public com.tedu.weibo.result.JsonResult com.tedu.weibo.controller.*.*(..))",returning = "o")
    public void afterReturning(JoinPoint joinPoint,Object o){
        String className=joinPoint.getClass().getSimpleName();
        String methodName=joinPoint.getSignature().getName();
        log.info(className+"."+methodName+"():执行完毕,返回："+o);
    }
    @AfterThrowing(value = "execution(public com.tedu.weibo.result.JsonResult com.tedu.weibo.controller.*.*(..))",throwing = "e")
    public void afterThrowing(JoinPoint joinPoint,Exception e){
        String className=joinPoint.getClass().getSimpleName();
        String methodName=joinPoint.getSignature().getName();
        log.error(className+"."+methodName+"():执行完毕,抛出："+e.getMessage());
    }
}
