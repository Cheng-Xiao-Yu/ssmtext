package Demo5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        /*Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        System.out.println(s1+"\n"+s2);*/
        AnnotationConfigApplicationContext c=new AnnotationConfigApplicationContext("Demo5");
        DBConnection d1=c.getBean(DBConnection.class);
        DBConnection d2=c.getBean(DBConnection.class);
        System.out.println(d1+"\n"+d2);

    }
}
