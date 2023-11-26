package javaPro.homework_210823.homework_20_11_2023.orderManagementSystem;

import java.util.Arrays;

//Клиент (Customer)
//Поля: имя, email, история заказов (массив).
//Методы: сделать заказ, отменить заказ.
public class Customer {
    private String name;
    private String email;
    private Order [] orderHistory;

    public Customer(String name, String email, Order[] orderHistory) {
        this.name = name;
        this.email = email;
        this.orderHistory = orderHistory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Order[] getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(Order[] orderHistory) {
        this.orderHistory = orderHistory;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", orderHistory=" + Arrays.toString(orderHistory) +
                '}';
    }
    public void placeOrder(Order newOrder) {
        int length = orderHistory.length;
        orderHistory = Arrays.copyOf(orderHistory, length + 1);
        orderHistory[length] = newOrder;
    }
    public void cancelOrder(Order orderToCancel) {
        for (int i = 0; i < orderHistory.length; i++) {
            if (orderHistory[i] != null && orderHistory[i].equals(orderToCancel)) {
                orderHistory[i] = null;
                System.out.println("Заказ отменен: " + orderToCancel);
                return;
            }
        }
        System.out.println("Заказ не найден в истории.");
    }

}
