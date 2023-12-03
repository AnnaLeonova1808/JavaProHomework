package javaPro.homework_All.homework_2023_11_22.taski.task_7_OnlineRestaurant;

import java.util.ArrayList;
import java.util.List;

//3.8. Класс OrderManager:
//Поля: List<Order> pendingOrders, Kitchen kitchen, DeliveryService deliveryService.
//Методы для управления заказами.
public class OrderManager {
    private List <Order> pendingOrders;
    private Kitchen kitchen;
    private DeliveryService deliveryService;

    public OrderManager(List<Order> pendingOrders, Kitchen kitchen, DeliveryService deliveryService) {
        this.pendingOrders = new ArrayList<>();
        this.kitchen = kitchen;
        this.deliveryService = deliveryService;
    }

    public List<Order> getPendingOrders() {
        return pendingOrders;
    }

    public void setPendingOrders(List<Order> pendingOrders) {
        this.pendingOrders = pendingOrders;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public DeliveryService getDeliveryService() {
        return deliveryService;
    }

    public void setDeliveryService(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @Override
    public String toString() {
        return "OrderManager{" +
                "pendingOrders=" + pendingOrders +
                ", kitchen=" + kitchen +
                ", deliveryService=" + deliveryService +
                '}';
    }
    public void addOrder(Order order) {
        pendingOrders.add(order);
        System.out.println("Заказ " + order.getOrderId() + " добавлен в список ожидающих заказов.");
    }

    public void removeOrder(Order order) {
        pendingOrders.remove(order);
        System.out.println("Заказ " + order.getOrderId() + " удален из списка ожидающих заказов.");
    }
}
