package javaPro.homework_210823.homework_20_11_2023.orderManagementSystem;

import java.util.Arrays;

//Менеджер Заказов (OrderManager)
//Поля: список доступных товаров (массив), список заказов (массив).
//Методы: обработка нового заказа, обновление статуса заказа.
public class OrderManager {
    private Product[] availableProducts;
    private Order[] orders;

    public OrderManager(Product[] availableProducts, Order[] orders) {
        this.availableProducts = availableProducts;
        this.orders = orders;
    }

    public Product[] getAvailableProducts() {
        return availableProducts;
    }

    public void setAvailableProducts(Product[] availableProducts) {
        this.availableProducts = availableProducts;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "OrderManager{" +
                "availableProducts=" + Arrays.toString(availableProducts) +
                ", orders=" + Arrays.toString(orders) +
                '}';
    }

    public void processNewOrder(Order newOrder) {
        orders = Arrays.copyOf(orders, orders.length + 1);
        orders[orders.length - 1] = newOrder;

        updateAvailableProducts(newOrder);
    }

    private void updateAvailableProducts(Order order) {
        Product[] orderProducts = order.getProducts();

        for (Product orderProduct : orderProducts) {
            for (Product availableProduct : availableProducts) {
                if (availableProduct.getProductName().equals(orderProduct.getProductName())) {
                    availableProduct.updateStock(orderProduct.getProductCount());
                    break;
                }
            }
        }
    }
}

