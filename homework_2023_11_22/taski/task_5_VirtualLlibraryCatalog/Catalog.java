package javaPro.homework_All.homework_2023_11_22.taski.task_5_VirtualLlibraryCatalog;

import java.util.ArrayList;
import java.util.List;

//3.4. Класс Catalog:
//Поля: List<Book> books, SearchEngine searchEngine.
//Методы для управления каталогом книг.
public class Catalog {
    private List<Book> books;
    private SearchEngine searchEngine;

    public Catalog(List<Book> books, SearchEngine searchEngine) {
        this.books = new ArrayList<>();
        this.searchEngine = searchEngine;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public SearchEngine getSearchEngine() {
        return searchEngine;
    }

    public void setSearchEngine(SearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "books=" + books +
                ", searchEngine=" + searchEngine +
                '}';
    }
    public void addBook (Book book){
        books.add(book);
    }
    public void removeBook (Book book){
        books.remove(book);
    }
    public boolean isBookAvailable (Book book){
        return books.contains(book);
    }

    public void loanBook(Book book) {
    }

    public void returnBook(Book book) {
    }
}
