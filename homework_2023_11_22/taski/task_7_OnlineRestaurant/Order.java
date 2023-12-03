package javaPro.homework_All.homework_2023_11_22.taski.task_7_OnlineRestaurant;

import java.util.List;

//3.4. Класс Order:
//Поля: int orderId, Customer customer, List<MenuItem> orderedItems, double totalCost, OrderStatus status.
//Реализация интерфейса Orderable.
public class Order implements Orderable {
    private int orderId;
    private Customer customer;
    private List<MenuItem> orderedItems;
    private double totalCost;
    private OrderStatus status;

    public Order(int orderId, Customer customer, List<MenuItem> orderedItems, double totalCost, OrderStatus status) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderedItems = orderedItems;
        this.totalCost = totalCost;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<MenuItem> getOrderedItems() {
        return orderedItems;
    }

    public void setOrderedItems(List<MenuItem> orderedItems) {
        this.orderedItems = orderedItems;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customer=" + customer +
                ", orderedItems=" + orderedItems +
                ", totalCost=" + totalCost +
                ", status=" + status +
                '}';
    }

    @Override
    public void placeOrder(List<MenuItem> items) {
        System.out.println("Заказ успешно размещен.");
    }

    @Override
    public void cancelOrder(int orderId) {
        System.out.println("Ошибка: Неверный номер заказа.");
    }

    @Override
    public void updateOrder(int orderId, List<MenuItem> newItems) {
        orderedItems.addAll(newItems);
        System.out.println("Заказ успешно обновлен.");
    }

    public void calculateTotalCost() {
        totalCost = 0.0;
        for (MenuItem item : orderedItems) {
            totalCost += item.getPrice();
        }
    }
}
