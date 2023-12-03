package javaPro.homework_All.homework_2023_11_22.taski.task_2_3_TransportSystem;

//3.4. Класс Tram:
//Наследуется от Vehicle.
//Дополнительные поля: int trackWidth, boolean electric.
//Реализация специфических методов для трамвая.
public class Tram extends Vehicle implements TransportControl, Maintenance {
    private int trackWidth;
    private boolean electric;

    public Tram(String model, int capacity, double fare, String route, int trackWidth, boolean electric) {
        super(model, capacity, fare, route);
        this.trackWidth = trackWidth;
        this.electric = electric;
    }

    public int getTrackWidth() {
        return trackWidth;
    }

    public void setTrackWidth(int trackWidth) {
        this.trackWidth = trackWidth;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    @Override
    public String toString() {
        return "Tram{" +
                "trackWidth=" + trackWidth +
                ", electric=" + electric +
                '}';
    }

    @Override
    public void start() {
        System.out.println("Трамвай начал двигаться");

    }

    @Override
    public void move() {
        System.out.println("Трамвай движется");
    }

    @Override
    public void stop() {
        System.out.println("Трамвай остановился");

    }

    public void openTrampDoors() {
        System.out.println("Двери открываются");
    }

    public void closeTrampDoors() {
        System.out.println("Двери закрываются");
    }

    public void announceNextStop() {
        System.out.println("Объявление следующей остановки");
    }

    @Override
    public void vehicleMaintenance() {
        System.out.println("Трамвай допущен к работе");

    }

    @Override
    public void vehicleRepair() {
        System.out.println("Трамвай завершил ремонт ");

    }

    @Override
    public void controlTheMovementOfVehicles() {
        System.out.println("Трамвай в пути");

    }

    @Override
    public void controlTheRoutesOfVehicles() {
        System.out.println("Трамвай находится на маршруте");

    }
}
