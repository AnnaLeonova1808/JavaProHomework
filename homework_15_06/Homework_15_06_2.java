package javaPro.homework_15_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework_15_06_2 {
 //13)14)Создать список List, заполнить его несколькими значениями и вывести на экран каждый элемент списка.
    public static void listOfElements (List<Integer> list) {
        for (Integer element : list) {
            System.out.println(element);
        }
    }
    public static void list1OfElements (List<Integer> list1) {
        for (Integer element : list1) {
            System.out.println(element);
        }
    }
//15)Создать список List, заполнить его несколькими значениями. Затем перебрать список и вывести элементы в обратном порядке.
    public static List<Integer> listReverse (List<Integer> list) {
        List<Integer>element = new ArrayList<>(list);
        Collections.reverse(element);
        return element;
        }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list1.add("January");
        list1.add("February");
        list1.add("March");
        list1.add("April");
        list1.add("May");

        System.out.println(list);//13
        System.out.println(list1);//14
        List<Integer> reverse = listReverse(list);//15 чтобы получить обратный список
        System.out.println(reverse);//15 вывела на печать обратный список элементов
    }
}
