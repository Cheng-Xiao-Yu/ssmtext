package ioc;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class User {
    private String name;
    public void sayHello(){
        System.out.println("hello");
    }
}
