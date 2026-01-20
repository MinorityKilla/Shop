import java.util.List;

public class Order {

     // SRP: класс отвечает только за заказ и его состояние
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
