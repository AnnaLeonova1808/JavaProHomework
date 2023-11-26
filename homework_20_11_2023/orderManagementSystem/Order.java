package javaPro.homework_210823.homework_20_11_2023.orderManagementSystem;

import java.util.Arrays;

//Заказ (Order)
//Поля: список товаров (массив), статус заказа, общая сумма.
//Методы: добавить товар в заказ, рассчитать общую сумму.
public class Order {
    private Product [] productList;
    private String orderStatus;
    private double totalAmount;

    public Order(Product[] productList, String orderStatus, double totalAmount) {
        this.productList = productList;
        this.orderStatus = orderStatus;
        this.totalAmount = totalAmount;
    }

    public Product[] getProductList() {
        return productList;
    }

    public void setProductList(Product[] productList) {
        this.productList = productList;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productList=" + Arrays.toString(productList) +
                ", orderStatus='" + orderStatus + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }
    public void addProductToOrder (Product [] newProducts, Product[] products){
        Product[] updatedProducts = Arrays.copyOf(products, products.length + newProducts.length);
        System.arraycopy(newProducts, 0, updatedProducts, products.length, newProducts.length);
        products = updatedProducts;
    }
    public void calculateTotalAmount(Order [] order){
        double sum = 0.0;
        for (int i = 0; i < productList.length; i++) {
            sum = productList[i].getProductCount() + sum;
        }
        totalAmount = sum;
    }

        public Product[] getProducts() {
        return new Product[0];
    }

    public void setStatus(String completed) {
    }

    public void addProductToOrder(Product[] newProduct) {
    }
}
