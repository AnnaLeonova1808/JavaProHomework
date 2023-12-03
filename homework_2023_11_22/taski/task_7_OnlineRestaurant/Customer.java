package javaPro.homework_All.homework_2023_11_22.taski.task_7_OnlineRestaurant;

//3.5. Класс Customer:
//Поля: int customerId, String name, String address, String phoneNumber.
//Методы для управления информацией клиента.
public class Customer {
    private int customerId;
    private String name;
    private String address;
    private String phoneNumber;

    public Customer(int customerId, String name, String address, String phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getCustomerId() {
        return null;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public void updateInfo(String newName, String newAddress, String newPhoneNumber) {
        this.name = newName;
        this.address = newAddress;
        this.phoneNumber = newPhoneNumber;
        System.out.println("Информация о клиенте " + this.name + " обновлена.");
    }

    public void displayInfo() {
        System.out.println("ID клиента: " + this.customerId);
        System.out.println("Имя: " + this.name);
        System.out.println("Адрес: " + this.address);
        System.out.println("Номер телефона: " + this.phoneNumber);
    }

    public void placeOrder(Order order) {
    }
}
