package javaPro.saturday.homework_23_10_28;

/**
 * Требования:
 * <p>
 * Параметризуйте класс Comparator так, чтобы
 * он мог сравнивать только объекты класса Book или
 * его подклассы.
 * Добавьте в класс Book поле author и методы для его
 * получения и установки. Расширьте класс Comparator,
 * чтобы он мог сравнивать книги по авторам, если названия
 * одинаковы.
 */
public class Comparator<T extends Book> {
    public int compare(T a, T b) {
        if (a instanceof Book && b instanceof Book) {
            Book book1 = (Book) a;
            Book book2 = (Book) b;

            int titleComparasion = book1.getTitle().compareTo(book2.getTitle());
            if (titleComparasion == 0) {
                return book1.getAutor().compareTo(book2.getAutor());
            } else {
                return titleComparasion;
            }
        }
        return a.toString().compareTo(b.toString());
    }
}

class Book {
    private String title;
    private String autor;

    public Book(String title, String autor) {
        this.title = title;
        this.autor = autor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
