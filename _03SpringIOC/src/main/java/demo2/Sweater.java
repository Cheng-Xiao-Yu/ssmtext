package demo2;

import org.springframework.stereotype.Component;

@Component("winter")
public class Sweater implements Clothes{
    @Override
    public String toString() {
        return "毛衣";
    }
}
