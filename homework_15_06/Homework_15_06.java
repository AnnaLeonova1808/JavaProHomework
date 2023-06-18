package javaPro.homework_15_06;

import java.util.*;

public class Homework_15_06 {
    //Вывести все ключи из мапы на экран.
    public static void keys(Map<Integer, String> map) {
        //System.out.println(Arrays.toString(map.keySet().toArray()));
        System.out.println(map.keySet());
    }

    //Проверить, содержит ли мапа определенное значение.
    public static boolean valueIs(Map<Integer, String> map, String m) {
        return ((map.containsValue(m)));
    }

    //Найти ключ, связанный с определенным значением.
    public static Integer anyValue(Map<Integer, String> map, String m) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals(m)) {
                return entry.getKey();
            }

        }
        return null;
    }

    //4)Вывести на экран все ключи, у которых значение начинается с определенной буквы.
    public static void keysAllAnyString(Map<Integer, String> map, String letter) {

        for (Integer key : map.keySet()) {

            if (map.get(key).startsWith(letter)) {
                System.out.print("Ключ на букву " + letter + " "+ key + " ");
            }

        }
        System.out.println();

    }


    //5)Проверить, содержит ли мапа определенный ключ.
    public static boolean keyIs(Map<Integer, String> map, Integer m) {
        return ((map.containsKey(m)));
    }

    //6)Найти ключ с максимальным значением.
    public static Integer maxEntry(Map<Integer, String> map) {
        Integer key = null;
        String value = "";

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > value.length()) {//[[k,v],[k,v]...]
                value = entry.getValue();
                key = entry.getKey();
            }
        }
        return key;
//
    }

    //7)Подсчитать количество ключей, значение которых содержит определенное слово.
    public static int countKeys(Map<Integer, String> map, String word) {
        int count = 0;
        for (String value : map.values()) {
            if (value.contains(word)) {
                count++;
            }
        }
        return count;
    }

    //8)Найти все ключи, значение которых состоит только из цифр.
    public static List<Integer> findKeysWithNumbers(Map<Integer, String> map) {

        List<Integer> keysWithNumbers = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            String value = entry.getValue();
            if (value.matches("\\d+")) {//\\d+ вывести реулярное выражение  - представляет собой цифру от 0 до 9, + указывает, что предыдущий элемент должен встречаться один или более раз
                keysWithNumbers.add(entry.getKey());

            }
        }
        return keysWithNumbers;
    }

    //9)Подсчитать сумму числовых значений в мапе.
    public static int sumValues(Map<Integer, String> map) {
        int sumValue = 0;
        for (String value : map.values()) {
            if (value.matches("\\d")) {
                sumValue += Integer.parseInt(value);
            }
        }
        return sumValue;
    }
    //10)Подсчитать количество ключей, у которых длина значения превышает определенную границу.

    public static int countKeyWithLength(Map<Integer, String> map, int boundary) {
        int count = 0;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if ((entry.getValue().length()) > boundary) {
                count++;
            }
        }
        return count;
    }


    //11)Создать новую мапу, где значениями будут ключи, а ключами - значения исходной мапы.
    public static Map<String, Integer> changeKeyWithValue(Map<Integer, String> map) {
        Map<String, Integer> newMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            newMap.put(entry.getValue(), entry.getKey());
        }
        return newMap;
    }

    //12 Очистить мапу и вывести сообщение о ее пустом состоянии.
        public static void clearMap (Map < Integer, String > map){
            clearMap(map);
        }
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");

        keys(map);//1

        System.out.println(valueIs(map, "six"));//2

        System.out.println(anyValue(map, "two"));//3

        String letter = "t";//4
        keysAllAnyString(map, letter);//4
        //System.out.println(keysAllAnyString(map, "t"));//4

        System.out.println(keyIs(map, 6)); //5

        System.out.println(maxEntry(map)); //6

        String word = "six";//7
        int keyCount = countKeys(map, word);//7
        System.out.println(keyCount);//7

        map.put(6, String.valueOf(6));//8
        List<Integer> keysWithNumbers = findKeysWithNumbers(map);//8
        System.out.println("Ключи со значениями только из цифр " + keysWithNumbers);//8

        int sumValue = sumValues(map);//9
        System.out.println("Сумма числовых значений " + sumValue);//9

        int boundary = 3;//10
        int count = countKeyWithLength(map, boundary);//10
        System.out.println("Количество ключей с длиной значения больше " + boundary + ":" + count);//10

        System.out.println(changeKeyWithValue(map));//11


        map.clear();//12
        System.out.println("Map clear");//12

    }
}

    /*
        *1)Вывести все ключи из мапы на экран.
        *2) Проверить, содержит ли мапа определенное значение.
        *3)Найти ключ, связанный с определенным значением.
        *4)Вывести на экран все ключи, у которых значение начинается с определенной буквы.
        *5)Проверить, содержит ли мапа определенный ключ.
        *6)Найти ключ с максимальным значением.
        *7)Подсчитать количество ключей, значение которых содержит определенное слово.
        *8)Найти все ключи, значение которых состоит только из цифр.
        *9)Подсчитать сумму числовых значений в мапе.
        *10)Подсчитать количество ключей, у которых длина значения превышает определенную границу.
        *11)Создать новую мапу, где значениями будут ключи, а ключами - значения исходной мапы.
        *12)Очистить мапу и вывести сообщение о ее пустом состоянии.
        *13)Создать список List, заполнить его несколькими значениями и вывести на экран каждый элемент списка.
        *14)Создать список List, заполнить его несколькими значениями и вывести на экран каждый элемент списка.
        *15)Создать список List, заполнить его несколькими значениями. Затем перебрать список и вывести элементы в обратном порядке.
        *16)Вычислить сумму всех элементов в массиве int[] и вывести результат.
        *17)Найти наименьший и наибольший элементы в массиве int[] и вывести их.
        *18)Подсчитать количество четных элементов в массиве int[] и вывести результат.
        *19)Отсортировать массив int[] в порядке убывания и вывести отсортированный массив.
        *20)Подсчитать сумму квадратов всех элементов в массиве int[] и вывести результат.*/