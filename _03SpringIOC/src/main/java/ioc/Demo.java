package ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) throws Exception {
        User user=new User();
        user.sayHello();
        Class c=Class.forName("ioc.User");
        User user1=(User) c.newInstance();
        user1.sayHello();
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("ioc");
        User user2=context.getBean(User.class);
        user2.sayHello();
    }
}
