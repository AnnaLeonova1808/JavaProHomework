package javaPro.homework_All.homework_2023_11_22.taski.task_7_OnlineRestaurant;

import java.util.List;

//3.9. Класс Kitchen:
//Поля: List<Chef> chefs, List<Order> cookingOrders, boolean isOpen. //
//Методы для управления кухней и процессом приготовления.
public class Kitchen {
    private List<Chef> chefs;
    private List<Order> cookingOrders;
    private boolean isOpen;

    public Kitchen(List<Chef> chefs, List<Order> cookingOrders, boolean isOpen) {
        this.chefs = chefs;
        this.cookingOrders = cookingOrders;
        this.isOpen = isOpen;
    }

    public List<Chef> getChefs() {
        return chefs;
    }

    public void setChefs(List<Chef> chefs) {
        this.chefs = chefs;
    }

    public List<Order> getCookingOrders() {
        return cookingOrders;
    }

    public void setCookingOrders(List<Order> cookingOrders) {
        this.cookingOrders = cookingOrders;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "chefs=" + chefs +
                ", cookingOrders=" + cookingOrders +
                ", isOpen=" + isOpen +
                '}';
    }
    public void processOrder(Order order) {
        if (isOpen) {
            cookingOrders.add(order);
            System.out.println("Заказ " + order.getOrderId() + " добавлен на приготовление.");
            assignChefsToOrder(order);
        } else {
            System.out.println("Ошибка: Кухня закрыта. Невозможно обработать заказ.");
        }
    }

    private void assignChefsToOrder(Order order) {
    }
}
