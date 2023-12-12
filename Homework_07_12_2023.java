package javaPro.homework_210823.Algoritms_homeworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework_07_12_2023 {
    //Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки, или слово NO в противном случае.
    //Операцией возведения в степень пользоваться нельзя!
    //Ввод YES
    //Вывод 8
    //Ввод NO
    //Вывод 3
    public static boolean numberCheck(int N) {
        if (N == 1) {
            System.out.println("YES");
            return true;
        } else if (N % 2 == 0 && N != 0) {
            return numberCheck(N / 2);
        } else {
            System.out.println("NO");
            return false;
        }
    }

    // Дано натуральное число N. Вычислите сумму его цифр.
    // При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
    // Ввод 179
    // Вывод 17
    // Ввод 985
    // Вывод 22
    public static int sumNumbers(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumNumbers(n / 10);
        }
    }

    //Напишите рекурсивный метод, который выводит на экран числа Фибоначчи до N-ого элемента.
    public static long fibREC(final int index) {
        if (index < 0) {
            throw new IllegalArgumentException();
        }
        if (index == 0) {
            return 0;
        }
        return index == 1 || index == 2 ? 1L : fibREC(index - 2) + fibREC(index - 1);
    }
    //Напишите рекурсивный метод, который проверяет, является ли строка палиндромом.

    public static boolean isPalindrome(String str) {

        List<Character> characterList = new ArrayList<>();
        for (char c : str.toCharArray()) {
            characterList.add(c);
        }
        return checkPalindrome(characterList, 0, characterList.size() - 1);
    }

    private static boolean checkPalindrome(List<Character> characterList, int start, int end) {

        if (start >= end) {
            return true;
        }
        if (!characterList.get(start).equals(characterList.get(end))) {
            return false;
        }

        return checkPalindrome(characterList, start + 1, end - 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        numberCheck(N);

        int n  = 12345;
        int sum = sumNumbers(n);
        System.out.println(sum);

        int N1 = 10;
        System.out.println("Числа Фибоначчи до числа N1: " + fibREC(N1));

        System.out.println("Является ли строка палиндромом: " + isPalindrome("level"));
    }
}

