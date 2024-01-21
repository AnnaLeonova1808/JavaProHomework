package javaPro.homework_210823.homework_24_01_15;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tasks_24_01_15 {
    public static void main(String[] args) {
        // Задача 1: Собрать элементы потока в список.
        List<String> list = Stream.of("apple", "orange", "kiwi", "banana").collect(Collectors.toList());
        System.out.println("Собрать элементы потока в список: " + list);

        // Задача 2: Удалить дубликаты из списка и собрать их в множество.
        Set<String> set = Stream.of("apple", "orange", "kiwi", "banana", "banana").collect(Collectors.toSet());
        System.out.println("Удалить дубликаты из списка и собрать их в множество: " + set);

        // Задача 3: Группировка строк по длине.
        Map<Integer, List<String>> groupedByLength = Stream.of("apple", "orange", "kiwi", "banana")
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Группировка строк по длине: " + groupedByLength);

        // Задача 4: Подсчет повторяющихся элементов и создание мапа.
        Map<String, Long> elementsCount = Stream.of("apple", "orange", "kiwi", "banana")
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println("Подсчет повторяющихся элементов и создание мапа: " + elementsCount);

        // Задача 5: Собрать только уникальные элементы в список.
        List<String> uniqueList = Stream.of("apple", "orange", "kiwi", "banana")
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Собрать только уникальные элементы в список: " + uniqueList);

        // Задача 6: Объединение элементов в строку с максимальной длиной.
        String maxLength = Stream.of("apple", "orange", "kiwi", "banana")
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println("Объединение элементов в строку с максимальной длиной.: " + maxLength);

        // Задача 7: Разбиение строки на символы и сбор их в множество.
        Set<Character> characters = "apple".chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());
        System.out.println("Разбиение строки 'apple'на символы и сбор их в множество: " + characters);

        // Задача 8: Построение кастомной мапы из элементов.
        Map<String, Long> map = Stream.of("apple", "orange", "kiwi", "banana", "banana")
                .collect(Collectors.groupingBy(
                        el -> el,
                        Collectors.counting()));
        System.out.println("Построение кастомной мапы из элементов: " + map);

        // Задача 9: Подсчет суммы значений объектов.
        int totalQuantity = Stream.of(
                        new Fruct("apple", 25),
                        new Fruct("orange", 30),
                        new Fruct("kiwi", 35),
                        new Fruct("banana", 35))
                .mapToInt(Fruct::getQuantity)
                .sum();
        System.out.println("Подсчет суммы значений объектов " + totalQuantity);

        // Задача 10: Группировка по критерию и подсчет среднего.
        Map<String, Double> averageQuantityByName = Stream.of(
                        new Fruct("apple", 25),
                        new Fruct("orange", 30),
                        new Fruct("kiwi", 35),
                        new Fruct("kiwi", 15),
                        new Fruct("banana", 35))
                .collect(Collectors.groupingBy(Fruct::getName, Collectors.averagingInt(Fruct::getQuantity)));
        System.out.println("Группировка по критерию и подсчет среднего: " + averageQuantityByName);

    }
    static class Fruct {
        String name;

        int quantity;

        public Fruct(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }
}
