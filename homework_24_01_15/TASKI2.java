package javaPro.homework_210823.homework_24_01_15;

import java.util.*;
import java.util.stream.Collectors;

public class TASKI2 {

    //Напишите метод, который принимает список чисел и возвращает сумму квадратов всех нечетных чисел в списке.
    public static int sumOfSquaresOfOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(el -> el % 2 != 0)
                .mapToInt(el -> el * el)
                .sum();
    }

    //Напишите метод, который принимает список строк и возвращает список уникальных слов, отсортированных в лексикографическом порядке.
    public static List<String> uniqueSortedWords(List<String> strings) {
        List<String> sortedList = strings.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        return sortedList;
    }

    //Напишите метод, который принимает список строк и возвращает список строк, содержащих
    // только уникальные символы (т.е. символы, которые не повторяются в строке).
    public static List<String> uniqueChars(List<String> strings) {
        return strings.stream()
                .map(word -> word.chars()
                        .distinct()
                        .mapToObj(el -> String.valueOf((char) el))
                        .collect(Collectors.joining()))
                .collect(Collectors.toList());
    }

    //Напишите метод, который принимает список строк и возвращает самую длинную строку в списке.
    public static String longestString(List<String> strings) {
        String longestString = strings.stream()
                .max((strings1, strings2) -> strings1.length() - strings2.length())
                .orElse(null);

        return longestString;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sumNumbers = sumOfSquaresOfOddNumbers(numbers);
        System.out.println("сумма квадратов всех нечетных чисел в списке: " + sumNumbers);
        List<String> strings = Arrays.asList("Apple", "banana", "orange", "peach", "!", "!");
        System.out.println("список уникальных слов, отсортированных в лексикографическом порядке: " + uniqueSortedWords(strings));
        List<String> unique = uniqueChars(strings);
        System.out.println("Список строк, содержащих только уникальные символы : " + unique);
        String longestString = longestString(strings);
        System.out.println("Найти самую длинную строку в списке: " + longestString);
    }
}
