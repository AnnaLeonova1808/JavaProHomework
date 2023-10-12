package javaPro.homework_07_10_2;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class StoreManager {
    private List<Product> products;
    private List<String> customers;

    public StoreManager(List<Product> products, List<Customer> customers) {
        this.products = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "StoreManager_2{" +
                "products=" + products +
                ", customers=" + customers +
                '}';
    }

    public double calculateAverageProductPrice(List<Product> productList) {
        double totalProductPrice = 0.0;
        for (Product product : productList) {
            totalProductPrice += product.getProductPrice();
        }
        return totalProductPrice / productList.size();
    }

    //public List<String> listCustomerEmailsForPriceRange(double minPrice, double maxPrice) {

    //}

    public void addProductToStore(Product product) {
        products.add(product);

    }

    public void removeProductFromStore(Product product) {
        products.remove(product);
    }

    public void addToCart(Customer customer, Product product, int quantity) {
        Map<String, Integer> customerCart = customer.getCustomerCart();
        customerCart.put(product.getProductName(), quantity);
    }

    public void purchaseCart(Customer customer) {
        customer.getCustomerPurchases();
    }

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        Product product1 = new Product(1, "Jacobs", "Coffe&Tea", 8.5, 25, "aaaa");
        Product product2 = new Product(2, "Lipton", "Coffe&Tea", 6.4, 18, "bbbb");
        Product product3 = new Product(3, "Lays", "Snacks", 2.5, 75, "cccc");
        Product product4 = new Product(4, "Pepsi", "Beverage", 3.5, 105, "dddd");
        Product product5 = new Product(5, "Mirinda", "Beverage", 3.5, 100, "eeee");
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        System.out.println(productList);

        StoreManager storeManager = new StoreManager(productList, new ArrayList<>());
        double averagePrice = storeManager.calculateAverageProductPrice(productList);
        System.out.println("Средняя цена продуктов в магазине: " + averagePrice);

        List<String> customersInRange = new ArrayList<>();


        Product product6 = new Product(6, "Cheetos", "Snacks", 2.5, 9, "ffff");
        storeManager.addProductToStore(product6);
        System.out.println("Список продуктов в магазине после добавления нового продукта: " + productList + storeManager);

        storeManager.removeProductFromStore(product1);
        System.out.println("Список продуктов в магазине после удаления продукта: " + productList + storeManager);

        List<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer(11, "Anna", "@annaleonova", "380503946076");
        Customer customer2 = new Customer(22, "Elena", "@elenafomenko", "380503946077");
        Customer customer3 = new Customer(33, "Irina", "@irinaalekseenko", "380503946070");

        storeManager.addToCart(customer1, product4, 1);
        System.out.println("Корзина покупателя:" + customer1.getCustomerCart());
    }
}
