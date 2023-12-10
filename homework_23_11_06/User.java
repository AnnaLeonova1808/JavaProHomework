package javaPro.homework_210823.homework_23_11_06;
//Создайте класс User с полями name и age, реализующий Comparable
//для сортировки по возрасту. Используйте TreeMap<User, String>
//для хранения информации о пользователях и переберите его, чтобы напечатать имена.
//
//**Создайте TreeMap<User, String> (класс User как в задаче 3), но на
//этот раз реализуйте Comparator<User>, чтобы сортировать пользователей по имени.
//
//**Создайте два HashMap<String, User> (класс User как в задаче 3) и
//объедините их в один, удалив дубликаты пользователей.
//
//**Создайте HashMap<Integer, String> и перепишите его в TreeMap<String, Integer>,
//инвертируя ключи и значения.
//
//**Создайте HashMap<String, Integer>, переберите её и создайте List<Integer>,
//содержащий все значения HashMap.
//
//**Создайте TreeMap<String, Integer> и переберите его, создавая HashMap<Integer, String>,
//включающий только те записи, где значение больше 50.
//
//**Создайте HashMap<String, List<Integer>>, где ключ - это имя, а значение - список оценок.
//Используйте TreeMap<Integer, List<String>> для создания отображения
//"средняя оценка - список студентов с этой оценкой".

import java.util.Objects;

public class User implements Comparable <User>{

    private String name;
    private int age;

    public User(String name, int age) {
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
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getAge() == user.getAge() && Objects.equals(getName(), user.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public int compareTo(User o) {
        return Integer.compare(this.age,o.age);
    }
}
