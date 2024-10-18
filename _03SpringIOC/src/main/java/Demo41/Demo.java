package Demo41;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext c=new AnnotationConfigApplicationContext("Demo41");
        Person p=c.getBean(Person.class);
        System.out.println(p);
    }
}
