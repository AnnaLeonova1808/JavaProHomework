package javaPro.homework_210823.homework_23_12_13;

import java.util.*;

public class StackExTaski {
    //- Реализуйте функцию, которая использует Stack<String> для реверса строки.
    //  public static String reverse(String str)
    public static String reverse(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder reversed = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    //- Печать элементов Queue в обратном порядке
    //  public static void printInReverse(Queue<String> queue)
    public static void printInReverse(Queue<String> queue) {
        Queue<String> reversedQueue = new LinkedList<>(queue);
        if (reversedQueue.isEmpty()) {
            return;
        }
        String element = reversedQueue.poll();
        printInReverse(reversedQueue);
        System.out.println("Печать элементов Queue в обратном порядке: " + element);

    }

    //    - Реализуйте функцию, которая осуществляет циклический сдвиг элементов в Queue<String>.
    //    public static void rotate(Queue<String> queue, int k) {
    public static void rotate(Queue<String> queue, int k) {
        if (queue.isEmpty() || k < 0) {
            return;
        }
        k = k % queue.size();
        for (int i = 0; i < k; i++) {
            String element = queue.poll();
            queue.offer(element);
        }
    }

    //    - Создайте Map<String, String>, добавьте в него несколько пар ключ-значение,
//    затем найдите определенный ключ и замените его значение.
//    Map<String, String> map = new HashMap<>();
//         map.put("A", "C");
//         map.put("B", "D");
    public static Map<String, String> replaceValue(Map<String, String> map) {
        String keyToReplace = "A";
        String newValue = "apple";
        if (map.containsKey(keyToReplace)) {
            map.put(keyToReplace, newValue);
            System.out.println("найдите определенный ключ и замените его значение: " + keyToReplace + map);
        }
        return map;
    }

    //- Инвертируйте Map<String, String>, чтобы ключи стали значениями, а значения ключами.
    //  public static Map<String, String> invert(Map<String, String> map)
    public static Map<String, String> invert(Map<String, String> map) {
        Map<String, String> invertMap = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            invertMap.put(entry.getValue(), entry.getKey());
        }
        for (Map.Entry<String, String> entry : invertMap.entrySet()) {
            System.out.println("Инвентированный Map: " + entry.getKey() + entry.getValue());
        }
        return invertMap;
    }

    //- Написать функцию, которая выполняет факторизацию(погуглить) числа и возвращает
    //  ее в виде Map, где ключ - это простой множитель, а значение - степень этого множителя.
    //  public Map<Integer, Integer> primeFactorization(int number)
    public static Map<Integer, Integer> primeFactorization(int number) {
        Map<Integer, Integer> factorialMap = new HashMap<>();

        for (int i = 2; i <= number; i++) {

            while (number % i == 0) {
                factorialMap.put(i, factorialMap.getOrDefault(i, 0) + 1);
                number /= i;
            }
        }
        return factorialMap;
    }

    //- Написать функцию, которая проверяет, являются ли две строки анаграммами друг друга.
    //  public boolean areAnagrams(String str1, String str2)
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        String str = "apple orange peach";
        String reverse = reverse(str);
        System.out.println(str);
        System.out.println(reverse);
        Queue<String> queue = new LinkedList<>();
        queue.add("apple");
        queue.add("orange");
        queue.add("peach");

        System.out.println("Queue в первоначальном виде: " + queue);
        printInReverse(queue);

        System.out.println("Queue в первоначальном виде: " + queue);
        rotate(queue, 2);
        System.out.println("Queue после сдвига: " + queue);

        Map<String, String> map = new HashMap<>();
        map.put("A", "C");
        map.put("B", "D");
        replaceValue(map);

        invert(map);

        int number = 50;
        Map<Integer, Integer> map1 = primeFactorization(number);
        System.out.println("Факторизация числа " + number + map1);

        String str1 = "нора";
        String str2 = "рано";
        System.out.println("являются ли две строки анаграммами друг друга: " + areAnagrams(str1, str2));


    }
}



