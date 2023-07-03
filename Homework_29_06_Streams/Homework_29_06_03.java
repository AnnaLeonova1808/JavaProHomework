package javaPro.Homework_29_06_Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Homework_29_06_03 {
    //24) Дан список объектов Person с полем "возраст". Необходимо отфильтровать объекты,
    // возраст которых находится в диапазоне от 25 до 40 лет, отсортировать по имени и вывести результат.
    public static void filterPersons(List<Person> list) {
        List<Person> filtredList = list.stream()
                .filter(person -> person.getAge() >= 25 && person.getAge() <= 40)
                .sorted(Comparator.comparing(Person::getName))
                .toList();
        System.out.println(filtredList);

    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Person p1 = new Person("John", 15);
        Person p2 = new Person("Julia", 25);
        Person p3 = new Person("Sofi", 38);
        Person p4 = new Person("Bob", 20);
        Person p5 = new Person("Steve", 45);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);

        filterPersons(persons);
    }

    static class Person {
        private String name;
        private int age;

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
    }
}

