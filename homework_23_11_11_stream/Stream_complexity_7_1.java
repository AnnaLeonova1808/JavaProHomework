package javaPro.saturday.homework_23_11_11_stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_complexity_7_1 {
    //        Найти количество уникальных слов в строке, используя Stream API.
    public static long uniqeWordCount(List<String> list) {
        long count = list.stream()
                .filter(el -> !el.isEmpty())
                .distinct()
                .count();

        return count;
    }

    //        Преобразовать карту в список строк, представляющих "ключ=значение".
    public static List<String> mapToList(Map<Integer, String> map) {
        List<String> list = map.entrySet()
                .stream()
                .map(el -> el.getKey() + " = " + el.getValue())
                .collect(Collectors.toList());
        return list;

    }

    //Получить список всех чисел Фибоначчи до заданного предела.
    public static List<Long> fibonacciNumbers(final int index) {
        return Stream.iterate(new long[]{0, 1}, arr -> new long[]{arr[1], arr[0] + arr[1]})
                .limit(index + 1)
                .map(y -> y[0])
                .collect(Collectors.toList());
    }

    //        Сгруппировать строки по длине их первого слова.
    public static Map<Integer, List<String>> groupByLength(List<String> strings) {
        Map<Integer, List<String>> groupedByLength = strings.stream()
                .filter(el -> !el.isEmpty())  // Исключаем пустые строки
                .collect(Collectors.groupingBy(el -> el.split("\\s+")[0].length()));

        return groupedByLength;
    }

    //        Создать Stream из элементов массива и преобразовать его в список их логарифмов.
    public static List<Double> logarithmList(List<Integer> values) {
        return values.stream()
                .mapToDouble(Integer::doubleValue)
                .map(Math::log)
                .boxed()
                .collect(Collectors.toList());
    }

    // Преобразовать список строк в карту, где ключ - первый символ строки, а значение - список строк, начинающихся
    // на этот символ.
    public static Map<Character, List<String>> stringMapCharList(List<String> strings) {
        Map<Character, List<String>> stringMap = strings.stream()
                .collect(Collectors.groupingBy(el -> el.charAt(0)));

        return stringMap;
    }

    //        Найти самую длинную строку в списке.
    public static String longestStringInList(List<String> strings) {
        String longestString = strings.stream()
                .max((strings1, strings2) -> strings1.length() - strings2.length())
                .orElse(null);

        return longestString;
    }

    //        Подсчитать общее количество слов в списке предложений.
    public static long countTotalWords(List<String> words) {
       return words.stream()
                .flatMap(word -> Arrays.stream(word.split("\\s+")))
                .count();
    }


    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "banana", "orange", "peach", "!", "!");
        List<Integer> values = List.of(5, 8, 11, 0, 13, 15, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Найти количество уникальных слов в строке, используя Stream API." + uniqeWordCount(strings));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        List<String> resultList = mapToList(map);
        resultList.forEach(System.out::println);

        int n = 10;
        List<Long> fibonacciNumbers = fibonacciNumbers(n);
        System.out.println("Получить список всех чисел Фибоначчи до заданного предела:  " + n + fibonacciNumbers);

        Map<Integer, List<String>> groupedByLength = groupByLength(strings);
        groupedByLength.forEach((length, group) -> {
            System.out.println("Длина первого слова " + length + ": " + group);
        });

        List<Double> logarithms = logarithmList(values);
        System.out.println("Создать Stream из элементов массива и преобразовать его в список их логарифмов: " + logarithms);

        Map<Character, List<String>> stringMap = stringMapCharList(strings);
        stringMap.forEach((key, val) -> {
            System.out.println("Преобразовать список строк в карту, где ключ - первый символ строки, а значение - список" +
                    " строк, начинающихся на этот символ." + "Key: " + key + ", Values: " + val);
        });

        String longestString = longestStringInList(strings);
        System.out.println("Найти самую длинную строку в списке: " + longestString);

        long totalWords = countTotalWords(strings);
        System.out.println("Подсчитать общее количество слов в списке предложений: " + totalWords);
    }
}
