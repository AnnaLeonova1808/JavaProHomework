package javaPro.Homework_29_06_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Homework_29_06_Streams {
    //1)Дан список строк. Необходимо отфильтровать строки, длина которых больше 3 символов,
    // преобразовать их в верхний регистр, удалить повторяющиеся и вывести результат в отсортированном порядке.
    public static List<String> filterStrings(List<String> strings) {
        List<String> str = strings.stream()
                .filter(el -> el.length() > 3)
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        return str;
    }

    //2)Дан список слов. Необходимо найти среднюю длину слов, начинающихся с буквы "A".
    public static double averageWordLength(List<String> words) {
        double average = words.stream()
                .filter(el -> el.startsWith("A"))
                .mapToInt(String::length)
                .average()
                .orElse(0);

        return average;
    }

    //3)Дан список слов. Необходимо сгруппировать их по длине и вывести результат.
    public static void rowGrouping(List<String> strings) {
        String result = strings.stream().reduce((str, el) -> str + " " + el).get();
        System.out.println(result);
    }

    //7) Дан список строк. Необходимо оставить только уникальные символы из всех строк и вывести их в алфавитном порядке.
    public static void uniqueCharacters(List<String> strings) {
        String result7 = strings.stream()
                .distinct()
                .sorted()
                .toList().toString();
        System.out.println(result7);
    }

    //9) Дан список слов. Необходимо отфильтровать слова, состоящие только из букв,
    // разделить их на гласные и согласные, и вывести результат.
    /*public static void filterWords(List<String> strings) {
        List<String> filteredWords = strings.stream()
                .collect(word -> Arrays.stream(word.split("")).collect(Collectors.groupingBy(el->Arrays.asList("aeiouAEIOU".split("")).contains(el)))
                .collect(Collectors.toList());

        List<String> vowels = filteredWords.stream()
                .filter(word -> word.matches("[aeiouAEIOU]+"))
                .collect(Collectors.toList());

        List<String> consonants = filteredWords.stream()
                .filter(word -> word.matches("[^aeiouAEIOU]+"))
                .collect(Collectors.toList());
        System.out.println("Гласные: " + vowels);
        System.out.println("Согласные: " + consonants);
    }*/

    //10 Дан список строк. Необходимо удалить пустые строки, объединить оставшиеся строки в одну строку,
    // разделенную запятой.
    public static void stringConcatenation(List<String> strings) {
        String result8 = strings.stream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.joining(","));
        System.out.println(result8);
    }

    //11) список слов. Необходимо объединить все символы из всех слов в одну строку.
    public static void combineCharacters(List<String> strings) {
        String result2 = strings.stream().reduce((str, el) -> str + el).get();
        System.out.println(result2);
    }
    //12)Дан список слов. Необходимо проверить, содержат ли они одинаковые символы (являются ли анаграммами) и вывести результат.
    public static void checkAnagrams(List<String> strings) {
        Map<String, Long> anagramCount = strings.stream()
                .collect(Collectors.groupingBy(word -> sortString(word), Collectors.counting()));

        Map<String, List<String>> anagramGroups = strings.stream()
                .filter(word -> anagramCount.get(sortString(word)) > 1)
                .collect(Collectors.groupingBy(word -> sortString(word)));

        anagramGroups.forEach((key, value) -> {
            System.out.println("Анаграммы " + value.get(0) + ": " + value);
        });
    }

    public static String sortString(String word) {
        char[] chars = word.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }


    //14) Дан список слов. Необходимо подсчитать количество слов для каждой длины и вывести результат.
    public static void lengthWords(List<String> strings) {
        Map<Integer, Long> wordLengthCounts = strings.stream()
                .collect(Collectors.groupingBy(
                        word -> word.length(), Collectors.counting()));
        wordLengthCounts.forEach((length, count) -> {
            System.out.println("length " + length + ":" + count);
        });
    }

    //15) Дан список строк. Необходимо отфильтровать строки, которые начинаются
    // с префикса "pre" и заканчиваются суффиксом "post".
    public static void containPrefixAndSuffix(List<String> strings2) {
        List<String> filteredString = strings2.stream()
                .filter(str -> str.startsWith("pre") && str.endsWith("post"))
                .collect(Collectors.toList());

        System.out.println(filteredString);
    }


    //16)Дан список слов. Необходимо подсчитать количество символов в каждом слове и вывести результат.
    public static void characters(List<String> symbol) {
        List<Integer> strings = symbol.stream().map(String::length)
                .collect(Collectors.toList());
        System.out.println(strings);
    }

    //18) Дан список слов. Необходимо найти самое длинное слово с четной длиной.
    public static void longestWordEvenLength(List<String> strings) {
        String longestWord = String.valueOf(strings.stream()
                .filter(word -> word.length() % 2 == 0)
                .max((word1, word2) -> word1.length() - word2.length()));


        System.out.println(longestWord);
    }

    //19) Дан список строк. Необходимо удалить все пробелы в каждой строке,
    // отсортировать их в лексикографическом порядке и вывести результат.
    public static void sortInLexicographicOrder(List<String> strings) {
        String result19 = strings.stream()
                .sorted()
                .collect(Collectors.joining());
        System.out.println(result19);

    }

    //20) Дан список слов. Необходимо проверить, являются ли они палиндромами, и вывести результат.
    public static void wordsIsPalindromes(List<String> strings) {
        strings.stream()
                .forEach(el -> {
                    boolean isPalindrome = isPalindrome(el);
                    System.out.println(el + " является " + (isPalindrome ? "палиндром" : "не палиндром"));
                });

    }

    private static boolean isPalindrome(String word) {
        String reversedWord = new StringBuilder(word)
                .reverse()
                .toString();
        return word.equalsIgnoreCase(reversedWord);
    }

    //22)Дан список строк. Необходимо объединить все строки в одну строку, добавив префикс ">>"
    // и суффикс "<<" к каждой строке.
    public static void addPrefixAndSuffixToString(List<String> strings) {
        String result22 = strings.stream().reduce("", (str, el) -> str + ">>" + el + "<<");

        System.out.println(result22);
    }

    //23) Дан список строк. Необходимо объединить все символы из всех строк,
    // удалить дубликаты и отсортировать их в лексикографическом порядке.
    public static void removeDuplicatesAndSort(List<String> strings) {
        String result23 = strings.stream()
                .flatMap(str -> Arrays.stream(str.split("")))
                .distinct()
                .sorted()
                .collect(Collectors.joining());
        System.out.println(result23);

    }


    //27) Дан список слов. Необходимо разделить их на две группы: одна группа -
    // слова с длиной менее или равной 4 символам, другая группа - слова с длиной более 4 символов.
    // После этого подсчитать количество слов в каждой группе и вывести результат.
    public static void divideWordsIntoGroups(List<String> strings) {
        List<String> group1 = strings.stream()
                .filter(el -> el.length() <= 4)
                .collect(Collectors.toList());

        List<String> group2 = strings.stream()
                .filter(el -> el.length() > 4)
                .collect(Collectors.toList());

        int countGroup1 = group1.size();
        int countGroup2 = group2.size();

        System.out.println("Слова с менее или равно 4 букв:" + countGroup1);
        System.out.println("Слова с более 4 букв:" + countGroup2);
    }

    //28) Дан список строк. Необходимо пропустить первые три символа в каждой строке
    // и объединить оставшиеся символы в одну строку.
    public static void skipFirstTreeCharAndConcatenateRest(List<String> strings) {
        String result = strings.stream()
                .map(str -> str.substring(3))
                .collect(Collectors.joining());
        System.out.println(result);

    }

    //30) Дан список строк. Необходимо проверить, содержит ли хотя бы одна строка подстроку "an" и вывести результат.
    public static void contentCheck(List<String> strings) {
        boolean containsSubstring = strings.stream()
                .anyMatch(str -> str.contains("an"));
        System.out.println("Cодержит 'an' " + containsSubstring);
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("January", "February", "March", "April", "May", "March", "march", "January");
        List<String> strings2 = Arrays.asList("present", "prefix", "presuffix", "pretext", "march", "repost", "prejupost");

        List<String> filteredStrings = filterStrings(strings);
        System.out.println(filteredStrings);

        double averageWord = averageWordLength(strings);//2
        System.out.println("Average length of words 'A':" + averageWord);//2

        rowGrouping(strings);//3

        uniqueCharacters(strings);//7

        //filterWords(strings);//9

        stringConcatenation(strings);//10

        combineCharacters(strings);//11

        checkAnagrams(strings);//12

        lengthWords(strings);//14

        containPrefixAndSuffix(strings2);//15

        characters(strings);//16

        longestWordEvenLength(strings);//18

        sortInLexicographicOrder(strings);//19

        wordsIsPalindromes(strings);//20

        addPrefixAndSuffixToString(strings);//22

        removeDuplicatesAndSort(strings);//23


        divideWordsIntoGroups(strings); //27

        skipFirstTreeCharAndConcatenateRest(strings);//28

        contentCheck(strings);//30


    }

}
