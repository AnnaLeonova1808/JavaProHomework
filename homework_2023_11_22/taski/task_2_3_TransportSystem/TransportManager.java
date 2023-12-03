package javaPro.homework_All.homework_2023_11_22.taski.task_2_3_TransportSystem;

import java.util.Arrays;

//3.5. Класс TransportManager:
//Поля: Vehicle[] vehicles, int totalVehicles, String managerName.
//Реализация методов управления транспортными средствами.
public class TransportManager {
    private  Vehicle[] vehicles;;
    private int totalVehicles;
    private String managerName;

    public TransportManager(Vehicle[] vehicles, int totalVehicles, String managerName) {
        this.vehicles = vehicles;
        this.totalVehicles = totalVehicles;
        this.managerName = managerName;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public int getTotalVehicles() {
        return totalVehicles;
    }

    public void setTotalVehicles(int totalVehicles) {
        this.totalVehicles = totalVehicles;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    @Override
    public String toString() {
        return "TransportManager{" +
                "vehicles=" + Arrays.toString(vehicles) +
                ", totalVehicles=" + totalVehicles +
                ", managerName='" + managerName + '\'' +
                '}';
    }
    void addVehicle(Vehicle vehicle) {
        System.out.println("Добавлен транспорт");

    }

    void removeVehicle(Vehicle vehicle) {
        System.out.println("Удален транспорт");

    }

    void displayFleetStatus() {
        System.out.println("Транспорт в состоянии:");

    }
}
