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
        log.trace("");
        log.debug("");
        log.info("info");
        log.warn("warn");
        log.error("error");
    }
}
