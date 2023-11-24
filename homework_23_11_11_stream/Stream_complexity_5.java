package javaPro.saturday.homework_23_11_11_stream;

import java.util.*;
import java.util.stream.Collectors;

public class Stream_complexity_5 {
    //        Преобразовать список строк в список их длин.
    public static List<Integer> convertListStringToLength(List<String> strings) {
        List<Integer> length = strings.stream()
                .map(el -> el.length())
                .collect(Collectors.toList());
        return length;
    }

    //        Отфильтровать список чисел, оставив только четные.
    public static List<Integer> listOfEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(el -> el % 2 == 0)
                .collect(Collectors.toList());
    }

    //Получить список уникальных квадратов чисел из списка целых чисел.
    public static List<Integer> uniqeSquares(List<Integer> numbers) {
        Set<Integer> uniqeSquaresSet = new HashSet<>();
        for (Integer number : numbers) {
            int square = number * number;
            uniqeSquaresSet.add(square);
        }
        return new ArrayList<>(uniqeSquaresSet);
    }

    //        Подсчитать количество пустых строк в списке.
    public static long countEmptyStrings(List<String> stringList) {
        long strings = stringList.stream()
                .filter(str -> str.isEmpty())
                .count();

        return 0;
    }

    //        Соединить все строки из списка в одну строку через запятую.
    public static List<String> concaranteStringsSeparatedByCommas(List<String> stringList) {
        List<String> strings = stringList.stream()
                .flatMap(word -> Arrays.stream(word.split(",")))
                .toList();
        return stringList;

    }

    //        Найти максимальное число в списке целых чисел.
    public static int maxValue(List<Integer> value) {
        int maxV = value.stream()
                .filter(el -> el % 2 == 0)
                .max(Integer::compareTo)
                .orElse(0);

        return maxV;
    }

    //      Отсортировать список строк по алфавиту.
    public static List<String> sortListOfAlphabetically(List<String> stringList) {
        List<String> sortedList = stringList.stream()
                .sorted()
                .collect(Collectors.toList());
        return sortedList;
    }

    //      Преобразовать список целых чисел в список их факториалов.
    public static int factorial(int e) {
        if (e < 0) {
            System.out.println("Факториал не определен для отрицательных чисел. Возвращено значение по умолчанию (1).");
            return 1;
        }

        int result = 1;
        for (int i = 1; i <= e; i++) {
            result *= i;
        }
        return result;
    }

    //Получить список первых N простых чисел из заданного списка.
    public static List<Integer> getFirstNPrimes(List<Integer> numbers) {
        List<Integer> primes = new ArrayList<>();
        for (int num : numbers) {
            if (isPrime(num)) {
                primes.add(num);
                if (primes.size() == 3) {
                    break;
                }
            }
        }
        return primes;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    //        Найти минимальное нечетное число в списке.
    public static List<Integer> minChetNumber(List<Integer> value) {
        List<Integer> minChet = Collections.singletonList(value.stream()
                .filter(el -> el % 2 == 0)
                .min(Integer::compareTo)
                .orElse(null));

        return minChet;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "JAVA", "", "!", "!", "!");

        System.out.println(Arrays.toString((strings.toArray())));
        List<Integer> length = convertListStringToLength(strings);
        System.out.println(length);

        List<Integer> numbers = List.of(10, -2, 8, 9, 5, 14, 28, 31, 55, 102);
        List<Integer> evenNumbers = listOfEvenNumbers(numbers);
        System.out.println("Cписок чисел, только четные: " + evenNumbers);

        List<Integer> uniqeSquare = uniqeSquares(numbers);
        System.out.println("Список уникальных квадратов чисел: " + uniqeSquare);

        long emptyStringCount = countEmptyStrings(strings);
        System.out.println("Подсчитать количество пустых строк в списке: " + emptyStringCount);

        List<String> concaranteStrings = concaranteStringsSeparatedByCommas(strings);
        System.out.println("Соединить все строки из списка в одну строку через запятую: " + String.join(",",
                concaranteStrings));

        int max = maxValue(numbers);
        System.out.println("Найти максимальное число в списке целых чисел: " + max);

        List<String> sorted = sortListOfAlphabetically(strings);
        System.out.println("Отсортировать список строк по алфавиту: " + sorted);

        List<Integer> factorials = numbers.stream()
                .map(Stream_complexity_5::factorial)
                .collect(Collectors.toList());
        System.out.println("Преобразовать список целых чисел в список их факториалов: " + factorials);

        List<Integer> firstThreePrimes = getFirstNPrimes(numbers);
        System.out.println("Получить список первых N простых чисел из заданного списка: " + firstThreePrimes);

        List<Integer> minChet = minChetNumber(numbers);
        System.out.println("Найти минимальное нечетное число в списке" + minChet);

    }
}





