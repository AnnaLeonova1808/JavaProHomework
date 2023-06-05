package javaPro.homework.Homework_SetAndTreeSet;

import java.util.Set;
import java.util.TreeSet;

public class HomeworkTreeSet_3 {
    public static void main(String[] args) {
        Set<Produkt> set = new TreeSet<>();
        Produkt pr1 = new Produkt("meat", 30);
        Produkt pr2 = new Produkt("cheese", 30);
        set.add(pr1);
        set.add(pr2);
        System.out.println(set);
        int comparisonResult = pr1.compareTo(pr2);
        System.out.println("Comparison Result:" + comparisonResult);


    }

    static class Produkt implements Comparable<Produkt> {
        String name;
        int price;

        public Produkt(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Produkt{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }

        @Override
        public int compareTo(Produkt o) {
            if (this.price < o.price) {
                return -1;
            } else if (this.price > o.price) {
                return 1;
            } else {
                return 0;
            }
        }

    }
}

//Напишите класс Product, который имеет следующие поля:
//
//
//name (тип String) - название продукта;
//price (тип double) - цена продукта.
//Реализуйте интерфейс Comparable для класса Product, чтобы объекты Product могли быть сравниваемыми на основе цены.
// При сравнении двух объектов Product должно возвращаться отрицательное число, если первый продукт дешевле второго,
// положительное число, если первый продукт дороже второго, и ноль, если продукты имеют одинаковую цену.
