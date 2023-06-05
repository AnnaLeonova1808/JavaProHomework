package javaPro.homework.Homework_SetAndTreeSet;

import java.util.HashSet;
import java.util.Set;

public class HomeworkSetAndHashSet {
    //1)Напишите метод на Java, который принимает на вход массив целых чисел и возвращает новый массив,
    // содержащий только уникальные значения из исходного массива. Дубликаты должны быть удалены.
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();//1
        Set<String> set2 = new HashSet<>();//2
        Set<Integer> valueSet = new HashSet<>();//3
        HashSet<Integer> hashSet1 = new HashSet<>();//4

        int[] value = {1, 2, 3, 5, 5, 8, 8};
        for (int i = 0; i < value.length; i++) {
            set.add(value[i]);
        }
        System.out.println(set);
        //2)Реализуйте функцию на Java, которая принимает на вход строку и
        // возвращает множество всех уникальных символов в этой строке. Регистр символов должен учитываться.
        set2.add("January");
        set2.add("January");
        set2.add("February");
        set2.add("february");
        set2.add("March");
        set2.add("April");
        set2.add("June");
        System.out.println(set2);

        //4)Реализуйте метод на Java, который принимает на вход два множества целых чисел и
        // возвращает новое множество, содержащее все элементы из обоих исходных множеств без повторений.

        hashSet1.add(5);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(1);
        hashSet1.add(8);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(3);
        hashSet2.add(5);
        hashSet2.add(8);

        HashSet<Integer> union = new HashSet<>(hashSet1);//выведет список элементов без повторяющихся, только уникальные
        union.addAll(hashSet2);
        System.out.println(union);


        //3)Напишите программу на Java, которая проверяет, содержит ли заданное множество только нечетные числа.
        // Множество представлено массивом целых чисел.
        valueSet.add(6);
        valueSet.add(8);
        valueSet.add(12);
        valueSet.add(10);
        valueSet.add(14);

        boolean containsOddValue = checkOddValue(valueSet);
        if (containsOddValue) {
            System.out.println("Содержит только нечетные числа");
        } else {
            System.out.println("Содержит только четные числа");
        }
    }

    public static boolean checkOddValue(Set<Integer> valueSet) {
        for (int value : valueSet) {
            if (value % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
