package demo7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Person {
    private String name;
@Value("张三")
    public void setName(String name) {
    System.out.println("Person的name属性对应的setName方法调用了");
        this.name = name;
    }

    public Person() {
        System.out.println("构造器执行了");
    }
    @PostConstruct
    public void init(){
        System.out.println("Person对象被@PostContsruct标注的方法执行了");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("Person对象被@PreDestroy标注的方法执行了");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
