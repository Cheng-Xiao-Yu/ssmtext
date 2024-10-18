package Demo41;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Person {
    @Resource//(name="swether")
    //@Qualifier("winter")
    private Clothes sweater;

    @Override
    public String toString() {
        return "Person{" +
                "clothes=" + sweater +
                '}';
    }
}
