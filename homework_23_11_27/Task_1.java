package javaPro.homework_210823.homework_23_11_27;

import java.util.*;
import java.util.ArrayList;

//- Дан массив/коллекция целых чисел и целое число X. Найти пару чисел в массиве/коллекции, сумма которых равна X.
//- Дан массив/коллекция целых чисел. Необходимо подсчитать, сколько раз каждый элемент встречается в массив/коллекции.
//- Дан массив/коллекция. Удалить все дубликаты из массива/коллекции.
//- Дан массив/коллекция целых чисел. Необходимо переставить элементы массив/коллекции в обратном порядке.
//Array/List
public class Task_1 {
    public static void findElement(int[] arr, int sumx) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == sumx) {
                    System.out.println("число" + " " + arr[i] + " " + " " + "число" + " " + arr[j] + " " + " " + "Сумма" + " " + sumx);
                    return;
                }
            }
        }
        System.out.println("пара не найдена");
    }

    public static void findElementList(List<Integer> list, int sumNumbers) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == sumNumbers) {
                    System.out.println("число" + " " + list.get(i) + " " + " " + "число" + " " + list.get(j) + " " + "Сумма" + " " + sumNumbers);
                    return;
                }
            }
        }
        System.out.println("пара не найдена");
    }

    public static void countElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println("В массиве число" + " " + arr[i] + " " + "найдено" + " " + count);
        }
    }

    public static void countElementInList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == -1) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(list.get(i))) {
                    count++;
                }
            }
            System.out.println("В списке число" + " " + list.get(i) + " " + "найдено" + " " + count);
        }
    }

    public static int[] removeDublicate(int[] arr) {
        int a = arr.length;
        for (int i = 0; i < a - 1; i++) {
            for (int j = i + 1; j < a; j++) {
                if (arr[i] == arr[j]) {
                    for (int k = j; k < a - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    a--;
                    j--;
                }
            }
        }
        int[] result = Arrays.copyOf(arr, a);
        return result;
    }

    public static void removeDublicateList(List<Integer> list) {
        Set<Integer> uniqeElements = new HashSet<>(list);
        list.clear();
        list.addAll(uniqeElements);
    }

    public static void reverseArr(int[] arr) {
        int a = arr.length;
        int[] reverse = new int[a];
        for (int i = 0; i < a; i++) {
            reverse[i] = arr[a - i - 1];
        }
        for (int i = 0; i < a; i++) {
            arr[i] = reverse[i];
        }
    }

    public static void reverseList(List<Integer> list) {
        int a = list.size();
        List<Integer> reverse = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            reverse.add(list.get(a - i - 1));
        }
        for (int i = 0; i < a; i++) {
            list.set(i, reverse.get(i));
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 6, 7, 8, 9};
        int sumx = 10;
        findElement(arr, sumx);
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(1);

        int sumNumbers = 10;
        findElementList(list, sumNumbers);

        countElements(arr);
        countElementInList(list);

        int[] result = removeDublicate(arr);
        System.out.println("массив без дубликатов: " + Arrays.toString(result));

        reverseArr(arr);
        System.out.println("Массив в обратном порядке: " + Arrays.toString(arr));

        removeDublicateList(list);
        System.out.println("Список уникальных элементов: " + list);

        reverseList(list);
        System.out.println("Список в обратном порядке:  " + list);
    }
}
