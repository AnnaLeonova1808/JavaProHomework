package javaPro.homework_210823.homework_20_11_2023.libraryManagement;

public class Main {
    public static String infoBookAge(Book[] books) {
        int currentYear = 2023;

        for (int i = 0; i < books.length; i++) {
            int oldAge = currentYear - 50;
            Book book = books[i];
            if (book.getBookYearPublishing() < oldAge) {
                return book.getBookName();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("A", "A", 2023);
        books[1] = new Book("B", "B", 2022);
        books[2] = new Book("C", "C", 2021);
        books[3] = new Book("D", "D", 1920);
        books[4] = new Book("E", "E", 2000);

        System.out.println("Вывод информации о книге, проверка на старинность (старше 50 лет):" + infoBookAge(books));

        Reader reader1 = new Reader("Anna", (short) 25, books);
        Reader reader2 = new Reader("Katy", (short) 35, books);

        reader1.takeBook(books[0]);
        reader1.takeBook(books[1]);

        reader1.returnBook(books[3]);
        System.out.println(reader1);
        System.out.println(reader1);

        Librarian librarian = new Librarian("Y", (short) 5, new Book[4]);
        Librarian[] librarians = new Librarian[2];
        librarians[0] = new Librarian("X", (short) 2, new Book[3]);
        librarians[1] = new Librarian("Y", (short) 3, new Book[3]);
        librarian.giveBookFromReader(books[0]);
        librarian.acceptBook(books[1], reader1);
        System.out.println("выдать книгу читателю: " + books[1]);
        System.out.println("принять книгу от читателя: " + books[4]);


    }
}
