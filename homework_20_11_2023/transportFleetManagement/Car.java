package javaPro.homework_210823.homework_20_11_2023.transportFleetManagement;
//Автомобиль (Car)
//Поля: марка, модель, год выпуска.
//Методы: вывод информации об автомобиле, проверка на техосмотр.
public class Car {
    private static String brand;
    private static String model;
    private static int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
    public static void displayInfo(Car car) {
        System.out.println("Car: " + brand + " " + model + " (" + year + ")");
    }
    public boolean isPassedTechnicalInspection() {
        int currentYear = year;
        int carProductionYear = getYear();
        return currentYear - carProductionYear <= 5;
    }
}
