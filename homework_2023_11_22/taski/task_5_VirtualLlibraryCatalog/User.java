package javaPro.homework_All.homework_2023_11_22.taski.task_5_VirtualLlibraryCatalog;

import java.util.ArrayList;
import java.util.List;

//3.3. Класс User:
//Поля: int userId, String name, String email, List<LoanRecord> currentLoans.
//Методы для управления информацией пользователя и его займов.
public class User {
    private int userId;
    private String name;
    private String email;
    private List<LoanRecord> currentLoans;

    public User(int userId, String name, String email, List<LoanRecord> currentLoans) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.currentLoans = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<LoanRecord> getCurrentLoans() {
        return currentLoans;
    }

    public void setCurrentLoans(List<LoanRecord> currentLoans) {
        this.currentLoans = currentLoans;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", currentLoans=" + currentLoans +
                '}';
    }
    public void addLoanRecord(LoanRecord loanRecord) {
        currentLoans.add(loanRecord);
    }

    public void removeLoanRecord(LoanRecord loanRecord) {
        currentLoans.remove(loanRecord);
    }
    public void putUser(int userId, User user) {
        user.putUser(userId, user);
    }

    public void removeUser(int userId,User user) {
        user.removeUser(userId,user);
    }

    public void put(int userId, User user) {
    }

    public void remove(int userId) {
    }
}
