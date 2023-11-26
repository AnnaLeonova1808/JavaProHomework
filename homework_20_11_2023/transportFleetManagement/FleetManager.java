package javaPro.homework_210823.homework_20_11_2023.transportFleetManagement;

import java.util.Arrays;
//Поля: имя, список автомобилей (массив), список водителей (массив).
//Методы: добавить автомобиль в парк, назначить автомобиль водителю.

public class FleetManager {
    private String name;
    private Car[] cars;
    private Driver[] drivers;

    public FleetManager(String name, Car[] cars, Driver[] drivers) {
        this.name = name;
        this.cars = cars;
        this.drivers = drivers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public Driver[] getDrivers() {
        return drivers;
    }

    public void setDrivers(Driver[] drivers) {
        this.drivers = drivers;
    }

    @Override
    public String toString() {
        return "FleetManager{" +
                "name='" + name + '\'' +
                ", cars=" + Arrays.toString(cars) +
                ", drivers=" + Arrays.toString(drivers) +
                '}';
    }
    public void addCarToPark(Car newCar) {
          cars = Arrays.copyOf(cars, cars.length + 1);
       cars[cars.length - 1] = newCar;
       System.out.println("Автомобиль добавлен в автопарк: " + newCar);
    }

    public void assignCarToDriver(Driver driver, Car cars) {
        if (cars.isPassedTechnicalInspection()) {
            driver.assignCar(cars);
        } else {
            System.out.println("Автомобиль " + cars + " не прошел технический осмотр. Невозможно назначить " + driver.getName());
        }
    }

    public void addCarToPark(Car[] cars) {
    }
}
