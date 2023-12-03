package javaPro.homework_All.homework_2023_11_22.taski.task_7_OnlineRestaurant;

import java.util.List;

//3.7. Класс DeliveryPerson:
//Поля: String name, String vehicleType, boolean isAvailable, List<Order> currentDeliveries.
//Реализация интерфейса Deliverable.
public class DeliveryPerson implements Deliverable {
    private String name;
    private String vehicleType;
    private boolean isAvailable;
    private List<Order> currentDeliveries;

    public DeliveryPerson(String name, String vehicleType, boolean isAvailable, List<Order> currentDeliveries) {
        this.name = name;
        this.vehicleType = vehicleType;
        this.isAvailable = isAvailable;
        this.currentDeliveries = currentDeliveries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public List<Order> getCurrentDeliveries() {
        return currentDeliveries;
    }

    public void setCurrentDeliveries(List<Order> currentDeliveries) {
        this.currentDeliveries = currentDeliveries;
    }

    @Override
    public String toString() {
        return "DeliveryPerson{" +
                "name='" + name + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", isAvailable=" + isAvailable +
                ", currentDeliveries=" + currentDeliveries +
                '}';
    }

    @Override
    public void startDelivery(Order order) {
        if (isAvailable) {
            currentDeliveries.add(order);
            System.out.println(name + " начинает доставку заказа #" + order.getOrderId());
        } else {
            System.out.println(name + " в данный момент не доступен для доставки.");
        }
    }

    @Override
    public void completeDelivery(Order order) {
        if (isAvailable && currentDeliveries.contains(order)) {
            currentDeliveries.remove(order);
            System.out.println(name + " завершает доставку заказа #" + order.getOrderId());
        } else {
            System.out.println(name + " не может завершить доставку этого заказа.");
        }
    }
}
