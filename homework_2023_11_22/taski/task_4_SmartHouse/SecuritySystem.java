package javaPro.homework_All.homework_2023_11_22.taski.task_4_SmartHouse;

import java.time.LocalDateTime;

//3.4. Класс SecuritySystem:
//Наследуется от Device.
//Дополнительные поля: boolean isArmed, String[] accessCodes.
//Реализация специфических функций безопасности.
public class SecuritySystem extends Device{
    private boolean isArmed;
    private String[] accessCodes;

    public SecuritySystem(String deviceId, String location, boolean isOn, LocalDateTime lastChecked, boolean isArmed, String[] accessCodes) {
        super(deviceId, location, isOn, lastChecked);
        this.isArmed = isArmed;
        this.accessCodes = accessCodes;
    }


    @Override
    public void turnOn() {
        isArmed = true;
        performAction();

    }

    @Override
    public void turnOff() {
        isArmed = false;
        performAction();

    }

    @Override
    public void performAction() {
        System.out.println("Система безопасности включена");
    }

    @Override
    public void displayInfo() {
        System.out.println("Состояние системы безопасности" + (isArmed() ? "Включено" : "Выключено"));

    }

    private boolean isArmed() {
        return false;
    }
}
