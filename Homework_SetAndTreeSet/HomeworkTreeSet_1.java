package javaPro.homework.Homework_SetAndTreeSet;

import java.util.Set;
import java.util.TreeSet;

public class HomeworkTreeSet_1 {
    //Напишите класс Person, который имеет следующие поля:
//
//
//name (тип String) - имя человека;
//age (тип int) - возраст человека.
//Реализуйте интерфейс Comparable для класса Person, чтобы объекты Person могли быть сравниваемыми на основе
// возраста. При сравнении двух объектов Person должно возвращаться отрицательное число, если первый объект
// младше второго, положительное число, если первый объект старше второго, и ноль, если объекты равны по
// возрасту.
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>();

        Person p1 = new Person("Elena", 27);
        Person p2 = new Person("Irina", 26);
        Person p3 = new Person("Tatyana", 25);
        Person p4 = new Person("Anna", 28);

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        System.out.println(set);
        int comparisonResult = p1.compareTo(p2);
        System.out.println("Comparison Result: " + comparisonResult);
    }

    static class Person implements Comparable<Person> {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;


        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public int compareTo(Person o) {
            if (this.age < o.age) {
                return -1;
            } else if (this.age > o.age) {
                return 1;
            } else {
                return 0;
            }

        }
    }
}

//Задача 2 Напишите класс Book, который имеет следующие поля:
//title (тип String) - название книги;
//author (тип String) - автор книги;
//publicationYear (тип int) - год публикации.
//Реализуйте интерфейс Comparable для класса Book, чтобы объекты Book могли быть сравниваемыми на
// основе года публикации. При сравнении двух объектов Book должно возвращаться отрицательное число,
// если первая книга была опубликована раньше второй, положительное число, если первая книга была опубликована
// позже второй, и ноль, если книги были опубликованы в один и тот же год.

//Задача 3  Напишите класс Product, который имеет следующие поля:
//name (тип String) - название продукта;
//price (тип double) - цена продукта.
//Реализуйте интерфейс Comparable для класса Product, чтобы объекты Product могли быть сравниваемыми на
// основе цены. При сравнении двух объектов Product должно возвращаться отрицательное число, если первый
// продукт дешевле второго, положительное число, если первый продукт дороже второго, и ноль, если продукты
// имеют одинаковую цену.

//Задача 4 name (тип String) - имя студента;
//grade (тип int) - оценка студента.
//Реализуйте интерфейс Comparable для класса Student, чтобы объекты Student могли быть сравниваемыми на
// основе оценки. При сравнении двух объектов Student должно возвращаться отрицательное число, если первый
// студент имеет более низкую оценку, положительное число, если первый студент имеет более высокую оценку,
// и ноль, если студенты имеют одинаковую оценку.

//Задача 5 Напишите класс Country, который имеет следующие поля:
//name (тип String) - название страны;
//population (тип int) - население страны.
//Реализуйте интерфейс Comparable для класса Country, чтобы объекты Country могли быть сравниваемыми на основе населения.
// При сравнении двух объектов Country должно возвращаться отрицательное число, если первая страна имеет
// меньшее население, положительное число, если первая страна имеет большее население, и ноль, если страны
// имеют одинаковое население.
