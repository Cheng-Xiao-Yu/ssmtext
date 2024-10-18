package test2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:student.properties")
public class Student {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private int age;
    @Value("${gender}")
    private String gender;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
