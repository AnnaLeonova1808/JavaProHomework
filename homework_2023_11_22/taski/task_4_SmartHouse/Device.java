package javaPro.homework_All.homework_2023_11_22.taski.task_4_SmartHouse;

import java.time.LocalDateTime;
//3.5. Абстрактный класс Device:
//Поля: String deviceId, String location, boolean isOn, LocalDateTime lastChecked.
//Абстрактные методы для базовых операций устройства.

public abstract class Device {
    private String deviceId;
    private String location;
    protected boolean isOn;
    private LocalDateTime lastChecked;

    public Device(String deviceId, String location, boolean isOn, LocalDateTime lastChecked) {
        this.deviceId = deviceId;
        this.location = location;
        this.isOn = isOn;
        this.lastChecked = lastChecked;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public LocalDateTime getLastChecked() {
        return lastChecked;
    }

    public void setLastChecked(LocalDateTime lastChecked) {
        this.lastChecked = lastChecked;
    }

    @Override
    public String toString() {
        return "Device{" +
                "deviceId='" + deviceId + '\'' +
                ", location='" + location + '\'' +
                ", isOn=" + isOn +
                ", lastChecked=" + lastChecked +
                '}';
    }
    public abstract void turnOn();

    public abstract void turnOff();

    public abstract void performAction();

    public abstract void displayInfo();

}
