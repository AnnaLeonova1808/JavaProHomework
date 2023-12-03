package javaPro.homework_All.homework_2023_11_22.taski.task_1_PersonnelManagement;

public class Manager extends Employee implements EmployeeActions {
    private int teamSize;
    private Employee[] teamMembers;

    public Manager(String name, int age, String department, long salary, int teamSize, Employee[] teamMembers) {
        super(name, age, department, salary);
        this.teamSize = teamSize;
        this.teamMembers = teamMembers;
    }

    @Override
    public void work() {
        System.out.println("work 8 hour");

    }

    @Override
    public void takeBreak() {
        System.out.println("break 1,15 hour");
    }
}

