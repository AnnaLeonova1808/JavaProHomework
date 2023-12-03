package javaPro.homework_All.homework_2023_11_22.taski.task_5_VirtualLlibraryCatalog;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//3.1. Класс Library:
//Поля: String name, Catalog catalog, HashMap<Integer, User> users, List<LoanRecord> loanRecords.
//Методы для общего управления библиотекой.
public class Library implements Loanable{
    private String name;
    private Catalog catalog;
    private HashMap<Integer, User> users;
    private List<LoanRecord> loanRecords;
    private int getUserId;

    public Library(String name, Catalog catalog) {
        this.name = name;
        this.catalog = catalog;
        this.users = new HashMap<>();
        this.loanRecords = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public HashMap<Integer, User> getUsers() {
        return users;
    }

    public void setUsers(HashMap<Integer, User> users) {
        this.users = users;
    }

    public List<LoanRecord> getLoanRecords() {
        return loanRecords;
    }

    public void setLoanRecords(List<LoanRecord> loanRecords) {
        this.loanRecords = loanRecords;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", catalog=" + catalog +
                ", users=" + users +
                ", loanRecords=" + loanRecords +
                '}';
    }

    @Override
    public void loanToUser(User user, Book book) {
        if (catalog.isBookAvailable(book)) {
            LoanRecord loanRecord = new LoanRecord(user, book, LocalDate.now(), LocalDate.now().plusDays(14));
            loanRecords.add(loanRecord);
            user.getCurrentLoans().add(loanRecord);
            catalog.loanBook(book);
        }
    }

    @Override
    public void returnFromUser(User user, Book book) {
        LoanRecord loanRecordToRemove = findLoanRecord(book, user);

        if (loanRecordToRemove != null) {
            loanRecords.remove(loanRecordToRemove);
            user.getCurrentLoans().remove(loanRecordToRemove);
            catalog.returnBook(book);
        }
    }
    public void addUser (User user){
        user.put(user.getUserId(),user);
    }
    public void removeUser (User user){
        user.remove(user.getUserId());
    }
    private LoanRecord findLoanRecord(Book book, User user) {
        for (LoanRecord loanRecord : loanRecords) {
            if (loanRecord.getBook().equals(book) && loanRecord.getUser().equals(user)) {
                return loanRecord;
            }
        }
        return null;
    }
}
