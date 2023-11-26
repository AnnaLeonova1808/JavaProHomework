package javaPro.homework_210823.homework_20_11_2023.transportFleetManagement;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("A", "a", 2020);
        cars[1] = new Car("B", "b", 2000);
        cars[2] = new Car("C", "c", 1995);
        Car.displayInfo(cars[0]);

        Driver[] driver = new Driver[3];
        driver[0] = new Driver("J", 5, cars[0]);
        driver[1] = new Driver("M", 3, cars[1]);
        driver[2] = new Driver("S", 1, cars[2]);

        FleetManager[] fleetManager = new FleetManager[3];
        fleetManager[0] = new FleetManager("H", new Car[0], new Driver[1]);
        fleetManager[1] = new FleetManager("N", new Car[1], new Driver[2]);
        fleetManager[2] = new FleetManager("T", new Car[2], new Driver[0]);

        fleetManager[0].addCarToPark(cars[0]);
        fleetManager[0].addCarToPark(cars[2]);


        Fleet[] fleet = new Fleet[3];
        fleet[0] = new Fleet("H", "aaa sss  ddd", new FleetManager[1]);
        fleet[1] = new Fleet("N", "ccc fff  ttt", new FleetManager[2]);
        fleet[2] = new Fleet("T", "bbb hhh  uuu", new FleetManager[0]);

        fleet[1].addFleetManager(fleetManager[0]);

        fleetManager[2].assignCarToDriver(driver[2], cars[2]);
    }
}
