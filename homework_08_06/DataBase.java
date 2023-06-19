package javaPro.homework_08_06;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
//Написать класс Generator который содержит только один метод который возвращает Лист с этими Employee.
//3.Написать класс DataBase который содержит Map dataBase = new TreeMap<>();
//и метод который будет добавлять в dataBase Employee,  а в качестве параметра принимать лист  Employee.
//
//Напишите класс с методом main
//
//В методе main создайте лист и сгенерируйте туда наших Employee через Generator далее передайте лист в dataBase.
//
//!!!  метод который будет добавлять в dataBase Employee должен автоматически генерировать ключ. Те Integer ну и передавать туда по очереди наших Employee

public class DataBase {

    private Map<Integer, Employee> dataBase;

    public DataBase() {

        dataBase = new TreeMap<>();
    }

    public void addEmployees(List<Employee> employees) {
        int key = 1;
        for (Employee employee : employees) {
            dataBase.put(key, employee);
            key++;
        }
    }
    public void printDataBase() {
        for (Map.Entry<Integer, Employee> entry : dataBase.entrySet()) {
            System.out.println(" Key: " + entry.getKey() + " Employee: " + entry.getValue());
        }
    }
    public static void main(String[] args) {

        List<Employee> employees = Generator.generateEmployees();
        DataBase dataBase = new DataBase();
        dataBase.addEmployees(employees);
        System.out.println();
        dataBase.printDataBase();
        dataBase.addEmployees(employees);

    }
}
