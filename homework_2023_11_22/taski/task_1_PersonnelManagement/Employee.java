package javaPro.homework_All.homework_2023_11_22.taski.task_1_PersonnelManagement;

public class Employee implements EmployeeActions {
    private String name;
    private int age;
    private String department;
    private long salary;

    public Employee(String name, int age, String department, long salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public static void work(Employee employee) {
        System.out.println("work 7 hour");
    }

    @Override
    public void work() {

    }

    @Override
    public void takeBreak() {
        System.out.println("break 1 hour");
    }


}
