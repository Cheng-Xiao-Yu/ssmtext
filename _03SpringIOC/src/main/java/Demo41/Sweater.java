package Demo41;

import org.springframework.stereotype.Component;

@Component//("winter")
public class Sweater implements Clothes{
    @Override
    public String toString() {
        return "Sweater{毛衣}";
    }
}
