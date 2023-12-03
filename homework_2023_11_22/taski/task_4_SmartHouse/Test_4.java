package javaPro.homework_All.homework_2023_11_22.taski.task_4_SmartHouse;

import java.time.LocalDateTime;

public class Test_4 {
    public static void main(String[] args) {


        Lighting lighting = new Lighting("1", "aaa", true, LocalDateTime.of(2023, 12,
                11, 13, 15), 1, "red");
        Heating heating = new Heating("b", "bbb", false, LocalDateTime.of(2023, 11,
                12, 13, 15), 25.0, 27);
        SecuritySystem securitySystem = new SecuritySystem("c", "ccc", true, LocalDateTime.of
                (2023, 12, 11, 13, 15), true, new String[]{"1", "2", "3"});
        Device[] device = new Device[]{lighting, heating, securitySystem};
        SmartHome smartHome = new SmartHome("MyHome", new Device[]{}, true, LocalDateTime.now());
        smartHome.turnOn();

        lighting.turnOff();
        heating.turnOn();

        smartHome.turnOff();
        securitySystem.performAction();
    }
}
