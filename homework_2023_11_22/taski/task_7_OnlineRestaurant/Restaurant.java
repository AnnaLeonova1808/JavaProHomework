package javaPro.homework_All.homework_2023_11_22.taski.task_7_OnlineRestaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//3.1. Класс Restaurant:
//Поля: String name, Menu menu, List<Order> orders, HashMap<Integer, Customer> customers.
//Методы для управления рестораном и его базовыми функциями.
public class Restaurant {
    private String name;
    private Menu menu;
    private List<Order> orders;
    private HashMap <Integer, Customer> customers;

    public Restaurant(String name, Menu menu, List<Order> orders, HashMap<Integer, Customer> customers) {
        this.name = name;
        this.menu = menu;
        this.orders = new ArrayList<>();
        this.customers = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public HashMap<Integer, Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(HashMap<Integer, Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", menu=" + menu +
                ", orders=" + orders +
                ", customers=" + customers +
                '}';
    }
    public void addCustomer(Customer customer){
        customers.put(customer.getCustomerId(), customer);
        System.out.println("Клиент добавлен ");
    }
    public void removeCustomer(int customerId, Customer customer){
        customers.remove(customer.getCustomerId(), customer);
        System.out.println("Клиент удален ");
    }
}
