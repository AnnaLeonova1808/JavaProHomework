package javaPro.homework_15_06;

import java.util.Arrays;

public class Homework_15_06_3 {
    // 16)Вычислить сумму всех элементов в массиве int[] и вывести результат.
    public static void main(String[] args) {
        int[] arr = {5, 15, 45, 35, 25};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println("Сумма всех элементов " + sum);//16
        getMaximumMinimum(arr);//17
        quantityOfEvenElements(arr);//18
        sortElements(arr);//19
        System.out.println("Сумма квадратов всех элементов " + sumQuarteredElements(arr));//20
    }

    // 17)Найти наименьший и наибольший элементы в массиве int[] и вывести их.
    public static void getMaximumMinimum(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Наибольший элемент " + max);
        System.out.println("Наименьший элемент " + min);
    }

    // 18)Подсчитать количество четных элементов в массиве int[] и вывести результат.
    public static void quantityOfEvenElements(int[] arr) {
        int quantityevenelement = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                quantityevenelement++;
            }

        }
        System.out.println("Количество четных элементов " + quantityevenelement);
    }

    // 19)Отсортировать массив int[] в порядке убывания и вывести отсортированный массив.
    public static void sortElements(int[] arr) {
        Arrays.sort(arr);
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }
        System.out.println("Массив отсортирован с конца " + Arrays.toString (reversedArr));
    }
    // 20)Подсчитать сумму квадратов всех элементов в массиве int[] и вывести результат.
    public static int sumQuarteredElements(int[] arr){
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr [i] * arr[i];
        }
        return summ;
    }
}



