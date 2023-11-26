package javaPro.homework_210823.homework_20_11_2023.libraryManagement;

import java.util.Arrays;

//Библиотека (Library)
//Поля: название, адрес, список библиотекарей (массив).
//Методы: добавить библиотекаря, найти библиотекаря по имени.
public class Library {
    private String name;
    private String address;
    private Librarian[] librarian;

    public Library(String name, String adress, Librarian[] librarian) {
        this.name = name;
        this.address = adress;
        this.librarian = librarian;
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

    public Librarian[] getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian[] librarian) {
        this.librarian = librarian;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", adress='" + address + '\'' +
                ", librarian=" + Arrays.toString(librarian) +
                '}';
    }

    public void addLibrarian(Librarian librarian, Librarian[] librarians) {
        for (int i = 0; i < librarians.length; i++) {
            if (librarians[i] == null) {
                librarians[i] = librarian;
            }
        }
    }

    public Librarian findLibrarianByName(String librarianName, Librarian[] librarians) {
        for (Librarian librarian : librarians) {
            if (librarian != null && librarian.getNameLibrarian().equals(librarianName)) {
                return librarian;
            }
        }
        return null;
    }
}
