package javaPro.homework_All.homework_2023_11_22.taski.task_5_VirtualLlibraryCatalog;

import java.util.List;

//3.2. Класс Book:
//Поля: String title, Author author, Publisher publisher, int publicationYear.
//Методы: getDetails(), isAvailable().
public class Book {
    private String title;
    private Author author;
    private Publisher publisher;
    private int publicationYear;
    private List<Author> authors;

    public Book(String title, Author author, Publisher publisher, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", publisher=" + publisher +
                ", publicationYear=" + publicationYear +
                '}';
    }

    public void getDetails(String title, Author author, Publisher publisher, int publicationYear) {
        System.out.println("Book Details:");
        System.out.println("Title:" + title);
        System.out.println("Autor: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Publisher Year: " + publicationYear);
    }
    public boolean isAvailable() {
        int availableCopies = 2;
        if (availableCopies <= 2) {
            return true;
        }
        return false;
    }
    public List<Author> getAuthors() {
        return authors;
    }
}
