package javaPro.homework_All.homework_2023_11_22.taski.task_2_3_TransportSystem;

public abstract class Vehicle {
    private String model;
    private int capacity;
    private double fare;
    private String route;

    public Vehicle(String model, int capacity, double fare, String route) {
        this.model = model;
        this.capacity = capacity;
        this.fare = fare;
        this.route = route;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", capacity=" + capacity +
                ", fare=" + fare +
                ", route='" + route + '\'' +
                '}';
    }

    public abstract void start();

    public abstract void move();

    public abstract void stop();
}
