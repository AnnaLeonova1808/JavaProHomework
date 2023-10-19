package javaPro.homework_14_10;

import java.util.ArrayList;

public class Main {
//    public static Country findCountryWithMaxPopulation(List<Country> countries) { //Найти страну с максимальным населением.
//        Country maxPopulationCountry = null;
//        long maxPopulation = countries.get(0).getCountryPopulation();
//        for (int i = 1; i < countries.size(); i++) {
//            long populationCountry = countries.get(0).getCountryPopulation();
//            if (maxPopulation < populationCountry) {
//                maxPopulation = populationCountry;
//            }
//
//        }
//        return maxPopulationCountry;
//    }
    public static void main(String[] args) {
        Generator generator = new Generator();
        ArrayList<Country> countryArrayList = new ArrayList<>();
//        countryArrayList.add(Generator.countryGEN(1));
//        countryArrayList.add(Generator.countryGEN(2));
        generator.findCountryWithMaxPopulation(countryArrayList);
//        Country maxPopulationCountry = findCountryWithMaxPopulation(new ArrayList<>(countryArrayList));
//        System.out.println(maxPopulationCountry);
    }
}
