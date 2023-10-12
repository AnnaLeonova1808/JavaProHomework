package javaPro.homework_07_10_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LibraryManager {
    private List<Book> libraryCatalog;
    private List<String> libraryUsers;

    public LibraryManager() {
        this.libraryCatalog = new ArrayList<>();
        this.libraryUsers = new ArrayList<>();
    }

    public List<Book> getLibraryCatalog() {
        return libraryCatalog;
    }

    public void setLibraryCatalog(List<Book> libraryCatalog) {
        this.libraryCatalog = libraryCatalog;
    }

    public List<String> getLibraryUsers() {
        return libraryUsers;
    }

    public void setLibraryUsers(List<String> libraryUsers) {
        this.libraryUsers = libraryUsers;
    }

    @Override
    public String toString() {
        return "LibraryManager{" +
                "libraryCatalog=" + libraryCatalog +
                ", libraryUsers=" + libraryUsers +
                '}';
    }

    public List<Book> listAvailableBooksByGenre(String genre) {
        List<Book> availableBooksByGenre = new ArrayList<>();
        for (Book book : libraryCatalog) {
            if (book.isBookAvailable() && book.getBookGenre().equalsIgnoreCase(genre)) {
                availableBooksByGenre.add(book);
            }
        }
        return availableBooksByGenre;
    }

    public void addBookToLibrary(Book book) {

        libraryCatalog.add(book);
    }

    public void removeBookFromLibrary(Book book) {

        libraryCatalog.remove(book);
    }

    public void borrowBook(LibraryUser user, Book book) {
        if (book.isBookAvailable()) {
            book.setBookAvailable(false);
            user.add(book);
        }
    }
    public void reserveBook(LibraryUser user, Book book) {
        if (book.isBookAvailable()) {
            book.setBookAvailable(false);
            user.add(book);
        }
    }
    public static void main(String[] args) {
        List<Book> libraryCatalog = new ArrayList<>(Arrays.asList(new Book(1, "Book Title 1", "AA", "Comedy", "1996", true),
                new Book(2, "Book Title 2", "BB", "Dramatic", "2001", false),
                new Book(3, "Book Title 3", "CC", "Action", "2022", true)));
        List<String> libraryUsers = new ArrayList<>();
        LibraryManager libraryManager = new LibraryManager();
        libraryManager.setLibraryCatalog(libraryCatalog);
        libraryManager.setLibraryUsers(libraryUsers);
        String selectedGenre = "Comedy";
        List<Book> availableBooks = libraryManager.listAvailableBooksByGenre(selectedGenre);
        for (Book book : availableBooks) {

            System.out.println("Найдена книга" + book);

        }
        Book newBook = new Book(4, "Book Title 4", "DD", "Action", "2023", true);
        libraryManager.addBookToLibrary(newBook);
        System.out.println("Добавлена новая книга " + libraryCatalog);

        Book removeBook = new Book(4, "Book Title 4", "DD", "Action", "2023", true);
        libraryManager.removeBookFromLibrary(removeBook);
        System.out.println("Удалена книга " + libraryCatalog);

        LibraryUser user1 = new LibraryUser(1, "Anna", "@annaleonova", "+380503946076", new ArrayList<>(), new HashSet<>());
        Book bookToBorrow = libraryCatalog.get(0);
        libraryManager.borrowBook(user1, bookToBorrow);
        System.out.println("Книга арендована пользователем " + user1 + bookToBorrow);

        Book reserveToBook = libraryCatalog.get(1);
        libraryManager.reserveBook(user1, reserveToBook);
        System.out.println("Книга зарезервирована пользователем " + user1 + reserveToBook);
    }
}


