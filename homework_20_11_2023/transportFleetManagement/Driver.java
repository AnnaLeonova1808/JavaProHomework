package javaPro.homework_210823.homework_20_11_2023.transportFleetManagement;

public class Driver {
    //Поля: имя, стаж вождения, текущий автомобиль (Car).
    //Методы: назначить автомобиль, освободить автомобиль.
    private String name;
    private int drivingExperience;
    private Car currentCar;

    public Driver(String name, int drivingExperience, Car currentCar) {
        this.name = name;
        this.drivingExperience = drivingExperience;
        this.currentCar = currentCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    public Car getCurrentCar() {
        return currentCar;
    }

    public void setCurrentCar(Car currentCar) {
        this.currentCar = currentCar;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", drivingExperience=" + drivingExperience +
                ", currentCar=" + currentCar +
                '}';
    }
    public void assignCar(Car cars) {
        this.currentCar = cars;
        System.out.println("Водителю" + name + "Назначен автомобиль: " + cars);
    }

    public void releaseCar() {
        System.out.println("Водитель " + name + "Освободил автомобиль" );
        currentCar = null;
    }

}
