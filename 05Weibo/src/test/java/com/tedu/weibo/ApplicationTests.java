package com.tedu.weibo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Date;
@Slf4j
@SpringBootTest
class ApplicationTests {

    @Test
    void testSimpleDateFormat() {
        Date now=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd号 HH点mm分ss秒");
        String line=sdf.format(now);
        System.out.println(line);
    }
    @Test
    void testLog(){
        log.trace("trace输出");
        log.debug("debug输出");
        log.info("info");
        log.warn("warn");
        log.error("error");
    }
    @Test
    void testCN(){
        int sum=0;

        for(char c='\u4e00';c<='\ucfa5';c++){
            System.out.print(c);
            sum++;
            if (sum%30==0)
                System.out.println();
        }
    }
}
