import java.util.List;

public class Catalog {
    private final List<Product> products = List.of(
            new Product("Телефон", 500),
            new Product("Ноутбук", 1200),
            new Product("Наушники", 150)
    );

    public void show() {
        products.forEach(System.out::println);
    }

    public void showFiltered(ProductFilter filter) {
        products.stream().filter(filter::check).forEach(System.out::println);
    }
}
