package javaPro.homework.Homework_SetAndTreeSet;

import java.util.Set;
import java.util.TreeSet;

public class HomeworkTreeSet_2 {
    public static void main(String[] args) {
        Set<Book> set = new TreeSet<>();
        Book bk1 = new Book("Gone with the wind", "Margaret Mitchell", 1936);
        Book bk2 = new Book("Java Сomplete guide", "Herbert Schildt", 2022);
        set.add(bk1);
        set.add(bk2);
        System.out.println(set);
        int comparisonResult = bk1.compareTo(bk2);
        System.out.println("Comparison Result:" + comparisonResult);
    }

    static class Book implements Comparable<Book> {
        String name;
        String author;
        int publicationYear;

        public Book(String name, String author, int publicationYear) {
            this.name = name;
            this.author = author;
            this.publicationYear = publicationYear;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }



        @Override
        public int compareTo(Book o) {
            if (this.publicationYear < o.publicationYear) {
                return -1;
            } else if (this.publicationYear > o.publicationYear) {
                return 1;
            } else {
                return 0;
            }
        }

        @Override
        public String toString() {
            return "Book{" +
                    "name='" + name + '\'' +
                    ", author='" + author + '\'' +
                    ", publicationYear=" + publicationYear +
                    '}';
        }
    }
}
//Напишите класс Book, который имеет следующие поля:
//
//
//title (тип String) - название книги;
//author (тип String) - автор книги;
//publicationYear (тип int) - год публикации.
//Реализуйте интерфейс Comparable для класса Book, чтобы объекты Book могли быть сравниваемыми на основе года
// публикации. При сравнении двух объектов Book должно возвращаться отрицательное число, если первая книга была
// опубликована раньше второй, положительное число, если первая книга была опубликована позже второй, и ноль,
// если книги были опубликованы в один и тот же год.
