import java.util.Scanner;

public class Shop {

    // Избегание магических чисел: все команды вынесены в именованные константы
    private static final int EXIT = 0;
    private static final int SHOW_PRODUCTS = 1;
    private static final int FILTER_BY_PRICE = 2;
    private static final int MAKE_ORDER = 3;
    
    // Single Responsibility Principle: Shop управляет только взаимодействием с пользователем
    private final Catalog catalog = new Catalog();
    private final Cart cart = new Cart();
    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("1 - Товары");
            System.out.println("2 - Фильтр по цене");
            System.out.println("3 - Заказ");
            System.out.println("0 - Выход");

            int cmd = scanner.nextInt();

            if (cmd == EXIT) return;
            if (cmd == SHOW_PRODUCTS) catalog.show();
            if (cmd == FILTER_BY_PRICE) filter();
            if (cmd == MAKE_ORDER) order();
        }
    }

    private void filter() {
        System.out.print("Макс цена: ");
        double price = scanner.nextDouble();

        // Strategy + DIP:
        // передаётся стратегия фильтрации через интерфейс ProductFilter
        catalog.showFiltered(p -> p.getPrice() <= price);
    }

    private void order() {
        Order order = new Order(cart.getAll());
        order.showStatus();
    }
}
