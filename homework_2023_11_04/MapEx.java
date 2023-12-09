package javaPro.homework_210823.homework_2023_11_04;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapEx {
    //- Найдите количество пар ключ-значение, где длина ключа равна длине значения. HashMap<String, String>
    public static void findCount(Map<String, String> map) {
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.length() == value.length()) {
                count++;

            }
        }
        System.out.println("Найдите количество пар ключ-значение, где длина ключа равна длине значения: " + count);
    }

    //- Подсчитайте сумму всех значений, соответствующих ключам, начинающимся на букву 'A'.HashMap<String, Integer>
    public static int countSum(Map<String, Integer> map) {
        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            //int value = entry.getValue();
            if (key.startsWith("A")) {
                sum += entry.getValue();
            }
        }
        return sum;
    }

    //Для каждого ключа выведите все строки из соответствующего
    //списка, которые начинаются с гласной буквы.HashMap<Integer, List<String>>
    public static Map<Integer, String> findStringVowel(Map<Integer, String> map2) {
        Map<Integer, String> stringFirstVowel = new HashMap<>();
        for (Map.Entry<Integer, String> entryStr : map2.entrySet()) {
            Integer key = entryStr.getKey();
            String value = entryStr.getValue().toLowerCase();
            if (value.startsWith("a") || value.startsWith("u") || value.startsWith("e") || value.startsWith("i")
                    || value.startsWith("o")) {
                stringFirstVowel.put(key, value);
            }
        }
        return stringFirstVowel;
    }

    //- Найдите ключ с максимальным значением и выведите эту пару.HashMap<Integer, Integer>
    public static Map.Entry<Integer, Integer> maxKeyMap(Map<Integer, Integer> map) {
        Map.Entry<Integer, Integer> maxEntry = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        return maxEntry;
    }

    //- Определите, содержит ли HashMap такую пару ключ-значение,//где ключ является обратной строкой значения
    // (например, ключ "abc", значение "cba"). HashMap<String, String>
    public static boolean findContainsReverseString(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String reverseKey = new StringBuilder(key).reverse().toString();
            if (reverseKey.equals(value)) {
                return true;
            }
        }
        return false;
    }

    //- Переберите HashMap и преобразуйте его в HashMap<String, String>,
    //где каждое значение - это строковое представление исходного числа, умноженного на 2.
    public static Map<String, String> convertStringToNumbers(Map<String, Integer> map3) {
        Map<String, String> stringIntegerMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map3.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            String transformedValue = String.valueOf(value * 2);
            stringIntegerMap.put(key, transformedValue);
        }
        return stringIntegerMap;
    }

    //    - Создайте второй HashMap<Integer, Integer>, где каждый ключ - это ключ из исходного HashMap,
    //  а значение - общее количество символов во всех строках списка этого ключа. HashMap<Integer, List<String>>
    public static HashMap<Integer, Integer> totalNumberOfCharacters(Map<Integer, List<String>> map4) {
        HashMap<Integer, Integer> secondMap = new HashMap<>();
        for (Map.Entry<Integer, List<String>> entry : map4.entrySet()) {
            Integer key = entry.getKey();

            List<String> strings = entry.getValue();
            int totalCharacters = 0;
            for (String str : strings) {
                totalCharacters = str.length() + totalCharacters;
            }
            secondMap.put(key, totalCharacters);
        }
        return secondMap;
    }

    //- Найдите все пары ключ-значение, где ключ минус значение является простым числом.
    //  HashMap<Integer, Integer>
    public static Map<Integer, Integer> primeNumberDefinition(Map<Integer, Integer> map1) {
        Map<Integer, Integer> definishionMap = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            int difference = key - value;
            if (isPrime(difference)) {
                definishionMap.put(key, value);
            }
        }
        return definishionMap;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Определите, можно ли преобразовать HashMap в List<String>,где каждый элемент - это конкатенация ключа и значения, так,
    // чтобы все элементы списка были уникальными. HashMap<String, String>
    public static List<String> concatenateKeyAndValues(Map<String, String> map) {
        List<String> stringList = new ArrayList<>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            StringBuilder concatenated = new StringBuilder(key);
            concatenated.append(value);

            stringList.add(concatenated.toString());
        }
        return stringList;

    }

    // Для каждого ключа в HashMap<String, Integer> найдите соответствующие строки в HashMap<Integer, List<String>>,
    // где ключ во втором HashMap - это значение из первого, и выведите их. HashMap<String, Integer> и
    // HashMap<Integer, List<String>>
    public static Map<Integer, List<String>> findStrings(Map<String, Integer> mapSI, Map<Integer, List<String>> map5) {
        Map<Integer, List<String>> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : mapSI.entrySet()) {
            String keyMapSI = entry.getKey();
            Integer valueMapSI = entry.getValue();
            if (map5.containsKey(valueMapSI)) {
                List<String> strings = map5.get(valueMapSI);
                result.put(valueMapSI, strings);
            }

        }
        return result;
    }


    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("aaaaa", "AAAAA");
        map.put("cccc", "CCCCC");
        map.put("dd", "BBBBB");
        map.put("ddd", "DDDDD");
        map.put("ee", "EEEEE");
        map.put("fffffff", "FFFF");
        map.put("bbb", "BBBBB");
        findCount(map);

        Map<String, Integer> mapSI = new HashMap<>();
        mapSI.put("Ab", 1);
        mapSI.put("B", 2);
        mapSI.put("Ac", 3);
        mapSI.put("D", 4);
        mapSI.put("Ad", 5);
        mapSI.put("E", 6);
        int sum = countSum(mapSI);
        System.out.println("Cуммa всех значений " + sum);

        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(1, 201);
        map1.put(3, 15);
        map1.put(6, 29);
        map1.put(4, 12);
        map1.put(10, 22);
        System.out.println("Найдите ключ с максимальным значением и выведите эту пару: " + maxKeyMap(map1));

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "apple");
        map2.put(2, "cherry");
        map2.put(3, "peach");
        map2.put(4, "banana");
        map2.put(5, "orange");

        System.out.println("Для каждого ключа выведите все строки из соответствующего списка, которые начинаются с " +
                "гласной буквы: " + findStringVowel(map2));

        System.out.println("Определите, содержит ли HashMap такую пару ключ-значение, где ключ является обратной строкой" +
                " значения (например, ключ \"abc\", значение \"cba\"): " + findContainsReverseString(map));

        Map<String, Integer> map3 = new HashMap<>();
        map3.put("apple", 1);
        map3.put("cherry", 2);
        map3.put("peach", 3);
        map3.put("banana", 4);
        map3.put("orange", 5);
        System.out.println("Переберите HashMap и преобразуйте его в HashMap<String, String>, где каждое значение - " +
                "это строковое представление исходного числа, умноженного на 2." + convertStringToNumbers(map3));

        Map<Integer, List<String>> map4 = new HashMap<>();
        map4.put(1, List.of("apple", "cherry", "peach", "banana", "orange"));
        System.out.println("Создайте второй HashMap<Integer, Integer>, где каждый ключ - это ключ из исходного HashMap, " +
                "а значение - общее количество символов во всех строках списка этого ключа." + totalNumberOfCharacters(map4));

        System.out.println("Найдите все пары ключ-значение, где ключ минус значение является простым числом."
                + primeNumberDefinition(map1));

        System.out.println("Определите, можно ли преобразовать HashMap в List<String>, где каждый элемент - " +
                "это конкатенация ключа и значения, так, чтобы все элементы списка были уникальными."
                + concatenateKeyAndValues(map));

        HashMap<Integer, List<String>> map5 = new HashMap<>();
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("cherry");
        list1.add("orange");
        List<String> list2 = new ArrayList<>();
        list2.add("peach");
        list2.add("banana");
        list2.add("kiwi");
        map5.put(1, list1);
        map5.put(2, list1);
        map5.put(3, list1);
        map5.put(4, list2);
        map5.put(5, list2);
        map5.put(6, list2);

        System.out.println("Для каждого ключа в HashMap<String, Integer> найдите\n" +
                "соответствующие строки в HashMap<Integer, List<String>>,\n" +
                "где ключ во втором HashMap - это значение из первого, и выведите их." + findStrings(mapSI, map5));
    }
}




