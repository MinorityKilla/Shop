import java.util.List;

public class Order {
    private final List<Product> products;
    private Status status = Status.CREATED;

    public Order(List<Product> products) {
        this.products = products;
    }

    public void showStatus() {
        status = Status.SHIPPED;
        System.out.println("Статус заказа: " + status);
    }
}
