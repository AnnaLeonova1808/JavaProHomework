package javaPro.homework_210823.homework_23_11_06;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class Map_06_11_2023 {
    //**Создайте HashMap<String, Integer>, заполните его парами "имя-возраст". Используйте цикл for-each
    // для удвоения возраста каждого человека.
    public static Map<String,Integer> mapNameAge (Map<String, Integer> map){
        for(Map.Entry<String, Integer> e : map.entrySet()){
            String name = e.getKey();
            Integer age = e.getValue();
            map.put(name, age * 2);
        }
        return map;
    }
    //Создайте HashMap<Integer, String>, представляющий "ID-имя пользователя". Используйте цикл для фильтрации
    //пользователей с ID больше 100 и копируйте их в TreeMap.
    public static Map<Integer, String> filterMap(Map<Integer, String> treeMap) {
        Map<Integer, String> newMap = new TreeMap<>();
        for (Map.Entry<Integer, String> e : treeMap.entrySet()) {
            if(e.getKey() > 100){
                newMap.put(e.getKey(), e.getValue());
            }
        }
        return newMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alex", 15);
        map.put("Slava", 18);
        map.put("Jake", 20);
        map.put("Jon", 25);
        map.put("Tayler", 30);
        map.put("Bled", 12);

        System.out.println(mapNameAge(map));
        Map<Integer, String> treeMap = new HashMap<>();
        treeMap.put(50, "Alex");
        treeMap.put(102, "Slava");
        treeMap.put(99, "Jake");
        treeMap.put(105, "Jon");
        treeMap.put(43, "Tayler");
        treeMap.put(40, " Bled");
        System.out.println(filterMap(treeMap));


    }
}
