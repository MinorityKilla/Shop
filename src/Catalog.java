import java.util.List;

public class Catalog {

     // Single Responsibility Principle: класс отвечает только за хранение и вывод товаров
    private final List<Product> products = List.of(
            new Product("Телефон", 500),
            new Product("Ноутбук", 1200),
            new Product("Наушники", 150)
    );

    public void show() {

         // Don't Repeat Yourself: единый способ вывода товаров
        products.forEach(System.out::println);
    }

    public void showFiltered(ProductFilter filter) {

        // OCP:
        // каталог не изменяется при добавлении новых фильтров
        // LSP:
        // любая реализация ProductFilter может быть подставлена
        products.stream().filter(filter::check).forEach(System.out::println);
    }
}
