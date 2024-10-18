package test1;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("test1");
        Student student=context.getBean(Student.class);
        student.study();

    }
}
