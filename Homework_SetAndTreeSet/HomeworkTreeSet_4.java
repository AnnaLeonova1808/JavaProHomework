package javaPro.homework.Homework_SetAndTreeSet;

import java.util.Set;
import java.util.TreeSet;

public class HomeworkTreeSet_4 {
    public static void main(String[] args) {

        Set<Student> set = new TreeSet<>();

        Student st1 = new Student("Elena", 5);
        Student st2 = new Student("Anna", 4);

        set.add(st1);
        set.add(st2);

        System.out.println(set);
        int comparisonResult = st1.compareTo(st2);
        System.out.println("Comparison Result:" + comparisonResult);
    }

    static class Student implements Comparable<Student> {
        String name;
        int grade;

        public Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", grade=" + grade +
                    '}';
        }

        @Override
        public int compareTo(Student o) {
            if (this.grade < o.grade) {
                return -1;
            } else if (this.grade > o.grade) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}


//Задача 4 name (тип String) - имя студента;
//grade (тип int) - оценка студента.
//Реализуйте интерфейс Comparable для класса Student, чтобы объекты Student могли быть сравниваемыми на
// основе оценки. При сравнении двух объектов Student должно возвращаться отрицательное число, если первый
// студент имеет более низкую оценку, положительное число, если первый студент имеет более высокую оценку,
// и ноль, если студенты имеют одинаковую оценку.


