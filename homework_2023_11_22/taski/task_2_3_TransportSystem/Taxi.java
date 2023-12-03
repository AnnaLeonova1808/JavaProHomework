package javaPro.homework_All.homework_2023_11_22.taski.task_2_3_TransportSystem;

//3.3. Класс Taxi:
//Наследуется от Vehicle.
//Дополнительные поля: String licensePlate, boolean available.
//Реализация специфических методов для такси.
public class Taxi extends Vehicle implements TransportControl, Maintenance {
    private String licensePlate;
    private boolean available;

    public Taxi(String model, int capacity, double fare, String route, String licensePlate, boolean available) {
        super(model, capacity, fare, route);
        this.licensePlate = licensePlate;
        this.available = available;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "licensePlate='" + licensePlate + '\'' +
                ", available=" + available +
                '}';
    }

    @Override
    public void start() {
        System.out.println("Такси начал двигаться");
    }

    @Override
    public void move() {
        System.out.println("Такси движется");
    }


    @Override
    public void stop() {
        System.out.println("Такси остановился");

    }

    public static void pickUpPassenger(Vehicle vehicle2) {
        System.out.println("Забирает пассажира");
    }

    public static void dropOffPassenger(Vehicle vehicle2) {
        System.out.println("Пассажир высаживается");
    }

    @Override
    public void vehicleMaintenance() {
        System.out.println("Такси допущено к работе");

    }

    @Override
    public void vehicleRepair() {System.out.println("Такси завершил ремонт ");

    }

    @Override
    public void controlTheMovementOfVehicles() { System.out.println("Такси в пути");

    }

    @Override
    public void controlTheRoutesOfVehicles() {
        System.out.println("Такси находится на маршруте");

    }
}
