package javaPro.homework_All.homework_2023_11_22.taski.task_7_OnlineRestaurant;

import java.util.List;

//3.11. Интерфейс Orderable:
//Методы: placeOrder(List<MenuItem> items), cancelOrder(int orderId), updateOrder(int orderId, List<MenuItem> newItems).
public interface Orderable {
    void placeOrder(List<MenuItem> items);
    void cancelOrder(int orderId);
    void updateOrder(int orderId, List<MenuItem> newItems);
}
