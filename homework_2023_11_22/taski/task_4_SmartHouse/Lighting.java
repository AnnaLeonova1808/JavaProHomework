package javaPro.homework_All.homework_2023_11_22.taski.task_4_SmartHouse;

import java.time.LocalDateTime;
//3.2. Класс Lighting:
//Наследуется от Device.
//Дополнительные поля: int brightnessLevel, String colorTemperature.
//Методы для управления освещением.
public class Lighting extends Device {
    private int brightnessLevel;
    private String colorTemperature;

    public Lighting(String deviceId, String location, boolean isOn, LocalDateTime lastChecked, int brightnessLevel, String colorTemperature) {
        super(deviceId, location, isOn, lastChecked);
        this.brightnessLevel = brightnessLevel;
        this.colorTemperature = colorTemperature;
    }

    @Override
    public void turnOn() {
        boolean isOn = true;
        performAction();

    }

    @Override
    public void turnOff() {
        boolean isOn = false;
        performAction();

    }

    @Override
    public void performAction() {
        System.out.println("Освещение включено");

    }

    @Override
    public void displayInfo() {
        System.out.println("Состояние освещения" + (isOn() ? "Включено" : "Выключено"));

    }
}
