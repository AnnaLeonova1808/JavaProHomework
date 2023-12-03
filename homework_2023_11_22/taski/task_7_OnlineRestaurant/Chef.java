package javaPro.homework_All.homework_2023_11_22.taski.task_7_OnlineRestaurant;

import java.util.List;

//3.6. Класс Chef:
//Поля: String name, int experienceYears, List<MenuItem> specialties, boolean isAvailable.
//Реализация интерфейса Cookable.
public class Chef implements Cookable {
    private String name;
    private int experienceYears;
    private List<MenuItem> specialties;
    private boolean isAvailable;

    public Chef(String name, int experienceYears, List<MenuItem> specialties, boolean isAvailable) {
        this.name = name;
        this.experienceYears = experienceYears;
        this.specialties = specialties;
        this.isAvailable = isAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public List<MenuItem> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(List<MenuItem> specialties) {
        this.specialties = specialties;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", experienceYears=" + experienceYears +
                ", specialties=" + specialties +
                ", isAvailable=" + isAvailable +
                '}';
    }

    @Override
    public void prepareDish(MenuItem item) {
        if (isAvailable) {
            if (specialties.contains(item)) {
                System.out.println(name + " готовит блюдо: " + item.getName());
            } else {
                System.out.println(name + " не специализируется на этом блюде.");
            }
        } else {
            System.out.println(name + " в данный момент не доступен для приготовления блюд.");
        }
    }

    @Override
    public void completeDish(MenuItem item) {
        if (isAvailable) {
            System.out.println(name + " завершает приготовление блюда: " + item.getName());
        } else {
            System.out.println(name + " в данный момент не доступен для завершения приготовления блюда.");
        }
    }
}

