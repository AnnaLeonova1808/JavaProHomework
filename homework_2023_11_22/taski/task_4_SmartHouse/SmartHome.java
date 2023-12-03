package javaPro.homework_All.homework_2023_11_22.taski.task_4_SmartHouse;

import java.time.LocalDateTime;
import java.util.Arrays;

//3.1. Класс SmartHome:
//        Поля: String homeName, Device[] devices, boolean isAwayMode, LocalDateTime lastUpdate.
//        Методы для управления домом в целом.
public class SmartHome implements ControlInterface {
    private String homeName;
    private Device[] devices;
    private boolean isAwayMode;
    private LocalDateTime lastUpdate;

    public SmartHome(String homeName, Device[] devices, boolean isAwayMode, LocalDateTime lastUpdate) {
        this.homeName = homeName;
        this.devices = devices;
        this.isAwayMode = false;
        this.lastUpdate = LocalDateTime.now();
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public Device[] getDevices() {
        return devices;
    }

    public void setDevices(Device[] devices) {
        this.devices = devices;
    }

    public boolean isAwayMode() {
        return isAwayMode;
    }

    public void setAwayMode(boolean awayMode) {
        isAwayMode = awayMode;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "SmartHome{" +
                "homeName='" + homeName + '\'' +
                ", devices=" + Arrays.toString(devices) +
                ", isAwayMode=" + isAwayMode +
                ", lastUpdate=" + lastUpdate +
                '}';
    }

    @Override
    public void turnOn() {
        for (Device device : devices) {
            if (device.isOn()) {
                device.turnOn();


            }
        }
    }

    @Override
    public void turnOff() {
        for (Device device : devices) {
            if (device.isOn()) {
                device.turnOff();

            }
        }
    }

    @Override
    public void getStatus() {
        System.out.println("Статус Умного Дома" + (isAwayMode ? "Вышел" : "Дома"));
    }
}
