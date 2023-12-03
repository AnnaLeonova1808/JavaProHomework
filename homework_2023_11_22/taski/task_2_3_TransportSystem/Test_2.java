package javaPro.homework_All.homework_2023_11_22.taski.task_2_3_TransportSystem;

public class Test_2 {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Bus("a",4,2.0,"aaaa",true,111);
        Vehicle vehicle2 = new Taxi("a",4,2.0,"aaaa","aaa",true);
        Vehicle vehicle3 = new Tram("a",4,2.0,"aaaa",1,true);
        Bus.openDoors(vehicle1);
        Bus.closeDoors(vehicle1);
        Bus.announceNextStop(vehicle1);
        Taxi.pickUpPassenger(vehicle2);
        Taxi.dropOffPassenger(vehicle2);

    }
}
