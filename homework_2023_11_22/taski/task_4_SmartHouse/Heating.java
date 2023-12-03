package javaPro.homework_All.homework_2023_11_22.taski.task_4_SmartHouse;

import java.time.LocalDateTime;

//3.3. Класс Heating:
//Наследуется от Device.
//Дополнительные поля: double currentTemperature, double targetTemperature.
//Методы для управления отоплением.
public class Heating extends Device implements ControlInterface{
    private double currentTemperature;
    private double targetTemperature;

    public Heating(String deviceId, String location, boolean isOn, LocalDateTime lastChecked, double currentTemperature, double targetTemperature) {
        super(deviceId, location, isOn, lastChecked);
        this.currentTemperature = currentTemperature;
        this.targetTemperature = targetTemperature;
    }

    @Override
    public void getStatus() {

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
        System.out.println("Отопление включено");

    }

    @Override
    public void displayInfo() {
        System.out.println("Состояние отопления" + (isOn() ? "Включено" : "Выключено"));

    }
}
