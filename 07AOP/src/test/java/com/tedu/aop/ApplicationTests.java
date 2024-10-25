package com.tedu.aop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
@Autowired
private Calculator calculator;
    @Test
    void testAOP() {
        int a=calculator.add(1,2);
        System.out.println("结果为："+a);
        int b=calculator.sub(1,2);
        System.out.println("结果为："+b);
        int c=calculator.mul(1,2);
        System.out.println("结果为："+c);
        int d=calculator.div(1,0);
        System.out.println("结果为："+d);
        double e=calculator.add(1.0,2.0);
        System.out.println("结果为："+e);
        String f=calculator.add("1","2");
        System.out.println("结果为："+f);
    }

}
