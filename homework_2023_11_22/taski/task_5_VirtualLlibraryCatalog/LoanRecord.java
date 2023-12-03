package javaPro.homework_All.homework_2023_11_22.taski.task_5_VirtualLlibraryCatalog;

import java.time.LocalDate;

//3.6. Класс LoanRecord:
//Поля: User user, Book book, LocalDate loanDate, LocalDate dueDate.
//Методы для отслеживания информации о займе.
public class LoanRecord {
    private User user;
    private Book book;
    private LocalDate loanDate;
    private LocalDate dueDate;

    public LoanRecord(User user, Book book, LocalDate loanDate, LocalDate dueDate) {
        this.user = user;
        this.book = book;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "LoanRecord{" +
                "user=" + user +
                ", book=" + book +
                ", loanDate=" + loanDate +
                ", dueDate=" + dueDate +
                '}';
    }
    public String getLoanDetails() {
        return "User: " + user.getName() + ", Book: " + book.getTitle() +
                ", Дата займа: " + loanDate + ", Срок оплаты: " + dueDate;
    }

}
