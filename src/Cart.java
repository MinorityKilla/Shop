import java.util.ArrayList;
import java.util.List;

public class Cart {

    // SRP: класс отвечает только за корзину
    private final List<Product> products = new ArrayList<>();

    public List<Product> getAll() {
        return products;
    }
}
