package javaPro.homework_210823;

import java.util.Arrays;

public class Homework_20_11_2023_massive {
    //Инвертировать массив, то есть изменить порядок элементов в массиве на обратный.
    public static void reverseMassive(int[] array) {
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[array.length - 1 - i] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = array2[i];

        }
    }

    //Поиск третьего по величине числа в массиве
    public static int thirdLargestNumber(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            } else if (array[i] > thirdMax && array[i] != secondMax) {
                thirdMax = array[i];
            }
        }
        return thirdMax;
    }


    public static void main(String[] args) {
        int[] array = {2, 5, 8, 15, 25, 33, 48, 4, 13, 101};
        System.out.println("Массив в первоначальном порядке" + Arrays.toString(array));
        reverseMassive(array);
        System.out.println("Массив в обратном порядке" + Arrays.toString(array));

        System.out.println("Поиск третьего по величине числа в массиве: " + thirdLargestNumber(array));

    }
}
