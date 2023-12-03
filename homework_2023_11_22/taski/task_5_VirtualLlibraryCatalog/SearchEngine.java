package javaPro.homework_All.homework_2023_11_22.taski.task_5_VirtualLlibraryCatalog;

import java.util.ArrayList;
import java.util.List;

//3.5. Класс SearchEngine:
//Поля: Catalog catalog.
//Реализация интерфейса Searchable с методами для поиска книг.
public class SearchEngine implements Searchable {
    private Catalog catalog;

    public SearchEngine(Catalog catalog) {
        this.catalog = catalog;
    }

    public SearchEngine() {

    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    @Override
    public String toString() {
        return "SearchEngine{" +
                "catalog=" + catalog +
                '}';
    }

    @Override
    public void searchByTitle(String title) {
        List<Book> matchingBooks = new ArrayList<>();

        for (Book book : catalog.getBooks()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                matchingBooks.add(book);
            }
        }

    }

    @Override
    public void searchByAuthor(String authorName) {
        List<Book> matchingBooks = new ArrayList<>();

        for (Book book : catalog.getBooks()) {
            for (Author author : book.getAuthors()) {
                if (author.getName().equalsIgnoreCase(authorName)) {
                    matchingBooks.add(book);
                    break;
                }
            }
        }
    }

    @Override
    public void searchByPublisher(String publisherName) {
        List<Book> matchingBooks = new ArrayList<>();

        for (Book book : catalog.getBooks()) {
            if (book.getPublisher().getName().equalsIgnoreCase(publisherName)) {
                matchingBooks.add(book);
            }
        }
    }
}
