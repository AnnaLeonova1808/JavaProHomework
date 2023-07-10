package javaPro.Lessons.Stream_06_07;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tasks_06_07 {
    //Задача 1: Подсчет количества уникальных четных и нечетных чисел
    //List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
    public static void uniqueNumbers(List<Integer> integerList) {
        Map<Boolean, Long> booleanListMap = integerList.stream()
                .distinct()
                .collect(Collectors.partitioningBy(el -> el % 2 == 0, Collectors.counting()));

        long even = booleanListMap.get(true);
        long odd = booleanListMap.get(false);
        System.out.println("1) Even: " + even);
        System.out.println("1) Odd: " + odd);
        System.out.println("1)" + booleanListMap);
    }

    //Задача 2: Группировка строк по первым буквам и вывод первых двух слов из каждой группы
    //List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");
    public static void firstWord(List<String> stringList) {
        Map<Character, List<String>> characterListMap = stringList.stream()
                .collect(Collectors.groupingBy(chr -> chr.charAt(0)));

        System.out.println("2)" + characterListMap);
    }

    //Задача 3: Преобразование списков в строку и удаление повторяющихся символов
    //        List<List<String>> listOfLists = Arrays.asList(
    //                Arrays.asList("a", "b", "c"),
    //                Arrays.asList("d", "e", "f"),
    //                Arrays.asList("g", "h", "i")
    public static void remuveDublicate(List<List<String>> stringList) {
        List<String> str = stringList.stream()
                .flatMap(List::stream)
                .distinct()
                .toList();
        System.out.println("3)" + str);
    }

    //Задача 4: Фильтрация и умножение числа на 2
    //List<Integer> numbers2 = Arrays.asList(1, 3, 2, 6, 4, 5, 7, 8, 9);
    public static void filterNumber(List<Integer> integerList) {
        Object[] objects = integerList.stream()
                .sorted()
                .map(el -> el * 2)
                .toArray();

        System.out.println(Arrays.toString(objects));

    }

    //Задача 5: Разделение чисел на простые и составные
//List<Integer> numbers3 = Arrays.asList(2, 3, 4, 5, 67, 8, 9, 10, 11, 12, 13, 14, 15);
//
    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void separationNumber(List<Integer> integerList) {
        Map<Boolean, List<Integer>> booleanListMap = integerList.stream()
                .collect(Collectors.partitioningBy(Tasks_06_07::isPrime));

        List<Integer> list = booleanListMap.get(true);
        List<Integer> list1 = booleanListMap.get(false);

        System.out.println("5) Prime number: " + list);
        System.out.println("5) Composite number: " + list1);
    }

    //Задача 6: Получение уникальных символов из списка строк
    //List<String> words2 = Arrays.asList("apple", "banana", "cherry", "date");
    public static void uniqueChars(List<String> words) {
        List<Character> uniqueChars = words.stream()
                .flatMap(word -> word.chars().mapToObj(el -> (char) el))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(("6)Unique characters: " + uniqueChars));

    }

    //Задача 7: Разделение строк на отдельные слова и удаление повторений
    //List<String> sentences = Arrays.asList("Hello world", "Java is awesome", "Stream API is powerful");
    public static void splittingWordsAndRemovingRepetitions(List<String> words) {
        List<String> uniqueWords = words.stream()
                .flatMap(word -> Arrays.stream(word.split(" ")))
                .distinct()
                .toList();
        System.out.println("7)Unique words: " + uniqueWords);
    }

    //Задача 8: Фильтрация и преобразование строк toUpperCase
    //List<String> words3 = Arrays.asList("apple", "banana", "cherry", "date");
    public static void upperCaseWords(List<String> words) {
        List<String> upperCase = words.stream()
                .filter(word -> word.length() % 2 == 0)
                .map(String::toUpperCase)
                .toList();
        System.out.println("8) Word with even length upper case: " + upperCase);

    }

    //Задача 9: Получение среднего значения чисел
    //List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5);
    public static void averageNumbers(List<Integer> integerList) {
        double average = integerList.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println("9) Average numbers: " + average);

    }

    //Задача 10: Получение списка квадратов чисел
    //public static void averageNumbers(List<Integer> integerList) {
    public static void squareNumbers(List<Integer> integerList) {
        List<Integer> square = integerList.stream()
                .map(el -> el * el)
                .toList();
        System.out.println("10) Square Numbers: " + square);

    }

    //Задача 11: Группировка строк по длине
    //List<String> words4 = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
    public static void groupingStringsByLength(List<String> words) {
        Map<Integer, List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("11) Strings groups by length: " + groupedByLength);

    }

    //Задача 12: Проверка, содержатся ли строки в списке
    //List<String> words5 =Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
    //List<String> searchWords = Arrays.asList("banana", "fig", "grape");
    public static void containedOfString(List<String> words, List<String> searchWords) {
        boolean stringOfList = searchWords.stream()
                .allMatch(words::contains);
        System.out.println("12) Contained of string: " + stringOfList);
    }

    //Задача 13: Поиск первой строки, удовлетворяющей условию
    //List<String> words6 = Arrays.asList("apple", "banana", "cherry", "date");
    public static void searchFirstString(List<String> words) {
        Optional<String> searchString = words.stream()
                .filter(el -> el.startsWith("c"))
                .findFirst();
        System.out.println("13) First string: " + searchString);

    }

    //Задача 14: Сокращение списка до указанного размера
    //List<Integer> numbers6 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    public static void shortenTheList(List<Integer> numbers, int newSize) {
        String result = numbers.stream()
                .limit(newSize)
                .map(Objects::toString)
                .collect(Collectors.joining(", "));
        System.out.println("14)New list: "+result);

    }

    //Задача 15: Объединение двух списков в один
    //List<Integer> list1 = Arrays.asList(1, 2, 3);
    //List<Integer> list2 = Arrays.asList(4, 5, 6);
    public static void unionList(List<Integer> list1, List<Integer>list2) {
        List<Integer> union = Stream.concat(list1.stream(),list2.stream())
                .collect(Collectors.toList());
        System.out.println("15)Union lists: " + union);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        uniqueNumbers(numbers);
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");
        firstWord(words);
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e", "f"),
                Arrays.asList("g", "h", "i"));

        remuveDublicate(listOfLists);

        List<Integer> numbers3 = Arrays.asList(2, 3, 4, 5, 67, 8, 9, 10, 11, 12, 13, 14, 15);
        filterNumber(numbers);

        List<String> words2 = Arrays.asList("apple", "banana", "cherry", "date");

        separationNumber(numbers3);

        List<String> words3 = Arrays.asList("apple", "banana", "cherry", "date");
        uniqueChars(words3);

        List<String> sentences = Arrays.asList("Hello world", "Java is awesome", "Stream API is powerful");
        splittingWordsAndRemovingRepetitions(sentences);

        List<String> words4 = Arrays.asList("apple", "banana", "cherry", "date");

        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5);
        averageNumbers(numbers4);

        upperCaseWords(words3);

        squareNumbers(numbers4);

        List<String> words5 = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        groupingStringsByLength(words5);

        List<String> searchWords = Arrays.asList("banana", "fig", "grape");
        containedOfString(words5, searchWords);


        List<String> words6 = Arrays.asList("apple", "banana", "cherry", "date");
        searchFirstString(words6);

        List<Integer> numbers6 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        shortenTheList(numbers6, 2);

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        unionList(list1,list2);
    }
}

