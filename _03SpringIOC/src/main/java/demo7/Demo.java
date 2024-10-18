package demo7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext c=new AnnotationConfigApplicationContext("demo7");
        Person p=c.getBean(Person.class);
        System.out.println("通过Spring容器获取了person对象"+p);
        System.out.println("关闭了Spring容器");
        c.close();
    }
}
