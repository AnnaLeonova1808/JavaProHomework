package javaPro.homework_210823.homework_20_11_2023.transportFleetManagement;

import java.util.Arrays;
//Поля: название, адрес, список менеджеров парка (массив).
//Методы: добавить менеджера, поиск менеджера по имени.
public class Fleet {
    private String name;
    private String address;
    private FleetManager[] fleetManagers;

    public Fleet(String name, String address, FleetManager[] fleetManagers) {
        this.name = name;
        this.address = address;
        this.fleetManagers = fleetManagers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public FleetManager[] getFleetManagers() {
        return fleetManagers;
    }

    public void setFleetManagers(FleetManager[] fleetManagers) {
        this.fleetManagers = fleetManagers;
    }

    @Override
    public String toString() {
        return "Fleet{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", fleetManagers=" + Arrays.toString(fleetManagers) +
                '}';
    }
    public void addFleetManager(FleetManager fleetManager) {
        fleetManagers = Arrays.copyOf(fleetManagers, fleetManagers.length + 1);
        fleetManagers[fleetManagers.length - 1] = fleetManager;
        System.out.println("Добавлен менеджер автопарка: " + fleetManager.getName());
    }
    public FleetManager findFleetManagerByName(String name) {
        for (FleetManager fleetManager : fleetManagers) {
            if (fleetManager.getName().equals(name)) {
                return fleetManager;
            }
        }
        return null;
    }
}
