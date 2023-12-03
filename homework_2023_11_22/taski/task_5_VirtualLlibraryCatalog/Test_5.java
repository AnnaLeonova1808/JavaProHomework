package javaPro.homework_All.homework_2023_11_22.taski.task_5_VirtualLlibraryCatalog;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test_5 {
    public static void main(String[] args) {
        List<Book> booksList = new ArrayList<>();
        booksList.add(new Book("A", new Author("AA", "aa", 35, new ArrayList<>()),
                new Publisher("aaa", "aaaaaa", new ArrayList<>()), 2023));
        Catalog catalog = new Catalog(booksList, new SearchEngine());
        SearchEngine searchEngine = new SearchEngine(catalog);
        User user = new User(1, "A", "nnn", new ArrayList<>());
        Book book = booksList.get(0);

        LoanRecord loanRecord = new LoanRecord(user, book, LocalDate.now(), LocalDate.now().plusDays(14));
        Library library = new Library("MMM", catalog);
        library.loanToUser(user, book);
        System.out.println("Данные о пользователе: " + user);
        System.out.println("Данные о книге: " + book);
        library.returnFromUser(user, book);
        System.out.println("Данные о пользователе после возврата книги: " + user);
        System.out.println("Данные о книге после возврата книги: " + book);
        System.out.println(loanRecord);

    }
}
