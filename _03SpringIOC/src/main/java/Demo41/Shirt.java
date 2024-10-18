package Demo41;

import org.springframework.stereotype.Component;

@Component//("summer")
public class Shirt implements Clothes{
    @Override
    public String toString() {
        return "Shirt{衬衫}";
    }
}
