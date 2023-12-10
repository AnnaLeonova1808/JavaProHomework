package javaPro.homework_210823.homework_23_11_06;
import java.util.*;
public class Main {
    //Создайте класс User с полями name и age, реализующий Comparable
    //для сортировки по возрасту. Используйте TreeMap<User, String>
    //для хранения информации о пользователях и переберите его, чтобы напечатать имена.
    public static void sortAge(Map<User, String> ageSort) {
        Map<User, String> ageSorted = new TreeMap<>(Comparator.comparing(User::getAge));
        for (Map.Entry<User, String> entry : ageSort.entrySet()) {
            System.out.println("Сортировка по возрасту: " + entry.getKey().getName());
        }
    }

    //**Создайте TreeMap<User, String> (класс User как в задаче 3), но на
    //этот раз реализуйте Comparator<User>, чтобы сортировать пользователей по имени.
    public static void sortName(Map<User, String> nameSort) {
        Map<User, String> nameSorted = new TreeMap<>(Comparator.comparing(User::getName));
        nameSorted.putAll(nameSort);
        for (Map.Entry<User, String> entry : nameSorted.entrySet()) {
            System.out.println("Сортировка по имени: " + entry.getKey().getName());
        }
    }

    //**Создайте два HashMap<String, User> (класс User как в задаче 3) и
    //объедините их в один, удалив дубликаты пользователей.
    public static void combinedTwoMaps(Map<String, User> map1, Map<String, User> map2) {
        Map<String, User> combinedMap = new HashMap<>(map1);
        for (Map.Entry<String, User> entry : map2.entrySet()) {
            String key = entry.getKey();
            User value = entry.getValue();
            if (combinedMap.containsKey(key) && !combinedMap.get(key).equals(value)) {
                int i = 1;
                while (combinedMap.containsKey(key + "_" + i)) {
                    i++;
                }
                key = key + "_" + i;
            }
            combinedMap.put(key, value);
        }
        for (Map.Entry<String, User> entry : combinedMap.entrySet()) {
            System.out.println("Объединение двух Map без дубликатов: " + entry.getKey() + " " + entry.getValue());
        }
    }

    //**Создайте HashMap<Integer, String> и перепишите его в TreeMap<String, Integer>,
    //инвертируя ключи и значения.
    public static void invertingKeysAndValues(Map<Integer, String> mapIn) {
        TreeMap<String, Integer> invertedKeysAndValues = new TreeMap<>();
        for (Map.Entry<Integer, String> entry : mapIn.entrySet()) {
            invertedKeysAndValues.put(entry.getValue(), entry.getKey());
        }
        for (Map.Entry<String, Integer> entry : invertedKeysAndValues.entrySet()) {
            System.out.println("Инвентированный Map: " + entry.getKey() + " " + entry.getValue());
        }
    }

    // Создайте HashMap<String, Integer>, переберите её и создайте List<Integer>, содержащий все значения HashMap.
    public static void mapToList(Map<String, Integer> mapList) {
        List<Integer> list = new ArrayList<>(mapList.values());
        for (Integer value : list) {
            System.out.println("List<Integer>, содержащий все значения HashMap: " + value);
        }
    }

    ///**Создайте TreeMap<String, Integer> и переберите его, создавая HashMap<Integer, String>,
    ////включающий только те записи, где значение больше 50.
    public static void mapWithValuesMore(Map<String, Integer> map50) {
        HashMap<Integer, String> filteredMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map50.entrySet()) {
            if (entry.getValue() > 50) {
                filteredMap.put(entry.getValue(), entry.getKey());
            }
        }
        for (Map.Entry<Integer, String> entry : filteredMap.entrySet()) {
            System.out.println("HashMap<Integer, String>,\n" +
                    "включающий только те записи, где значение больше 50: " + entry.getKey() + " " + entry.getValue());
        }
    }

    //**Создайте HashMap<String, List<Integer>>, где ключ - это имя, а значение - список оценок.
    //Используйте TreeMap<Integer, List<String>> для создания отображения
    //"средняя оценка - список студентов с этой оценкой".
    public static void changeKeyWithValue(HashMap<String, List<Integer>> studentGrades) {
        TreeMap<Integer, List<String>> averageGrade = new TreeMap<>();
        for (Map.Entry<String, List<Integer>> entry : studentGrades.entrySet()) {
            String studentName = entry.getKey();
            List<Integer> grades = entry.getValue();
            int sum = 0;
            for (int grade : grades) {
                sum = grade + sum;
            }
            int average = sum / grades.size();
            if (!averageGrade.containsKey(average)) {
                averageGrade.put(average, new ArrayList<>());
            }
            averageGrade.get(average).add(studentName);
        }
        for (Map.Entry<Integer, List<String>> entry : averageGrade.entrySet()) {
            System.out.println("Cредняя оценка - список студентов с этой оценкой: " + entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Map<User, String> sorted = new TreeMap<>();

        sorted.put(new User("Slava", 30), "Info");
        sorted.put(new User("Alex", 20), "Info");
        sorted.put(new User("Mike", 35), "Info");
        sortAge(sorted);
        sortName(sorted);
        Map<String, User> map1 = new TreeMap<>();
        map1.put("user1", new User("Slava", 30));
        map1.put("user2", new User("Alex", 20));
        map1.put("user3", new User("Mike", 35));
        Map<String, User> map2 = new TreeMap<>();
        map2.put("user1", new User("Bob", 29));
        map2.put("user2", new User("Genry", 22));
        map2.put("user3", new User("Mike", 35));
        combinedTwoMaps(map1, map2);
        Map<Integer, String> mapIn = new HashMap<>();
        mapIn.put(1, "Slava");
        mapIn.put(2, "Alex");
        mapIn.put(3, "Mike");
        invertingKeysAndValues(mapIn);

        Map<String, Integer> mapList = new HashMap<>();
        mapList.put("Slava", 4);
        mapList.put("Alex", 5);
        mapList.put("Mike", 6);
        mapToList(mapList);

        TreeMap<String, Integer> map50 = new TreeMap<>();
        map50.put("Slava", 4);
        map50.put("Alex", 55);
        map50.put("Mike", 6);
        mapWithValuesMore(map50);

        HashMap<String, List<Integer>> studentGrades = new HashMap<>();
        studentGrades.put("Slava", List.of(80, 90, 75));
        studentGrades.put("Alex", List.of(95, 88, 92));
        studentGrades.put("Mike", List.of(70, 85, 78));
        changeKeyWithValue(studentGrades);

    }
}
