package javaPro.homework_All.homework_2023_11_22.taski.task_5_VirtualLlibraryCatalog;

import java.util.ArrayList;
import java.util.List;

//3.8. Класс Publisher:
//Поля: String name, String address, List<Book> publishedBooks.
//Методы для управления информацией о издателе.
public class Publisher {
    private String name;
    private String address;
    private List<Book> publishedBooks;

    public Publisher(String name, String address, List<Book> publishedBooks) {
        this.name = name;
        this.address = address;
        this.publishedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getPublishedBooks() {
        return publishedBooks;
    }

    public void setPublishedBooks(List<Book> publishedBooks) {
        this.publishedBooks = publishedBooks;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", publishedBooks=" + publishedBooks +
                '}';
    }
}
