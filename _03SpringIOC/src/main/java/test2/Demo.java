package test2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("test2");
        Student s=context.getBean(Student.class);
        System.out.println(s);
    }


}
