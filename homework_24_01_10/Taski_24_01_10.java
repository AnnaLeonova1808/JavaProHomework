package javaPro.homework_210823.homework_24_01_10;

import java.util.*;
import java.util.stream.Collectors;

public class Taski_24_01_10 {
    //    1. Задача: Фильтрация списка строк по длине.
    //        Сигнатура: List<String> filterByLength(List<String> input, int length);
    public static List<String> filterByLength(List<String> input, int length) {
        String result = input.stream()
                .filter(str -> str.length() == length)
                .collect(Collectors.toList()).toString();
        return Collections.singletonList(result);
    }


    //2. Задача: Преобразование всех строк в верхний регистр.
    //    Сигнатура: List<String> toUpperCase(List<String> input);
    public static List<String> toUpperCase(List<String> input) {
        String result = input.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList()).toString();
        return Collections.singletonList(result);
    }

    //3. Задача: Поиск первой строки, начинающейся на заданную букву.
    //    Сигнатура: Optional<String> findFirstStartingWith(List<String> input, char letter);
    public static Optional<String> findFirstStartingWith(List<String> input, char letter) {
        String result = input.stream()
                .filter(el -> el.startsWith("A"))
                .findFirst()
                .orElse(String.valueOf(0));

        return Optional.of(result);
    }

    //4. Задача: Соединение строк через запятую.
    //    Сигнатура: String joinByComma(List<String> input);
    public static String joinByComma(List<String> input) {
        String result = input.stream()
                .collect(Collectors.joining(","));

        return result;
    }


    //5. Задача: Подсчёт количества строк, содержащих заданный символ.
    //    Сигнатура: long countContainingChar(List<String> input, char ch);
    public static long countContainingChar(List<String> input, char ch) {
        long result = input.stream()
                .filter(el -> el.contains(String.valueOf(ch)))
                .count();
        return result;

    }

    //    Целые числа (Integers):
    //    6. Задача: Найти сумму всех чисел в списке.
    //    Сигнатура: int sumOfList(List<Integer> input);
    public static int sumOfList(List<Integer> input1) {
        int sumNumbers = input1.stream()
                .mapToInt(Integer::intValue)
                .sum();
        return sumNumbers;

    }

    //      7. Задача: Получить список квадратов чисел.
    //    Сигнатура: List<Integer> getSquares(List<Integer> input);
    public static List<Integer> getSquares(List<Integer> input1) {
        List<Integer> square = input1.stream()
                .map(el -> el * el)
                .toList();
        return square;
        //System.out.println("10) Square Numbers: " + square);

    }

    //8. Задача: Фильтрация чисел, больших заданного значения.
    //    Сигнатура: List<Integer> filterGreaterThan(List<Integer> input, int minValue);
    public static List<Integer> filterGreaterThan(List<Integer> input1, int minValue) {
        return input1.stream()
                .filter(el -> el > minValue)
                .collect(Collectors.toList());
    }

    //9. Задача: Проверка, содержит ли список заданное число.
    //            Сигнатура: boolean containsNumber(List<Integer> input, int number);
    public static boolean containsNumber(List<Integer> input1, int number) {
        return input1.contains(number);

    }

    //10. Задача: Найти максимальное число в списке.
    //            Сигнатура: Optional<Integer> findMax(List<Integer> input);
    public static Optional<Integer> findMax(List<Integer> input1) {
        return input1.stream()
                .max(Integer::compare);
    }

    //    Символы (Characters):
    //            11. Задача: Преобразование списка символов в список строк.
    //    Сигнатура: List<String> convertToStringList(List<Character> input);
    public static List<String> convertToStringList(List<Character> input2) {
        return input2.stream()
                .map(Objects::toString)
                .collect(Collectors.toList());
    }

    //12. Задача: Фильтрация символов по ASCII-значению.
    //    Сигнатура: List<Character> filterByAsciiValue(List<Character> input, int ascii);
    public static List<Character> filterByAsciiValue(List<Character> input2, int ascii) {
        return input2.stream()
                .filter(ch -> (int) ch == ascii)
                .collect(Collectors.toList());
    }

    //13. Задача: Проверка, все ли символы в списке заглавные.
    //    Сигнатура: boolean areAllUpperCase(List<Character> input);
    public static boolean areAllUpperCase(List<Character> input2) {
        return input2.stream()
                .allMatch(Character::isUpperCase);
    }

    //14. Задача: Найти первый повторяющийся символ.
    //    Сигнатура: Optional<Character> findFirstDuplicate(List<Character> input);
    public static Optional<Character> findFirstDuplicate(List<Character> input2) {
        Set<Character> seenCharacters = new HashSet<>();

        for (Character ch : input2) {
            if (!seenCharacters.add(ch)) {
                return Optional.of(ch);
            }
        }
        return Optional.empty();
    }

    //15. Задача: Получить обратный список символов.
    //    Сигнатура: List<Character> reverseList(List<Character> input);
    public static List<Character> reverseList(List<Character> input2) {
        List<Character> reverseList = input2.stream()
                .collect(Collectors.toList());
        Collections.reverse(reverseList);
        return reverseList;
    }

    //    Числа с плавающей точкой (Floats):
    //            16. Задача: Найти минимальное число в списке.
    //            Сигнатура: Optional<Float> findMin(List<Float> input);
    public static Optional<Float> findMin(List<Float> inputFloat) {
        return inputFloat.stream()
                .min(Float::compare);
    }

    //17. Задача: Получить список чисел, умноженных на заданное число.
    //    Сигнатура: List<Float> multiplyBy(List<Float> input, float multiplier);
    public static List<Float> multiplyBy(List<Float> inputFloat, float multiplier) {
        return inputFloat.stream()
                .map(el -> el * multiplier)
                .collect(Collectors.toList());
    }

    //18. Задача: Отфильтровать числа, меньшие заданного значения.
    //    Сигнатура: List<Float> filterLessThan(List<Float> input, float value);
    public static List<Float> filterLessThan(List<Float> inputFloat, float value) {
        return inputFloat.stream()
                .filter(el -> el < value)
                .collect(Collectors.toList());
    }

    //19. Задача: Проверить, содержит ли список отрицательные числа.
    //            Сигнатура: boolean containsNegative(List<Float> input);
    public static boolean containsNegative(List<Float> inputFloat) {
        return inputFloat.stream()
                .anyMatch(el -> el < 0);
    }

    //20. Задача: Округление всех чисел в списке до ближайшего целого.
    //    Сигнатура: List<Integer> roundNumbers(List<Float> input);
    public static List<Integer> roundNumbers(List<Float> inputFloat) {
        return inputFloat.stream()
                .map(Math::round)
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }

    //    Общие задачи для всех типов:**
    //    21. Задача: Найти количество уникальных элементов в списке.
    //    Сигнатура: <T> long countUnique(List<T> input);;
    public static <T> long countUnique(List<T> input) {
        Set<T> uniqueSet = new HashSet<>(input);
        return uniqueSet.size();
    }

    //22. Задача: Определить, является ли список отсортированным.
    //    Сигнатура: <T extends Comparable<T>> boolean isSorted(List<T> input);
    public static <T extends Comparable<T>> boolean isSorted(List<T> input) {
        for (int i = 0; i < input.size() - 1; i++) {
            if (input.get(i).compareTo(input.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }

    //23. Задача: Получить последний элемент списка, если он существует.
    //    Сигнатура: <T> Optional<T> getLastElement(List<T> input);
    public static <T> Optional<T> getLastElement(List<T> input) {
        int size = input.size();
        if (size == 0) {
            return Optional.empty();
        }
        return Optional.of(input.get(size - 1));
    }

    //24. Задача: Перемешать элементы списка.
    //    Сигнатура: <T> List<T> shuffleList(List<T> input);
    public static <T> List<T> shuffleList(List<T> input) {
        List<T> shuffledList = new ArrayList<>(input);
        Collections.shuffle(shuffledList);
        return shuffledList;
    }

    //25. Задача: Подсчитать частоту каждого элемента в списке.
    //    Сигнатура: <T> Map<T, Long> countFrequency(List<T> input);
    public static <T> Map<T, Long> countFrequency(List<T> input) {
        Map<T, Long> frequencyMap = new HashMap<>();

        for (T element : input) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0L) + 1);
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("January", "February", "March", "April", "May", "March", "march", "January");
        List<Integer> input1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Character> input2 = Arrays.asList('J', 'a', 'n', 'u', 'a', 'r', 'y');
        List<Float> inputFloat = Arrays.asList(1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f);

        System.out.println("1. Задача: Фильтрация списка строк по длине: " + filterByLength(input, 5));
        System.out.println("2. Задача: Преобразование всех строк в верхний регистр: " + toUpperCase(input));
        System.out.println("3. Задача: Поиск первой строки, начинающейся на заданную букву: " + findFirstStartingWith(input, 'A'));
        System.out.println("4. Задача: Соединение строк через запятую: " + joinByComma(input));
        System.out.println("5. Задача: Подсчёт количества строк, содержащих заданный символ: " + countContainingChar(input, 'i'));
        System.out.println("6. Задача: Найти сумму всех чисел в списке: " + sumOfList(input1));
        System.out.println("7. Задача: Получить список квадратов чисел: " + getSquares(input1));
        System.out.println("8. Задача: Фильтрация чисел, больших заданного значения:  " + filterGreaterThan(input1, 5));
        System.out.println("9. Задача: Проверка, содержит ли список заданное число:  " + containsNumber(input1, 5));
        System.out.println("10. Задача: Найти максимальное число в списке:  " + findMax(input1));
        System.out.println("11. Задача: Преобразование списка символов в список строк:  " + convertToStringList(input2));
        System.out.println("12. Задача: Фильтрация символов по ASCII-значению:  " + filterByAsciiValue(input2, 97));
        System.out.println("13. Задача: Проверка, все ли символы в списке заглавные:  " + areAllUpperCase(input2));
        System.out.println("14. Задача: Найти первый повторяющийся символ:  " + findFirstDuplicate(input2));
        System.out.println("15. Задача: Получить обратный список символов:  " + reverseList(input2));
        System.out.println("16. Задача: Найти минимальное число в списке:  " + findMin(inputFloat));
        System.out.println("17. Задача: Получить список чисел, умноженных на заданное число:  " + multiplyBy(inputFloat, 2));
        System.out.println("18. Задача: Отфильтровать числа, меньшие заданного значения:  " + filterLessThan(inputFloat, 2));
        System.out.println("19. Задача: Проверить, содержит ли список отрицательные числа:  " + containsNegative(inputFloat));
        System.out.println("20. Задача: Округление всех чисел в списке до ближайшего целого:  " + roundNumbers(inputFloat));
        System.out.println("21. Задача: Найти количество уникальных элементов в списке:  " + countUnique(input));
        System.out.println("22. Задача: Определить, является ли список отсортированным:  " + isSorted(input));
        System.out.println("23. Задача: Получить последний элемент списка, если он существует:  " + getLastElement(input));
        System.out.println("23. Задача: Получить последний элемент списка, если он существует:  " + getLastElement(input));
        List<String> shuffledStringList = shuffleList(input);
        System.out.println("24. Задача: Перемешать элементы списка:  " + shuffledStringList);
        System.out.println("25. Задача: Подсчитать частоту каждого элемента в списке:  " + countFrequency(input));
    }
}
