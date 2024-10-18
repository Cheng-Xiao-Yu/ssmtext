package test1;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    private int age;
    public void study(){
        System.out.println(age+name+"sutdying");
    }
}
