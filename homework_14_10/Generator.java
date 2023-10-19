package javaPro.homework_14_10;

import com.github.javafaker.Faker;

import java.util.*;

public class Generator extends Faker {
    public static void main(String[] args) {
        System.out.println(cityGEN(1));
    }
    private static final Faker FAKER = new Faker();
    private static final Random RANDOM = new Random();

    public static List<Street> streetGEN(int number) {
        List<Street> list = new ArrayList<>(number);
        for (int i = 0; i < number; i++) {
            list.add(new Street(RANDOM.nextInt(250), FAKER.address().cityName()));
        }
        return list;
    }

    public static Set<Region> regionGEN(int number) {
        Set<Region> regions = new HashSet<>(number);
        for (int i = 0; i < number; i++) {
            regions.add(new Region(cityGEN(number), FAKER.address().state(), RANDOM.nextInt(), RANDOM.nextInt()));
        }
        return regions;
    }

    public static Set<City> cityGEN(int number) {
        Set<City> set = new HashSet<>();
        for (int i = 0; i < number; i++) {
            set.add(new City(FAKER.address().cityName(), RANDOM.nextInt(3_000_000), streetGEN(number)));
        }
        return set;
    }

//    public static Country countryGEN(int regionsNumber) {
//        //return new Country(FAKER.country().name(), regionGEN(regionsNumber), RANDOM.nextInt(500_000));
//        String countryName = FAKER.address().country(); // Получаем имя страны
//        Set<Region> regions = regionGEN(regionsNumber);
//        long population = RANDOM.nextInt(500_000);
//        return new Country(countryName, regions, population);
//    }

    public void findCountryWithMaxPopulation(ArrayList<Country> countryArrayList) {
    }
}