package javaPro.homework_All.homework_2023_11_22.taski.task_2_3_TransportSystem;

public class Bus extends Vehicle implements TransportControl, Maintenance {
    private boolean accessibility;
    private int busNumber;
    private String currentRoute;

    public Bus(String model, int capacity, double fare, String route, boolean accessibility, int busNumber) {
        super(model, capacity, fare, route);
        this.accessibility = accessibility;
        this.busNumber = busNumber;
    }

    public boolean isAccessibility() {
        return accessibility;
    }

    public void setAccessibility(boolean accessibility) {
        this.accessibility = accessibility;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "accessibility=" + accessibility +
                ", busNumber=" + busNumber +
                '}';
    }

    @Override
    public void start() {
        System.out.println("Автобус начал двигаться");

    }

    @Override
    public void move() {
        System.out.println("Автобус движется");
    }

    @Override
    public void stop() {
        System.out.println("Автобус остановился");
    }

    public static void openDoors(Vehicle vehicle1) {
        System.out.println("Двери открываются");
    }

    public static void closeDoors(Vehicle vehicle1) {
        System.out.println("Двери закрываются");
    }

    public static void announceNextStop(Vehicle vehicle1) {
        System.out.println("Объявление следующей остановки");
    }

    @Override
    public void controlTheMovementOfVehicles() {
        System.out.println("Автобус в пути");
    }

    @Override
    public void controlTheRoutesOfVehicles() {
        System.out.println("Автобус находится на маршруте");
    }

    @Override
    public void vehicleMaintenance() {
        System.out.println("Автобус допущен к работе");
    }

    @Override
    public void vehicleRepair() {
        System.out.println("Автобус завершил ремонт ");
    }
}
