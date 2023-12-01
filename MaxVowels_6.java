package javaPro.saturday.homework_23_11_11_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


//     Найти элемент в списке строк, содержащий максимальное количество гласных.
public class MaxVowels_6 {
    public static List<Map<String, Integer>>  findMaxVowels(List<String> strings) {
        List<Map<String, Integer>> maxVowels = strings.stream()
                .collect(Collectors.groupingBy(el -> el,
                        Collectors.summingInt(el -> (int) el.chars()
                                .filter(c -> "aeiou"
                                        .indexOf(c) != -1)
                                .count())))
                .entrySet()
                .stream()
                .map(entry -> Map.of(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
        int maxVowelCount = maxVowels.stream()
                .mapToInt(map -> map.entrySet().iterator().next().getValue())
                .max()
                .orElse(0);


        List<String> result = maxVowels.stream()
                .filter(map -> map.entrySet().iterator().next().getValue() == maxVowelCount)
                .map(map -> map.keySet().iterator().next())
                .collect(Collectors.toList());
        System.out.println("Найти элемент в списке строк, содержащий максимальное количество гласных: " + result);

        return maxVowels;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "peach");
        findMaxVowels(strings);
    }
}
