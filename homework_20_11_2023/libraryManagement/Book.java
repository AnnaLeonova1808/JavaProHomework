package javaPro.homework_210823.homework_20_11_2023.libraryManagement;

//Книга (Book)
//        Поля: название, автор, год издания.
//        Методы: вывод информации о книге, проверка на старинность (старше 50 лет).


public class Book {
    private String bookName;
    private String bookAuthor;
    private int bookYearPublishing;

    public Book(String bookName, String bookAuthor, int bookYearPublishing) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookYearPublishing = bookYearPublishing;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookYearPublishing() {
        return bookYearPublishing;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookYearPublishing(int bookYearPublishing) {
        this.bookYearPublishing = bookYearPublishing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookYearPublishing='" + bookYearPublishing + '\'' +
                '}';
    }


}
