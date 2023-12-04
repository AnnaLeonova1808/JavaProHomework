package javaPro.homework_210823.homework_23_11_27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//- Реализовать метод, который удаляет все вхождения заданной строки из List<String>.
//- Составить метод, который объединяет все строки из List в одну большую строку.
//- Дан List 1,написать метод который создает List 2, содержащий только те числа из List 1, которые больше заданного значения.
//- Написать метод, который преобразует List<String> в List<Integer>, представляющих длину каждой строки.
//- Разработать метод, который возвращает новый List, содержащий только уникальные элементы из исходного списка строк.
//  .contains
public class Task_2 {
    public static void removeString(List<String> list, String removeToString) {
        List<String> stringsToRemove = new ArrayList<>();
        for (String string : list) {
            if (string.contains(removeToString)) {
                stringsToRemove.add(string);
            }
        }
        list.removeAll(stringsToRemove);
    }

    public static String unitStrings(List<String> list) {
        return String.join("", list);
    }

    public static List<Integer> filterListNumbers(List<Integer> integerList, int number) {
        List<Integer> filterList = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) > number) {
                filterList.add(integerList.get(i));
            }
        }
        return filterList;
    }

    public static List<Integer> lengthString(List<String> list) {
        List<Integer> lengthList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            lengthList.add(str.length());
        }
        return lengthList;
    }

    public static List<String> uniqeStrings(List<String> list) {
        List<String> uniqeElements = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String string = list.get(i);
            if (!uniqeElements.contains(string)) {
                uniqeElements.add(string);
            }
        }
        return uniqeElements;
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
        String removeToString = "kiwi";
        removeString(list, removeToString);
        System.out.println("Заданная строка удалена: " + removeToString);

        System.out.println("метод, который объединяет все строки из List в одну большую строку: " + unitStrings(list));

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int number = 5;
        System.out.println("List 2, содержащий только те числа из List 1, которые больше заданного значения: " + filterListNumbers(integerList, number));

        System.out.println("Преобразование List<String> в List<Integer>, представляющих длину каждой строки: " + lengthString(list));

        System.out.println("Новый List, содержащий только уникальные элементы из исходного списка строк: " + uniqeStrings(list));
    }

}
