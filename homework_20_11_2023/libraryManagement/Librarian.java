package javaPro.homework_210823.homework_20_11_2023.libraryManagement;

import java.util.Arrays;

//Библиотекарь (Librarian)
//Поля: имя, стаж работы, список доступных книг (массив).
//Методы: выдать книгу читателю, принять книгу от читателя.
public class Librarian {

    private String nameLibrarian;
    private short experienceWork;
    private Book[] accessibleBooks;

    public Librarian(String name, short experienceWork, Book[] accessibleBooks) {
        this.nameLibrarian = name;
        this.experienceWork = experienceWork;
        this.accessibleBooks = new Book [0];
    }

    public String getNameLibrarian() {
        return nameLibrarian;
    }

    public void setNameLibrarian(String nameLibrarian) {
        this.nameLibrarian = nameLibrarian;
    }

    public short getExperienceWork() {
        return experienceWork;
    }

    public void setExperienceWork(short experienceWork) {
        this.experienceWork = experienceWork;
    }

    public Book[] getAccessibleBooks() {
        return accessibleBooks;
    }

    public void setAccessibleBooks(Book[] accessibleBooks) {
        this.accessibleBooks = accessibleBooks;
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "name='" + nameLibrarian + '\'' +
                ", experienceWork=" + experienceWork +
                ", accessibleBooks=" + Arrays.toString(accessibleBooks) +
                '}';
    }

    public void giveBookFromReader(Book bookToGive) {
        if (accessibleBooks.length < 3) {
            accessibleBooks = Arrays.copyOf(accessibleBooks, accessibleBooks.length + 1);
            accessibleBooks[accessibleBooks.length - 1] = bookToGive;
            System.out.println(nameLibrarian + " выдал книгу: " + bookToGive);
        }
    }

    public void acceptBook(Book bookToAccept, Reader reader) {
        for (int i = 0; i < accessibleBooks.length; i++) {
            if (accessibleBooks[i] != null && accessibleBooks[i].equals(bookToAccept)) {
                reader.returnBook(bookToAccept);
                accessibleBooks[i] = null;
                System.out.println(nameLibrarian + " принял книгу от читателя: " + bookToAccept);
                return;
            }
        }
    }
}
