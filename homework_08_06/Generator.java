package javaPro.homework_08_06;

import java.util.ArrayList;
import java.util.List;
//Написать класс Generator который содержит только один метод который возвращает Лист с этими Employee.
public class Generator {
    public static List<Employee> generateEmployees() {
        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee("Anna", "Financial", 42, 1500);
        Employee emp2 = new Employee("Sergey", "IT", 41, 3500);
        Employee emp3 = new Employee("Dmitriy", "Sale", 40, 2500);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        return employees;

    }

}
