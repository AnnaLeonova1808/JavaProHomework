package javaPro.homework_210823.homework_20_11_2023.libraryManagement;

import javaPro.homework_210823.homework_20_11_2023.libraryManagement.Book;

import java.util.Arrays;

//Читатель (Reader)
//Поля: имя, возраст, список взятых книг (массив).
//Методы: взять книгу, вернуть книгу.
public class Reader {
    private String name;
    private short age;
    private Book[] takeBooks;

    public Reader(String name, short age, Book[] takeBooks) {
        this.name = name;
        this.age = age;
        this.takeBooks = new Book[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public Book[] getTakeBooks() {
        return takeBooks;
    }

    public void setTakeBooks(Book[] takeBooks) {
        this.takeBooks = takeBooks;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", takeBooks=" + Arrays.toString(takeBooks) +
                '}';
    }

    public void takeBook(Book bookToTake) {
        if (takeBooks.length < 3) {

            takeBooks = Arrays.copyOf(takeBooks, takeBooks.length + 1);
            takeBooks[takeBooks.length - 1] = bookToTake;
            System.out.println(name + " взял книгу: " + bookToTake);
        } else {
            System.out.println(name + " не может взять больше книг, у него уже есть максимальное количество.");
        }
    }

    public void returnBook(Book bookToReturn) {
        for (int i = 0; i < takeBooks.length; i++) {
            if (takeBooks[i].equals(bookToReturn)) {

                Book[] updatedBooks = new Book[takeBooks.length - 1];
                System.arraycopy(takeBooks, 0, updatedBooks, 0, i);
                System.arraycopy(takeBooks, i + 1, updatedBooks, i, takeBooks.length - i - 1);
                takeBooks = updatedBooks;
            }
        }

    }
}