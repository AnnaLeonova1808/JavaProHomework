package javaPro.homework_All.homework_2023_11_22.taski.task_5_VirtualLlibraryCatalog;
//3.10. Интерфейс Loanable:
//Методы: loanToUser(User user), returnFromUser(User user).
public interface Loanable {
    void loanToUser(User user, Book book);
    void returnFromUser(User user, Book book);
}
