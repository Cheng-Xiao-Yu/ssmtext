package demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//@PropertySource("classpath:")
public class Person {
    //@Value()
    @Autowired
    @Qualifier("winter")
    private Clothes clothes;

    @Override
    public String toString() {
        return "Person{" +
                "clothes=" + clothes +
                '}';
    }
}
