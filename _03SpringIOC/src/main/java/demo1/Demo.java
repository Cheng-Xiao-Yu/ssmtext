package demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("demo1");
        UserDAO userDAO =context.getBean(UserDAO.class);
        System.out.println(userDAO);
        Person person=context.getBean(Person.class);
        System.out.println(person);
    }
}
