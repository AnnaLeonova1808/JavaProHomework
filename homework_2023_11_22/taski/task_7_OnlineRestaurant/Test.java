package javaPro.homework_All.homework_2023_11_22.taski.task_7_OnlineRestaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        MenuItem salad = new MenuItem("Caesar Salad", 7.99, "Tomato, Parmesan, Chicken", true);
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(salad);
        Menu menu = new Menu(menuItems, "Italian Cuisine", LocalDate.now());
        menu.addMenuItem(salad);

        Customer customer = new Customer(1, "A V", "123 mmm", "326-20-87");
        Order order = new Order(1, customer, Arrays.asList(salad), 18.98, OrderStatus.PENDING);
        customer.placeOrder(order);

        Chef chef = new Chef("Chef X", 10, Arrays.asList(salad), true);
        List<Chef> chefs = Collections.singletonList(chef);

        Kitchen kitchen = new Kitchen(chefs, new ArrayList<>(), true);

        DeliveryService deliveryService = new DeliveryService(new ArrayList<>(), new ArrayList<>(), true);
        OrderManager orderManager = new OrderManager(new ArrayList<>(), kitchen, deliveryService);
        orderManager.addOrder(order);
        DeliveryPerson deliveryPerson = new DeliveryPerson("DG", "AAA", true, new ArrayList<>());
        List<DeliveryPerson> deliveryPeople = Collections.singletonList(deliveryPerson);
    }
}
