package javaPro.homework_All.homework_2023_11_22.taski.task_1_PersonnelManagement;

public class Developer extends Employee implements EmployeeActions {
    private String programmingLanguage;
    private boolean remote;

    public Developer(String name, int age, String department, long salary, String programmingLanguage, boolean remote) {
        super(name, age, department, salary);
        this.programmingLanguage = programmingLanguage;
        this.remote = remote;
    }

    @Override
    public void work() {
        System.out.println("work 6 hour");

    }

    @Override
    public void takeBreak() {
        System.out.println("break 2,15 hour");
    }
}
