package demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
@Value("王克晶")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
@Value("18")
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
