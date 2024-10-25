package com.tedu.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class SystoutAspect {
    @Before("execution(public * com.tedu.aop.Calculator.*(..))")
    public void before(JoinPoint joinPoint){
        /*System.out.println("Target:"+joinPoint.getTarget());
        System.out.println("类名："+joinPoint.getTarget().getClass().getSimpleName());
        System.out.println("方法签名："+joinPoint.getSignature());
        System.out.println("实参列表："+ Arrays.toString(joinPoint.getArgs()));
        System.out.println("切面类在调用方法之前被调用了！！！");*/
        System.out.println(joinPoint.getTarget().getClass().getSimpleName()+"."+joinPoint.getSignature().getName()+"():开始执行");
    }
    @AfterReturning(value="execution(public * com.tedu.aop.Calculator.*(..))",returning = "returnValue")
    public void afterReturning(JoinPoint joinPoint,Object returnValue){
        //System.out.println("方法调用完毕并返回结果后调用到切面了！");
        System.out.println(joinPoint.getTarget().getClass().getSimpleName()+"."+joinPoint.getSignature().getName()+"():执行完毕,返回值为："+returnValue);
    }
    @After("execution(public * com.tedu.aop.Calculator.*(..))")
    public void after(JoinPoint joinPoint){
        System.out.println(joinPoint.getTarget().getClass().getSimpleName()+"."+joinPoint.getSignature().getName()+"():执行完毕");
    }
    @AfterThrowing(value = "execution(public * com.tedu.aop.Calculator.*(..))",throwing = "e")
    public void afterThrowing(JoinPoint joinPoint,Exception e){
        System.out.println(joinPoint.getTarget().getClass().getSimpleName()+"."+joinPoint.getSignature().getName()+"():抛出异常了,异常为:"+e.getMessage());
    }
}
