package javaPro.saturday.homework_23_11_11_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream_complexity_6_2_7_2 {
    //        Отфильтровать список объектов по наличию определенного свойства.
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

    public static void filterPersons(List<Person> list) {
        List<Person> filtredList = list.stream()
                .filter(person -> person.getAge() >= 25 && person.getAge() <= 40)
                .sorted(Comparator.comparing(Person::getName))
                .toList();
        System.out.println(filtredList);
    }

    //        Создать список уникальных объектов по комбинации нескольких полей.
    public static List<Person> getUniQuePerson(List<Person> personList) {
        List<Person> uniqueList = personList.stream()
                .distinct()
                .toList();
        return personList;

    }

    //        Преобразовать список объектов в карту, где ключ - это уникальное свойство объекта.
    public static Map<Integer, Person> listToMap(List<Person> personList) {
        return personList.stream()
                .collect(Collectors.toMap(Person::getAge, person -> person));
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

        List<Person> uniquePerson = getUniQuePerson (persons);
        uniquePerson.forEach(System.out::println);

        Map<Integer, Person> personIntegerMap = listToMap(persons);
        personIntegerMap.forEach((age, person) -> {
            System.out.println("Преобразовать список объектов в карту, где ключ - это уникальное свойство объекта." + "Key: " + age + ", Value: " + person);
        });

    }
}
