package javaPro.homework.Homework_SetAndTreeSet;

import java.util.Set;
import java.util.TreeSet;

public class HomeworkTreeSet_5 {
    public static void main(String[] args) {
        Set<Country> set = new TreeSet<>();
        Country cnt1 = new Country("Switzerland", 8703000);
        Country cnt2 = new Country("Germany", 83200000);
        set.add(cnt1);
        set.add(cnt2);
        System.out.println(set);
        int comparisonResult = cnt1.compareTo(cnt2);
        System.out.println("Comparison Result:" + comparisonResult);
    }

    static class Country implements Comparable<Country> {
        String name;
        int population;


        public Country(String name, int population) {
            this.name = name;
            this.population = population;
        }

        @Override
        public int compareTo(Country o) {
            if (this.population < o.population) {
                return -1;
            } else if (this.population > o.population) {
                return 1;
            } else {
                return 0;
            }
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        @Override
        public String toString() {
            return "Country{" +
                    "name='" + name + '\'' +
                    ", population=" + population +
                    '}';
        }
    }
}

//Напишите класс Country, который имеет следующие поля:
//
//
//name (тип String) - название страны;
//population (тип int) - население страны.
//Реализуйте интерфейс Comparable для класса Country, чтобы объекты Country могли быть сравниваемыми
// на основе населения. При сравнении двух объектов Country должно возвращаться отрицательное число,
// если первая страна имеет меньшее население, положительное число, если первая страна имеет большее население,
// и ноль, если страны имеют одинаковое население.
