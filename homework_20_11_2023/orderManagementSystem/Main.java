package javaPro.homework_210823.homework_20_11_2023.orderManagementSystem;

public class Main {


    public static void main(String[] args) {
        Product [] productList = new Product[3];
        productList [0] = new Product("A", (double) 5, (double) 1);
        productList [1] = new Product("B", (double) 4, (double) 2);
        productList [2] = new Product("C", (double) 3, (double) 3);

        Order [] order = new Order[3];
        order [0] = new Order(productList, "завершенный", 5);
        order [1] = new Order(productList, "завершенный", 5);
        order [2] = new Order(productList, "завершенный", 5);

        Product[] newProduct = new Product[]{new Product("D", (double) 2, (double) 1)};
        order[0].addProductToOrder(newProduct);
        System.out.println(order[0]);

        order[0].calculateTotalAmount(order);
        System.out.println("Общая стоимость: " + order[0].getTotalAmount());

        Product productToUpdate = productList[0];
        if (productToUpdate.updateStock(2)) {
            System.out.println("Успешно обновлено количество товара." );
        } else {
            System.out.println("Не удалось обновить количество товара.");
        }

       String productNameToCheck = "A";
        if (Product.isProductAvailable(productNameToCheck, productList)) {
            System.out.println("Товар " + productNameToCheck + " есть в наличии.");
        } else {
            System.out.println("Товар " + productNameToCheck + " отсутствует в наличии.");
        }

        OrderManager orderManager = new OrderManager(productList, new Order[]{order[0]});
        Product[] newOrderProducts = new Product[]{new Product("A", 5.0, 3.0)};
        orderManager.processNewOrder(order[0]);
        System.out.println("Менеджер заказов в состоянии:" + orderManager);

        orderManager.getOrders()[0].setStatus("завершен");
        System.out.println("Менеджер заказов после обновления статуса:"+orderManager);

        Customer customer = new Customer("Anna", "anna@gogle.com", new Order[0]);
        customer.placeOrder(order[0]);
        System.out.println("Состояние клиента после создания заказа: " + customer);
        customer.cancelOrder(order[0]);
        System.out.println("Состояние клиента после отмены заказа: " + customer);

    }



}
