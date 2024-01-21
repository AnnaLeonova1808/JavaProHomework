package javaPro.homework_210823.homework_24_01_15;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
//Напишите метод, который принимает список объектов и возвращает новый список, содержащий
// только объекты, у которых определенное поле имеет заданное значение.
public class FieldFilter {
    public static <T> List<T> filterByField(List<T> objects, String fieldName, Object value)
            throws NoSuchFieldException {

        Field field = getField(objects.get(0).getClass(), fieldName);
        field.setAccessible(true);

        List<T> filteredList = new ArrayList<>();

        for (T obj : objects) {
            Object fieldValue = null;
            try {
                fieldValue = field.get(obj);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
            if (fieldValue != null && fieldValue.equals(value)) {
                filteredList.add(obj);
            }
        }

        return filteredList;
    }

    private static Field getField(Class<?> clazz, String fieldName) throws NoSuchFieldException {
        try {
            return clazz.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            if (clazz.getSuperclass() != null) {
                return getField(clazz.getSuperclass(), fieldName);
            }
            throw e;
        }
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
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

    public static void main(String[] args) throws NoSuchFieldException {
        List<Person> persons = List.of(
                new Person("John", 15),
                new Person("Julia", 25),
                new Person("Sofi", 38),
                new Person("Bob", 20),
                new Person("Steve", 45));
        List<Person> filteredList = filterByField(persons, "age", 20);
        System.out.println("Отфильтровать список по полю значения 'age' = 20" + filteredList);
    }
}