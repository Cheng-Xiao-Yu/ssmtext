package demo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("Demo2");
        Person p=context.getBean(Person.class);
        System.out.println(p);
    }



}
