package javaPro.homework_210823.homework_23_11_27;
//*
//- Реализовать метод, который удаляет из List<String> те элементы, длина которых меньше заданного числа символов..length
//- Разработать метод, который создает List, содержащий первые уникальные элементы исходного List до первого повторения.
//- Разработать метод, который объединяет строки из List в одну строку, разделяя их запятой

import java.util.*;

public class Task_3 {
    public static List<String> filterStringByLength(List<String> list, int elLenght) {
        List<String> filterString = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            if (element.length() < elLenght) {
                filterString.add(element);
            }
        }
        return filterString;
    }

    public static List<String> uniqueString(List<String> list) {
        List<String> uniqueFirstString = new ArrayList<>();
        Set<String> result = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            String string = list.get(i);
            if (result.add(string)) {
                uniqueFirstString.add(string);
            } else {
                break;
            }
        }
        return uniqueFirstString;
    }

    public static List<String> unitString(List<String> list) {
        return Collections.singletonList(String.join(",", list));
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("kiwi");
        list.add("peach");
        list.add("cherry");
        list.add("cherry");
        list.add("cherry");
        System.out.println("Метод, который удаляет из List<String> те элементы, длина которых меньше заданного числа " +
                "символов..length: " + filterStringByLength(list, 5));

        System.out.println("Метод, который создает List, содержащий первые уникальные элементы исходного List до " +
                "первого повторения: " + uniqueString(list));

        System.out.println("Mетод, который объединяет строки из List в одну строку, разделяя их запятой: " + unitString(list));
    }
}
