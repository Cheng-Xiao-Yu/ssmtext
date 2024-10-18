package Demo3;

import Demo3.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("Demo3");
        UserController userController=context.getBean(UserController.class);
        userController.doLogin();
    }
}
