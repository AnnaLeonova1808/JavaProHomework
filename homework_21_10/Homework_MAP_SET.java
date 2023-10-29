package javaPro.homework_21_10;

import java.util.*;

public class Homework_MAP_SET {
    private static final Random RANDOM = new Random();

    //1.Вывод значений `map`**: Напишите метод, который выводит все значения из `map`.
    //  * Вход: `Map<Integer, String> map`
    public static void displayValues(Map<Integer, String> map) {
        for (String value : map.values()) {
            System.out.println(value);
        }
    }
    //2. **Добавление элементов в `set`**: Напишите метод, который добавляет 3 элемента в `set`.
    //   * Вход: `Set<Integer> set`
    public static void addThreeElements(Set<Integer> set) {
        int el1 = 100;
        int el2 = 200;
        int el3 = 300;
        set.add(el1);
        set.add(el2);
        set.add(el3);
    }
    //3. **Поиск по ключу**: Напишите метод, который возвращает значение из `map` по заданному ключу.
    //   * Вход: `Map<Integer, String> map`, `Integer key`
    public static String returnValueByKey(Map<Integer, String> map, Integer key) {

        return map.get(key);
    }
    //4. **Объединение `set` и `map`**: Напишите метод, который добавляет все ключи из `map` в `set`.
    //   * Вход: `Map<Integer, String> map`, `Set<Integer> set`
    public static void addKeysFromMapToSet(Map<Integer, String> map, Set<Integer> set) {
        for (Integer key : map.keySet()) {
            set.add(key);
        }
    }
    //5. **Перебор `setMap`**: Напишите метод, который выводит все ключи и значения из `setMap`.
    //   * Вход: `Map<Set<Integer>, Set<String>> setMap`
    public static void returnKeysAndValuesFromSetMap(Map<Set<Integer>, Set<String>> setMap) {
        for (Map.Entry<Set<Integer>, Set<String>> entry : setMap.entrySet()) {
            Set<Integer> key = entry.getKey();
            Set<String> value = entry.getValue();
            System.out.println(key.toString().replaceAll("[\\[\\]]", ""));
            System.out.println(value.toString().replaceAll("[\\[\\]]", ""));
        }
    }
    // 6. **Удаление из `map`**: Напишите метод, который удаляет значение из `map` по заданному ключу.
    //    * Вход: `Map<Integer, String> map`, `Integer key`
    public static String removeValueByKey(Map<Integer, String> map, Integer key) {
        return map.remove(key);
    }
    // 7. **Поиск по значению**: Напишите метод, который проверяет, содержит ли `map` заданное значение.
    //   * Вход: `Map<Integer, String> map`, `String value`
    public static boolean containsValueInMap(Map<Integer, String> map, String value) {
        return map.containsValue(value);
    }
    // 8. **Перебор `maps`**: Напишите метод, который выводит все пары ключ-значение для каждой карты в `maps`.
    //    * Вход: `Set<Map<Integer, String>> maps`
    public static void displayKeyValuesPairsForMaps(Set<Map<Integer, String>> maps) {
        for (Map<Integer, String> map : maps) {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                Integer key3 = entry.getKey();
                String value3 = entry.getValue();
                System.out.println("8)Maps:" + key3 + value3);
            }
        }
    }
    // 9.**Фильтрация `map`**: Напишите метод, который возвращает новый `map`, содержащий только пары с ключами больше 5.
    //   * Вход: `Map<Integer, String> map`
    public static Map<Integer, String> filterMapByKeyGreaterThan5(Map<Integer, String> map) {
        Map<Integer, String> filteredMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                filteredMap.put(entry.getKey(), entry.getValue());
            }
        }
        return filteredMap;
    }
    // 10. **Вложенный перебор `setMap`**: Напишите метод, который для каждого ключа в `setMap` выводит все его значения.
    //     * Вход: `Map<Set<Integer>, Set<String>> setMap`
    public static void printValueSetMap(Map<Set<Integer>, Set<String>> setMap) {
        for (Map.Entry<Set<Integer>, Set<String>> entry : setMap.entrySet()) {
            Set<Integer> key = entry.getKey();
            Set<String> values = entry.getValue();
            System.out.println("10)Ключ: " + key + "Значение: " + values);
        }
    }
    // 11. **Обратное добавление**: Напишите метод, который добавляет все значения из `map` в `set`.
    //     * Вход: `Map<Integer, String> map`, `Set<Integer> set`
    public static void addValuesFromMapToSet(Map<Integer, String> map, Set<Integer> set) {
        set.addAll(map.keySet());
    }
    // 12. **Объединение `maps`**: Напишите метод, который объединяет все карты из `maps` в одну карту.
    //     * Вход: `Set<Map<Integer, String>> maps`
    public static Map<Integer, String> mergeMaps(Set<Map<Integer, String>> maps) {
        Map<Integer, String> uniteMap = new HashMap<>();
        for (Map<Integer, String> map2 : maps
        ) {
            uniteMap.putAll(map2);
        }
        return uniteMap;
    }
    // 13. **Подсчет элементов**: Напишите метод, который возвращает количество уникальных строк во всех `maps`.
    //     * Вход: `Set<Map<Integer, String>> maps`
    public static int countUniqeStringsInMaps(Set<Map<Integer, String>> maps) {
        Set<String> uniqeStrings = new HashSet<>();
        for (Map<Integer, String> map : maps
        ) {
            Collection<String> values = map.values();
            uniqeStrings.addAll(values);
        }
        return uniqeStrings.size();
    }
    // 14. **Фильтрация `setMap` по ключу**: Напишите метод, который возвращает новый `setMap`, содержащий только те
    //       ключи, которые содержат число 5.
    //     * Вход: `Map<Set<Integer>, Set<String>> setMap`
    public static Map<Set<Integer>, Set<String>> newSetMapWhithKeyFive(Map<Set<Integer>, Set<String>> setMap) {
        Map<Set<Integer>, Set<String>> filtredMap = new HashMap<>();
        for (Map.Entry<Set<Integer>, Set<String>> entry : setMap.entrySet()) {
            Set<Integer> key = entry.getKey();
            if (key.contains(5)) {
                filtredMap.put(key, entry.getValue());
            }
        }
        return filtredMap;
    }
    // 15. **Пересечение `map` и `set`**: Напишите метод, который возвращает новый `set`, содержащий только те числа,
    //       которые являются ключами в `map`.
    //     * Вход: `Map<Integer, String> map`, `Set<Integer> set`
    public static Set<Integer> filterSet(Map<Integer, String> map, Set<Integer> set) {
        Set<Integer> filteredSet = new HashSet<>();
        for (Integer element : set) {
            if (map.containsKey(element)) {
                filteredSet.add(element);
            }
        }
        return filteredSet;
    }
    // 16. **Реверс `map`**: Напишите метод, который возвращает новую карту, где ключи становятся значениями,
    //       а значения становятся ключами.
    //     * Вход: `Map<Integer, String> map`
    public static Map<String, Integer> reversMap(Map<Integer, String> map) {
        Map<String, Integer> reversedMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            reversedMap.put(entry.getValue(), entry.getKey());
        }
        return reversedMap;
    }
    // 17. **Максимальный ключ**: Напишите метод, который возвращает максимальный ключ из `map`.
    //     * Вход: `Map<Integer, String> map`
    public static int maxKeyMap(Map<Integer, String> map) {
        int maxKey = 0;
        for (int key : map.keySet()) {
            if (key > maxKey) {
                maxKey = key;
            }
        }
        return maxKey;
    }
    // 18. **Объединение всех значений**: Напишите метод, который объединяет все строки из всех карт в `maps` в одну строку.
    //     * Вход: `Set<Map<Integer, String>> maps`
    public static List<String> uniteList(Set<Map<Integer, String>> maps) {
        List<String> list = new ArrayList<>();
        for (Map<Integer, String> map : maps) {
            for (String value : map.values()) {
                list.add(value);
            }
        }
        return list;
    }
    // 19. **Поиск подстроки**: Напишите метод, который проверяет, содержится ли заданная подстрока хотя бы в одной строке в `map`.
    //     * Вход: `Map<Integer, String> map`, `String substring`
    public static boolean containsString(Map<Integer, String> map, String substring) {
        for (String value : map.values()) {
            if (value.contains(substring)) {
                return true;
            }
        }
        return false;
    }
    // 20. **Отображение `set` в `map`**: Напишите метод, который создает новую карту, где каждое число из `set`
    //       становится ключом, а его строковое представление становится значением.
    //     * Вход: `Set<Integer> set`
    public static Map<Integer, String> createMap(Set<Integer> set) {
        Map<Integer, String> map5 = new HashMap<>();
        for (Integer key : set) {
            map5.put(key, key.toString());
        }
        return map5;
    }
    // 21. **Фильтрация `setMap` по значению**: Напишите метод, который возвращает новый `setMap`,
    //       где все значения содержат заданную строку.
    //     * Вход: `Map<Set<Integer>, Set<String>> setMap`, `String value`
    public static Map<Set<Integer>, Set<String>> createdSetMapWithValuesContainString(Map<Set<Integer>, Set<String>>
                                                                                              setMap, String value) {
        Map<Set<Integer>, Set<String>> filterMap2 = new HashMap<>();
        for (Map.Entry<Set<Integer>, Set<String>> entry : setMap.entrySet()) {
            Set<Integer> key = entry.getKey();
            Set<String> originalValue = entry.getValue();
            Set<String> filtredValue = new HashSet<>();
            for (String str : originalValue) {
                if (str.contains(value)) {
                    filtredValue.add(str);
                }
            }
            if (!filtredValue.isEmpty()) {
                filterMap2.put(key, filtredValue);
            }
        }
        return filterMap2;
    }
    // 22. **Группировка по длине**: Напишите метод, который группирует строки из `map` по их длине и возвращает карту,
    //       где ключ — это длина строки, а значение — множество строк этой длины.
    //     * Вход: `Map<Integer, String> map`
    public static Map<Integer, Set<String>> groupingStringsByLength(Map<Integer, String> map) {
        Map<Integer, Set<String>> groupedMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            String value = entry.getValue();
            Integer length = value.length();
            Set<String> strings = groupedMap.get(length);
            if (strings == null) {
                strings = new HashSet<>();
                groupedMap.put(length, strings);
            }
            strings.add(value);
        }
        return groupedMap;
    }
    // 23. **Пересечение `setMap`**: Напишите метод, который возвращает пересечение всех ключей в `setMap`.
    //     * Вход: `Map<Set<Integer>, Set<String>> setMap`
    public static Set<Integer> intersectionOfKeys(Map<Set<Integer>, Set<String>> setMap) {
        Set<Integer> intersection = new HashSet<>();

        for (Set<Integer> keySet : setMap.keySet()) {

            intersection.retainAll(keySet);
        }
        return intersection;

    }
    //  24. **Уникальные значения из `maps`**: Напишите метод, который возвращает множество всех уникальных значений
    //        из всех карт в `maps`.
    //      * Вход: `Set<Map<Integer, String>> maps`
    public static Set<String> uniqueValuesFromMap(Set<Map<Integer, String>> maps) {
        Set<String> uniqueValues = new HashSet<>();
        for (Map<Integer, String> map : maps
        ) {
            uniqueValues.addAll(map.values());

        }
        return uniqueValues;
    }
    // 25. **Минимизация `map`**: Напишите метод, который возвращает `map`, содержащий только пары,
    //       где строка содержит менее 5 символов.
    //     * Вход: `Map<Integer, String> map`
    public static Map<Integer, String> pairsWithStringsOfLessThanFiveCharacters(Map<Integer, String> map) {
        Map<Integer, String> mapString = new HashMap<>();
        int maxLength = 5;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            String value = entry.getValue();
            if (value.length() < maxLength) {
                mapString.put(entry.getKey(), value);
            }
        }
        return mapString;
    }
    // 26. **Сортировка `map` по значению**: Напишите метод, который возвращает отсортированный `map`
    //        по значениям в алфавитном порядке.
    //      * Вход: `Map<Integer, String> map`
    public static Map<Integer, String> sortedMap(Map<Integer, String> map) {
        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entryList, Map.Entry.comparingByValue());
        Map<Integer, String> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
    // 27.**Глубокое сравнение `maps`**: Напишите метод, который определяет, содержат ли две карты из `maps`
    //      одни и те же пары ключ-значение.
    //    * Вход: `Set<Map<Integer, String>> maps`
    public static boolean sameKeyValue(Set<Map<Integer, String>> maps) {
        Set<Map.Entry<Integer, String>> entrySet = new HashSet<>();
        for (Map<Integer, String> map : maps) {
            Set<Map.Entry<Integer, String>> mapsEntries = map.entrySet();
            for (Map.Entry<Integer, String> entry : mapsEntries) {
                if (entrySet.contains(entry)) {
                    return true;
                }
                entrySet.add(entry);
            }
        }
        return false;
    }
    // 28.**Поиск наиболее частого значения**: Напишите метод, который определяет, какое значение в `map`
    //      встречается чаще всего.
    //    * Вход: `Map<Integer, String> map`
    public static List<String> determineMeaningThatOccursMostOften(Map<Integer, String> map) {
        Map<String, Integer> countValue = new HashMap<>();
        int maxCount = 0;
        for (String value : map.values()) {
            int count = countValue.getOrDefault(value, 0) + 1;
            countValue.put(value, count);
            if (count > maxCount) {
                maxCount = count;
            }
        }
        List<String> mostOftenValues = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : countValue.entrySet()) {
            if (entry.getValue() == maxCount) {
                mostOftenValues.add(entry.getKey());
            }
        }
        return mostOftenValues;
    }
    // 29. **Объединение `setMap` по значению**: Напишите метод, который объединяет все ключи из `setMap`,
    //       которые имеют одинаковое множество значений, в один общий ключ.
    //     * Вход: `Map<Set<Integer>, Set<String>> setMap`
    public static Map<Set<String>, Set<Integer>> sameSetOfValues(Map<Set<Integer>, Set<String>> setMap) {
        Map<Set<String>, Set<Integer>> intersectMap = new HashMap<>();
        Map<Set<String>, Set<Integer>> unionMap = new HashMap<>();
        for (Map.Entry<Set<Integer>, Set<String>> entry : setMap.entrySet()) {
            Set<Integer> key = entry.getKey();
            Set<String> value = entry.getValue();
            if (!unionMap.containsKey(value)) {
                unionMap.put(value, new HashSet<>());
            }
            Set<Integer> keySet = unionMap.get(value);
            keySet.addAll(key);
        }
        for (Map.Entry<Set<String>, Set<Integer>> entry : unionMap.entrySet()) {
            Set<String> values = entry.getKey();
            Set<Integer> keys = entry.getValue();
            intersectMap.put(values, keys);
        }
        return intersectMap;
    }
    // 30. **Создание инвертированного `setMap`**: Напишите метод, который создает новый `setMap`, где ключи становятся
    //       значениями и наоборот.
    //     * Вход: `Map<Set<Integer>, Set<String>> setMap`
    public static Map<Set<String>, Set<Integer>> keyBecomeValueAndReverse(Map<Set<Integer>, Set<String>> setMap) {
        Map<Set<String>, Set<Integer>> reverseMap = new HashMap<>();
        for (Map.Entry<Set<Integer>, Set<String>> entry : setMap.entrySet()) {
            reverseMap.put(entry.getValue(), entry.getKey());
        }
        return reverseMap;
    }

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(RANDOM.nextInt(50), UUID.randomUUID().toString());
        }

        System.out.println("1) Все значения из `map`: " + map);

        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(RANDOM.nextInt(50));
        }
        addThreeElements(set);
        System.out.println("2) Добавлены 3 элемента в `set`" + set);

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "AAAAA");
        map1.put(2, "CCCCC");
        map1.put(3, "BBBBB");
        map1.put(4, "DDDDD");
        map1.put(5, "EEEEE");
        map1.put(6, "FFFF");
        map1.put(7, "BBBBB");
        String value = returnValueByKey(map1, 1);
        System.out.println("3) Найти по ключу: " + " " + "Значение: " + value);

        addKeysFromMapToSet(map1, set);
        System.out.println("4) Добавлены все ключи из `map` в `set`: "+map1+" "+set);


        Map<Set<Integer>, Set<String>> setMap = new HashMap<>();
        Set<Integer> key1 = new HashSet<>();
        Set<Integer> key2 = new HashSet<>();
        Set<Integer> key3 = new HashSet<>();
        Set<Integer> key4 = new HashSet<>();
        Set<Integer> key5 = new HashSet<>();
        Set<String> value1 = new HashSet<>();
        Set<String> value2 = new HashSet<>();
        Set<String> value3 = new HashSet<>();
        Set<String> value4 = new HashSet<>();
        Set<String> value5 = new HashSet<>();
        key1.add(11);
        key2.add(22);
        key3.add(33);
        key4.add(44);
        key5.add(11);
        value1.add("aaa");
        value2.add("bbb");
        value3.add("ccc");
        value4.add("ddd");
        value5.add("aaa");
        setMap.put(key1, value1);
        setMap.put(key2, value2);
        setMap.put(key3, value3);
        setMap.put(key4, value4);
        setMap.put(key5, value5);

        System.out.println("5) Все ключи и значения из SetMap:" + setMap);


        removeValueByKey(map1, 2);
        System.out.println("6) Удалено значение из `map` по заданному ключу: "+ map1);

        String valueToCheck = "ssss";
        boolean containsValueInMap = containsValueInMap(map1, valueToCheck);
        if (containsValueInMap) {
            System.out.println("7) Map содержит значение: " + valueToCheck);
        } else {
            System.out.println("7) Map не содержит значение: " + valueToCheck);
        }

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "FFF");
        map2.put(2, "BBB");

        Map<Integer, String> map3 = new HashMap<>();
        map3.put(3, "CCC");
        map3.put(4, "DDD");
        map3.put(6, "FFF");

        Set<Map<Integer, String>> maps = new HashSet<>();
        maps.add(map2);
        maps.add(map3);
        displayKeyValuesPairsForMaps(maps);
        System.out.println("8) Dсе пары ключ-значение для каждой карты в maps: "+maps);

        Map<Integer, String> filteredMap = filterMapByKeyGreaterThan5(map3);//9
        System.out.println("9) Новый `map`, содержащий только пары с ключами больше 5:"+filteredMap);


        System.out.println("10) Для каждого ключа в `setMap` выведены все его значения: "+setMap);

        addValuesFromMapToSet(map2, set);
        System.out.println("11) Добавлены все значения из `map` в `set`: " + set);

        maps.add(map2);
        maps.add(map3);
        System.out.println("12) Объединенные maps: " + mergeMaps(maps));

        int uniqeStringsCount = countUniqeStringsInMaps(maps);
        System.out.println("13) Количество уникальных строк: " + uniqeStringsCount);

        System.out.println("14) Новый setMap в ключе цифра  только 5: " + newSetMapWhithKeyFive(setMap));

        Set<Integer> filterSet = filterSet(map1, set);
        System.out.println("15) Новый set с ключами Map:" + filterSet);

        Map<String, Integer> reversedMap = reversMap(map1);
        System.out.println("16) Реверсирвная Map: " + reversedMap);

        int maxKey = maxKeyMap(map1);
        System.out.println("17) Максимальный ключ:" + maxKey);

        List<String> unite = uniteList(maps);
        System.out.println("18) Объединенные строки: " + unite);

        String substring = "a";
        System.out.println("19) Содержит Map подстроку: " + containsString(map1, substring));

        Map<Integer, String> newMap = createMap(set);
        System.out.println("20) Новая Map: " + newMap);

        System.out.println("21) Новый Map в котором все значения содержат строку aaa" +
                createdSetMapWithValuesContainString(setMap, "aaa"));


        System.out.println("22) " + groupingStringsByLength(map1));

        Set<Integer> intersection = intersectionOfKeys(setMap);
        System.out.println("23) Пересечение всех ключей: " + intersection);

        System.out.println("24) Множество уникальных значений из Map: " + uniqueValuesFromMap(maps));

        System.out.println("25) Пары со строками менее пяти символов: " +
                pairsWithStringsOfLessThanFiveCharacters(map1));

        System.out.println("26) Отсортированный Map по значению в алфавитном порядке: " + sortedMap(map1));

        System.out.println("27) Содержатся ли одинаковые ключ-значения: " + sameKeyValue(maps));

        System.out.println("28) Значение наиболее часто повторяющееся: " + determineMeaningThatOccursMostOften(map1));

        System.out.println("29) Одинаковое множество и общий ключ имеют: " + sameSetOfValues(setMap));

        System.out.println("30) Ключи изменены на значения и наоборот: " + keyBecomeValueAndReverse(setMap));


    }
}




