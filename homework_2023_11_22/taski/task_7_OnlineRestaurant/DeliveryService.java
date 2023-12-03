package javaPro.homework_All.homework_2023_11_22.taski.task_7_OnlineRestaurant;

import java.util.List;

//3.10. Класс DeliveryService:
//Поля: List<DeliveryPerson> deliveryPeople, List<Order> deliveryQueue, boolean isOperational.
//Методы для управления доставкой.
public class DeliveryService {
    private List<DeliveryPerson> deliveryPeople;
    private List<Order> deliveryQueue;
    private boolean isOperational;

    public DeliveryService(List<DeliveryPerson> deliveryPeople, List<Order> deliveryQueue, boolean isOperational) {
        this.deliveryPeople = deliveryPeople;
        this.deliveryQueue = deliveryQueue;
        this.isOperational = isOperational;
    }

    public List<DeliveryPerson> getDeliveryPeople() {
        return deliveryPeople;
    }

    public void setDeliveryPeople(List<DeliveryPerson> deliveryPeople) {
        this.deliveryPeople = deliveryPeople;
    }

    public List<Order> getDeliveryQueue() {
        return deliveryQueue;
    }

    public void setDeliveryQueue(List<Order> deliveryQueue) {
        this.deliveryQueue = deliveryQueue;
    }

    public boolean isOperational() {
        return isOperational;
    }

    public void setOperational(boolean operational) {
        isOperational = operational;
    }

    @Override
    public String toString() {
        return "DeliveryService{" +
                "deliveryPeople=" + deliveryPeople +
                ", deliveryQueue=" + deliveryQueue +
                ", isOperational=" + isOperational +
                '}';
    }

    public void scheduleDelivery(Order order) {
        if (isOperational) {
            deliveryQueue.add(order);
            System.out.println("Заказ #" + order.getOrderId() + " добавлен в очередь доставки.");
            assignDeliveryPersonToOrder(order);
        } else {
            System.out.println("Ошибка: Служба доставки не функционирует. Невозможно запланировать доставку.");
        }
    }

    private void assignDeliveryPersonToOrder(Order order) {
    }
}
