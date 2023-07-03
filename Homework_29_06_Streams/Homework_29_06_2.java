package javaPro.Homework_29_06_Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Homework_29_06_2 {
    //4)Дан список чисел. Необходимо найти наименьшее число, больше 0.
    public static void minValue(List<Integer> value) {
        int minV = value.stream()
                .filter(el -> el > 0)
                .min(Integer::compareTo)
                .orElse(0);
        System.out.println(minV);

    }

    //5)Дан список чисел. Необходимо найти сумму квадратов всех положительных чисел.
    public static int sumOfSquaresOfPositiveNumbers(List<Integer> value) {
        int sum = value.stream()
                .filter(el -> el > 0)
                .mapToInt(el -> el * el)
                .sum();
        return sum;
    }

    //6) Даны два списка чисел. Необходимо объединить их в один список,
    // отсортировать по убыванию и удалить повторяющиеся элементы.
    public static void mergeSortRemoveDuplicates(List<Integer> value, List<Integer> value2) {
        List<Integer> mergeSort = Stream.concat(value.stream(), value2.stream())
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(mergeSort);

    }

    //8)Дан список чисел. Необходимо найти второе максимальное число.
    public static Integer secondMaxNumbers(List<Integer> value) {
        return value.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
    }

    //13) Даны два списка чисел. Необходимо найти разность множеств
    // (элементы, присутствующие только в одном из списков) и вывести результат.
    public static void uniqueNumbers(List<Integer> value, List<Integer> value2) {

        List<Integer> difference = value.stream()
                .filter(number -> !value2.contains(number))
                .collect(Collectors.toList());
        System.out.println(difference);

    }

    //17) Дан список чисел. Необходимо найти среднее значение всех уникальных чисел.
    public static void averageOfUniqueNumbers(List<Integer> value) {
        double average = value.stream()
                .distinct()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println(average);

    }

    //21)Дан список чисел. Необходимо найти максимальное четное число.
    public static List<Integer> maxChetNumber(List<Integer> value) {
        List<Integer> maxChet = Collections.singletonList(value.stream()
                .filter(el -> el % 2 == 0)
                .max(Integer::compareTo)
                .orElse(null));

        return maxChet;
    }

    //25)Дан список чисел. Необходимо найти сумму всех четных чисел, которые являются положительными.
    public static Integer sumOfChetAndPositiveNumbers(List<Integer> value) {
        int sumOfPositive = value.stream()
                .filter(el -> el > 0 && el % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        return sumOfPositive;
    }

    //26) Дан список чисел. Необходимо найти второе минимальное число среди уникальных чисел.
    public static Integer secondMinNumbers(List<Integer> value2) {
        int secondMin = value2.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(0);
        System.out.println("Второе минимальное среди уникальных:" + secondMin);
        return null;
    }

    //29)Дан список чисел. Необходимо найти три наименьших числа и вывести результат.
    public static void minThreeNumbers(List<Integer> value) {
        value.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::print);
    }

    public static void main(String[] args) {
        List<Integer> value = List.of(-1, -2, -3, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> value2 = List.of(5, 8, 11, 0, 13, 15, 3, 4, 5, 6, 7, 8, 9);
        minValue(value);

        int result = sumOfSquaresOfPositiveNumbers(value);//4
        System.out.println(result);

        mergeSortRemoveDuplicates(value, value2);//6

        Integer secondMax = secondMaxNumbers(value);//8
        System.out.println(secondMax);

        uniqueNumbers(value, value2);//13

        averageOfUniqueNumbers(value); //17

        List<Integer> maxChet = maxChetNumber(value);//21
        System.out.println(maxChet);

        Integer sum = sumOfChetAndPositiveNumbers(value);//25
        System.out.println("Сумма положительных чисел: " + sum);

        secondMinNumbers(value2);//26

        minThreeNumbers(value);//29

    }
}
