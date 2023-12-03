package javaPro.homework_All.homework_2023_11_22.taski.task_5_VirtualLlibraryCatalog;

import java.util.ArrayList;
import java.util.List;

//3.7. Класс Author:
//Поля: String name, String nationality, int birthYear, List<Book> books.
//Методы для управления информацией об авторе.
public class Author {
    private String name;
    private String nationality;
    private int birthYear;
    private List<Book> books;
    private List<Author> authors;

    public Author(String name, String nationality, int birthYear, List<Book> books) {
        this.name = name;
        this.nationality = nationality;
        this.birthYear = birthYear;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", birthYear=" + birthYear +
                ", books=" + books +
                '}';
    }
    public List<Author> getAuthors() {
        return authors;
    }

}
