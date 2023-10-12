package javaPro.homework_07_10_3;

import java.util.Objects;


public class Book {
    private int bookId;
    private String bookTitle;
    private String bookAuthor;
    private String bookGenre;
    private String bookYear;
    private boolean bookAvailable;

    public Book(int bookId, String bookTitle, String bookAuthor, String bookGenre, String bookYear, boolean bookAvailable) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookGenre = bookGenre;
        this.bookYear = bookYear;
        this.bookAvailable = bookAvailable;
    }
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public String getBookYear() {
        return bookYear;
    }

    public void setBookYear(String bookYear) {
        this.bookYear = bookYear;
    }

    public boolean isBookAvailable() {
        return bookAvailable;
    }

    public void setBookAvailable(boolean bookAvailable) {
        this.bookAvailable = bookAvailable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return bookId == book.bookId && bookAvailable == book.bookAvailable && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(bookAuthor, book.bookAuthor) && Objects.equals(bookGenre, book.bookGenre) && Objects.equals(bookYear, book.bookYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, bookTitle, bookAuthor, bookGenre, bookYear, bookAvailable);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookGenre='" + bookGenre + '\'' +
                ", bookYear='" + bookYear + '\'' +
                ", bookAvailable=" + bookAvailable +
                '}';
    }
}
