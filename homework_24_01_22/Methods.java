package javaPro.homework_210823.homework_24_01_22;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Methods {
    //Прочитайте файл и посчитайте средний рейтинг всех стримов. Запишите результат в новый файл.
    public double readAndGetAverageRating(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.lines()
                    .map(el -> el.split(", ")[1])
                    .mapToDouble(Double::parseDouble)
                    .average()
                    .orElse(0.0);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //        Отфильтруйте стримы, имеющие рейтинг выше 4.5, и запишите их в новый файл.
    public List<String> getStreamsWithScore(String fileName, Double score) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
                ) {
            List<String> highRatedStreams = reader.lines()
                    .filter(s -> Double.parseDouble(s.split(", ")[1]) > score)
                    .collect(Collectors.toList());

            highRatedStreams.forEach(s -> {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("Ex2.txt", true))) {
                    writer.write(s + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            return highRatedStreams;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Сгруппируйте стримы по названию и запишите количество стримов в каждой группе в новый файл.
    public void getStreamsWithSameName(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter("Ex3.txt"))) {
            Map<String, Long> groupedStreams = reader.lines()
                    .collect(Collectors.groupingBy(s -> s.split(":")[1], Collectors.counting()));
            for (Map.Entry<String, Long> entry : groupedStreams.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
                System.out.println(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    //        Отсортируйте стримы по рейтингу от наибольшего к наименьшему и запишите результаты в новый файл.
    public void sortStreamsByRating(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter("Ex4.txt"))) {

            List<String> sortedLines = reader.lines()
                    .sorted(Comparator.comparingDouble(line -> -Double.parseDouble(line.split(", ")[1])))
                    .collect(Collectors.toList());

            sortedLines.forEach(line -> {
                try {
                    writer.write(line + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            sortedLines.forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //        Найдите стримы с минимальным рейтингом и выведите их в новый файл.
    public void findStreamsMinRating(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter("Ex5.txt"))) {
            List<String> lines = reader.lines().collect(Collectors.toList());

            Optional<Double> minRating = lines.stream()
                    .map(line -> Double.parseDouble(line.split(", ")[1]))
                    .min(Double::compare);

            List<String> minRatingStreams = lines.stream()
                    .filter(line -> {
                        double rating = Double.parseDouble(line.split(", ")[1]);
                        return minRating.isPresent() && rating == minRating.get();
                    })
                    .collect(Collectors.toList());

            minRatingStreams.forEach(line -> {
                try {
                    writer.write(line + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            System.out.println("Cтримы с минимальным рейтингом: ");
            minRatingStreams.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //        Соберите статистику по рейтингам (минимальный, максимальный, средний) и запишите ее в новый файл.
    public void statisticRating(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter("Ex6.txt"))) {
            List<Double> ratings = reader.lines()
                    .map(line -> Double.parseDouble(line.split(", ")[1]))
                    .collect(Collectors.toList());
            DoubleSummaryStatistics statistics = ratings.stream()
                    .collect(Collectors.summarizingDouble(Double::doubleValue));
            writer.write("Минимальный рейтинг: " + statistics.getMin() + "\n");
            writer.write("Максимальный рейтинг: " + statistics.getMax() + "\n");
            writer.write("Средний рейтинг: " + statistics.getAverage() + "\n");

            System.out.println("Минимальный рейтинг: " + statistics.getMin());
            System.out.println("Максимальный рейтинг: " + statistics.getMax());
            System.out.println("Средний рейтинг: " + statistics.getAverage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //        Измените названия всех стримов, добавив к ним префикс "Stream-" и запишите обновленные названия в новый файл.
    public void updateStreamName(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter("Ex7.txt"))) {
            reader.lines()
                    .map(line -> "Stream " + line)
                    .forEach(updatedLine -> {
                        try {
                            writer.write(updatedLine + "\n");
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    //   Отфильтруйте стримы с рейтингом ниже 4.7 и преобразуйте их названия, добавив в конец "- Low Rated".
    //   Запишите результаты в новый файл.
    public void filterStreamAndUpdateName(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter("Ex8.txt"))) {
            List<String> filteredAndTransformedStreams = reader.lines()
                    .filter(line -> Double.parseDouble(line.split(", ")[1]) < 4.7)
                    .map(line -> line.split(", ")[0] + " - Low Rated")
                    .collect(Collectors.toList());
            filteredAndTransformedStreams.forEach(line -> {
                try {
                    writer.write(line + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            System.out.println("Отфильтруйте стримы с рейтингом ниже 4.7 и преобразуйте их названия, " +
                    "добавив в конец \"- Low Rated\"." + filteredAndTransformedStreams);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    //        Создайте сводку, включающую идентификатор стрима, название и рейтинг, и запишите ее
    //        в новый файл в формате "ID: Название - Рейтинг".
    public void createSummary(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter("Ex9.txt"))) {
            List<String> summary = reader.lines()
                    .map(line -> {
                        String[] parts = line.split(": ");
                        if (parts.length >= 2) {
                            String id = parts[0].trim();
                            String rest = parts[1].trim();
                            String[] restParts = rest.split(", ");
                            if (restParts.length >= 2) {
                                String name = restParts[0];
                                String rating = restParts[1];
                                return "ID: " + id + " - " + name + " - Рейтинг: " + rating;
                            } else {
                                return "Некорректный формат строки: " + line;
                            }
                        } else {
                            return "Некорректный формат строки: " + line;
                        }
                    })
                    .collect(Collectors.toList());
            summary.forEach(line -> {
                try {
                    writer.write(line + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            System.out.println(summary);
        }catch (IOException e) {
        throw new RuntimeException(e);
    }

    }

    //        Соберите все названия стримов в одну длинную строку, разделяя их запятыми, и запишите эту строку в новый файл.
    public void concatenateStreamNames(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter("Ex10.txt"))) {
            String concatenatedNames = reader.lines()
                    .map(line -> line.split(", ")[1])
                    .collect(Collectors.joining(", "));
            writer.write(concatenatedNames);

            System.out.println("Соберите все названия стримов в одну длинную строку, разделяя их запятыми:" + concatenatedNames);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
