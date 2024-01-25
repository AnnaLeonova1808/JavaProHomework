package javaPro.homework_210823.homework_24_01_22;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();
        System.out.println("Средний рейтинг: " + methods.readAndGetAverageRating("C:\\TelRan\\JAVA\\LessonTwo\\src\\javaPro\\homework_210823\\homework_24_01_22\\f.txt"));

        double targetScore = 4.5;
        List<String> highRatedStreams = methods.getStreamsWithScore("C:\\TelRan\\JAVA\\LessonTwo\\src\\javaPro\\homework_210823\\homework_24_01_22\\f.txt", targetScore);
        System.out.println("Cтримы, имеющие рейтинг выше " + targetScore + ":" );
        highRatedStreams.forEach(System.out::println);
        System.out.println("Стримы отсортированы по рейтингу и записаны в файл Ex2txt");

        methods.getStreamsWithSameName("C:\\TelRan\\JAVA\\LessonTwo\\src\\javaPro\\homework_210823\\homework_24_01_22\\f.txt");
        System.out.println("Сгруппированы стримы по названию и записано количество стримов в каждой группе, запись в файл Ex3.txt");

        methods.sortStreamsByRating("C:\\TelRan\\JAVA\\LessonTwo\\src\\javaPro\\homework_210823\\homework_24_01_22\\f.txt");
        System.out.println("Отсортированы стримы по рейтингу от наибольшего к наименьшему и записаны в файл Ex4.txt");

        methods.findStreamsMinRating("C:\\TelRan\\JAVA\\LessonTwo\\src\\javaPro\\homework_210823\\homework_24_01_22\\f.txt");
        System.out.println("Cтримы с минимальным рейтингом записаны в файл Ex5.txt");

        methods.statisticRating("C:\\TelRan\\JAVA\\LessonTwo\\src\\javaPro\\homework_210823\\homework_24_01_22\\f.txt");
        System.out.println("Cтатистика по рейтингам (минимальный, максимальный, средний) записаны в файл Ex6.txt");

        methods.updateStreamName("C:\\TelRan\\JAVA\\LessonTwo\\src\\javaPro\\homework_210823\\homework_24_01_22\\f.txt");
        System.out.println("Измените названия всех стримов, добавив к ним префикс \"Stream-\"  записаны в файл Ex7.txt");

        methods.filterStreamAndUpdateName("C:\\TelRan\\JAVA\\LessonTwo\\src\\javaPro\\homework_210823\\homework_24_01_22\\f.txt");
        System.out.println("Отфильтруйте стримы с рейтингом ниже 4.7 и преобразуйте их названия, добавив" +
                " в конец \"- Low Rated\"  записано в файл Ex8.txt");

        methods.createSummary("C:\\TelRan\\JAVA\\LessonTwo\\src\\javaPro\\homework_210823\\homework_24_01_22\\f.txt");
        System.out.println("Создайте сводку, включающую идентификатор стрима, название и рейтинг, и запишите ее\\n\" +\n" +
                "                \"// в новый файл в формате \\\"ID: Название - Рейтинг\\\"\"  записано в файл Ex9.txt");

        methods.concatenateStreamNames("C:\\TelRan\\JAVA\\LessonTwo\\src\\javaPro\\homework_210823\\homework_24_01_22\\f.txt");
        System.out.println("Соберите все названия стримов в одну длинную строку, разделяя их запятыми, записано в файл Ex10.txt");
    }
}
