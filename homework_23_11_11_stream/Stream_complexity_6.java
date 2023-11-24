package javaPro.saturday.homework_23_11_11_stream;

import java.time.LocalDate;
import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream_complexity_6 {

    //Получить список всех дат начала месяца из списка дат.
    public static List<LocalDate> getStartOfMonthDates(List<LocalDate> dates) {
        List<LocalDate> startsOfMonth = dates.stream()
                .map(date -> date.withDayOfMonth(1))
                .collect(Collectors.toList());
        return startsOfMonth;
    }

    //        Подсчитать сумму длин строк в списке, которые начинаются на "a".
    public static long sumStringLength(List<String> words) {
        return words.stream()
                .filter(el -> el.startsWith("a"))
                .mapToInt(String::length)
                .sum();

    }

    //        Найти среднее арифметическое всех чисел в списке.
    public static double findAverageNumber(List<Integer> numbers) {
        double avverageNumber = numbers.stream()
                .distinct()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        return avverageNumber;
    }

    //        Сгруппировать числа по их четности в списке.
    public static Map<Boolean, List<Integer>> groupByEven(List<Integer> numbers) {
        return numbers.stream()
                .collect(Collectors.groupingBy(el -> el % 2 == 0));
    }

    //        Преобразовать список целых чисел в карту, где ключ - это число, а значение - его квадрат.
    public static Map<Integer, Integer> listSquareNumbersMap(List<Integer> numbers) {
        return numbers.stream()
                .collect(Collectors.toMap(el -> el, el -> el * el));
    }

    //        Отфильтровать список строк, оставив только те, которые начинаются и заканчиваются на одну и ту же букву.
    public static List<String> stringsWithSameLetter(List<String> strings) {
        return strings.stream()
                .filter(el -> el.length() > 1 && el.toLowerCase().charAt(0) == el.toLowerCase().charAt(el.length() - 1))
                .collect(Collectors.toList());
    }

    //        Создать список всех префиксов строк из заданного списка.
    public static List<String> listAllPrefix(List<String> strings) {
        return strings.stream()
                .map(str -> str.length() >= 3 ? str.substring(0, 3) : str)
                .collect(Collectors.toList());
    }

    //          Преобразовать каждую строку в список ее символов.
    public static List<List<Character>> convertStringsToCharacter(List<String> strings) {
        List<List<Character>> charList = strings.stream()
                .map(word -> word.chars()
                        .mapToObj(el -> (char) el)
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());
        return charList;

    }
    public static void main(String[] args) {
        List<LocalDate> dates = List.of(
                LocalDate.of(2023, 11, 20),
                LocalDate.of(2023, 12, 21),
                LocalDate.of(2023, 1, 8),
                LocalDate.of(2023, 2, 18),
                LocalDate.of(2023, 3, 3)
        );

        System.out.println("Получить список всех дат начала месяца из списка дат: " + getStartOfMonthDates(dates));

        List<String> strings = Arrays.asList("apple", "banana", "orange", "peach", "pep", "!", "!");

        System.out.println("Подсчитать сумму длин строк в списке, которые начинаются на \"a\": " + sumStringLength(strings));

        List<Integer> numbers = List.of(10, -2, 8, 9, 5, 14, 28, 31, 55, 102);
        System.out.println("Найти среднее арифметическое всех чисел в списке: " + findAverageNumber(numbers));

        Map<Boolean, List<Integer>> groupByEven = groupByEven(numbers);
        List<Integer> evenNumbers = groupByEven.get(true);
        List<Integer> oddNumbers = groupByEven.get(false);
        System.out.println("Сгруппировать числа по их четности в списке: " + evenNumbers);
        System.out.println("Сгруппировать числа по их четности в списке: " + oddNumbers);

        System.out.println("Преобразовать список целых чисел в карту, где ключ - это число, а значение - его квадрат: " + listSquareNumbersMap(numbers));

        System.out.println("Отфильтровать список строк, оставив только те, которые начинаются и заканчиваются на одну и ту же букву: " + stringsWithSameLetter(strings));

        System.out.println("Создать список всех префиксов строк из заданного списка: " + listAllPrefix(strings));

        System.out.println("Преобразовать каждую строку в список ее символов: " + convertStringsToCharacter(strings));

    }
}


//        Найти элемент в списке строк, содержащий максимальное количество гласных.



