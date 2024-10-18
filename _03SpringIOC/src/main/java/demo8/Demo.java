package demo8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("demo8")
public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext c=new AnnotationConfigApplicationContext(Demo.class);
        Person p=c.getBean(Person.class);
        System.out.println(p);
    }
}
