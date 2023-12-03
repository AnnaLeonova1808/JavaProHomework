package javaPro.homework_All.homework_2023_11_22.taski.task_1_PersonnelManagement;

public class Test_1 {
    public static void main(String[] args) {
        Employee[] employee = new Employee[1];
        employee[1] = new Employee("A", 22, "A", 2000);
        Employee.work(employee[0]);
    }
}
