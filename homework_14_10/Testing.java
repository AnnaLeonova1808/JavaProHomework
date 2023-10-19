package javaPro.homework_14_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Testing {
    //1) Найти страну с максимальным населением.
    public static Country findCountryWithMaxPopulation(List<Country> countries) {
        Country maxPopulationCountry = null;
        long maxPopulation = countries.get(0).getCountryPopulation();
        for (int i = 1; i < countries.size(); i++) {
            long populationCountry = countries.get(i).getCountryPopulation();
            if (populationCountry > maxPopulation) {
                maxPopulation = populationCountry;
                maxPopulationCountry = countries.get(i);
            }
        }
        return maxPopulationCountry;
    }

    // 2)Найти город с наибольшим числом улиц в регионе.
    public City findCityWithMaxStreets(Set<Region> regions) {
        City maxStreetsCity = null;
        int maxStreets = 0;
        List<Region> regionList = new ArrayList<>(regions);
        for (int i = 0; i < regionList.size(); i++) {
            Region region = regionList.get(i);
            int streetsInRegion = 0;
            City сityWithMaxStreetsInRegion = null;
            List<City> cities = new ArrayList<>(region.getCities());
            for (int j = 0; j < cities.size(); j++) {
                City city = cities.get(j);
                int streetsInCity = city.getStreets().size();
                if (streetsInCity > streetsInRegion) {
                    streetsInRegion = streetsInCity;
                    сityWithMaxStreetsInRegion = city;
                }
            }
            if (streetsInRegion > maxStreets) {
                maxStreets = streetsInRegion;
                maxStreetsCity = сityWithMaxStreetsInRegion;
            }
        }
        return maxStreetsCity;
    }

    //3)Вычислить средний доход по регионам страны.
    public float calculateAverageIncomeByRegions(Country country) {
        Set<Region> regions = country.getRegions();
        float sumIncome = 0;
        int regionCount = regions.size();
        for (Region region : regions) {
            sumIncome = sumIncome + region.getRegionIncome();
        }
        return sumIncome / regionCount;
    }

    //4)Найти регион с наименьшим населением в стране.
    public Region findRegionWithMinPopulation(Country country) {
        Region minPopulationRegion = null;
        long minPopulation = 0; // (Long.MAX_VALUE)
        List<Region> regions = new ArrayList<>(country.getRegions());
        for (int i = 0; i < regions.size(); i++) {
            Region region = regions.get(i);
            long populationRegion = region.getRegionPopulation();
            if (populationRegion < minPopulation) {
                minPopulation = populationRegion;
                minPopulationRegion = region;
            }
        }
        return minPopulationRegion;
    }

    //  5)Вычислить общее число домов на улицах города.
    public int calculateTotalHousesInCity(City city) {
        List<Street> streets = new ArrayList<>(city.getStreets());
        int totalHousesInCity = 0;
        for (int i = 0; i < streets.size(); i++) {
            //totalHousesInCity += streets.get(i).getHouseNumbers();
            totalHousesInCity = totalHousesInCity + streets.get(i).getHouseNumbers();
        }
        return totalHousesInCity;
    }

    //  6)Посчитать количество городов в стране.
    public int countCitiesInCountry(Country country) {
        List<Region> regions = new ArrayList<>(country.getRegions());
        int totalCitiesInCountry = 0;
        for (int i = 0; i < regions.size(); i++) {
            Region region = regions.get(i);
            List<City> citiesInRegion = new ArrayList<>(region.getCities());
            totalCitiesInCountry += citiesInRegion.size();
        }
        return totalCitiesInCountry;
    }

    //   7)Найти город с наименьшим населением в регионе.
    public City findCityWithMinPopulationInRegion(Region region) {
        City minPopulationCity = null;
        long minPopulation = 0; // (Long.MAX_VALUE)
        List<City> cites = new ArrayList<>(region.getCities());
        for (int i = 0; i < cites.size(); i++) {
            City city = cites.get(i);
            long populationCity = city.getCityPopulation();
            if (populationCity < minPopulation) {
                minPopulation = populationCity;
                minPopulationCity = city;
            }
        }
        return minPopulationCity;
    }

    //  8)Найти улицу с наибольшим количеством домов в городе.
    public Street findStreetWithMaxHouses(City city) {
        Street maxFindHouses = null;
        int maxFind = 0;
        List<Street> streets = new ArrayList<>(city.getStreets());
        for (int i = 0; i < streets.size(); i++) {
            Street street = streets.get(i);
            int findHouses = street.getHouseNumbers();
            if (findHouses > maxFind) {
                maxFind = findHouses;
                maxFindHouses = street;
            }
        }
        return maxFindHouses;
    }

    //    9)Определить, сколько улиц в регионе.
    public int countStreetsInRegion(Region region) {
        List<City> citiesInRegion = new ArrayList<>(region.getCities());
        int totalStreetsInRegion = 0;
        for (int i = 0; i < citiesInRegion.size(); i++) {
            City city = citiesInRegion.get(i);
            List<Street> streetsInCity = new ArrayList<>(city.getStreets());
            totalStreetsInRegion += streetsInCity.size();
        }
        return totalStreetsInRegion;
    }

    //    10)Найти страну с минимальным населением.
    public long findCountryWithMinPopulation(List<Country> countries) {
        Country minPopulationCountry = null;
        long minPopulationInCountry = 0;
        for (int i = 0; i < countries.size(); i++) {
            Country country = countries.get(i);
            long populationCountry = countries.get(i).getCountryPopulation();
            if (populationCountry < minPopulationInCountry) {
                minPopulationInCountry = populationCountry;
                minPopulationCountry = country;
            }
        }
        return minPopulationCountry.getCountryPopulation();
    }

    //    11)Найти город с максимальным населением в регионе.
    public City findCityWithMaxPopulationInRegion(Region region) {
        List<City> cities = new ArrayList<>(region.getCities());
        City maxPopulationCity = null;
        long maxPopulation = 0;
        for (int i = 0; i < cities.size(); i++) {
            City city = cities.get(i);
            long populationCity = city.getCityPopulation();
            if (populationCity > maxPopulation) {
                maxPopulation = populationCity;
                maxPopulationCity = city;
            }
        }
        return maxPopulationCity;
    }

    //    12)Найти регион с максимальным доходом.
    public Region findRegionWithMaxIncome(Country country) {
        List<Region> regions = new ArrayList<>(country.getRegions());
        Region maxIncomeRegion = null;
        double maxIncome = 0;
        for (int i = 0; i < regions.size(); i++) {
            Region region = regions.get(i);
            double incomeRegion = region.getRegionIncome();
            if (incomeRegion > maxIncome) {
                maxIncome = incomeRegion;
                maxIncomeRegion = region;
            }
        }
        return maxIncomeRegion;
    }

    //    13)Подсчитать общий доход всех регионов в стране.
    public float calculateTotalIncomeForCountry(Country country) {
        List<Region> regionInCountry = new ArrayList<>(country.getRegions());
        float totalIncomeCountry = 0;
        for (int i = 0; i < regionInCountry.size(); i++) {
            Region region = regionInCountry.get(i);
            float incomeRegion = region.getRegionIncome();
            totalIncomeCountry += incomeRegion;
        }
        return totalIncomeCountry;
    }

    //    14)Найти улицу с минимальным количеством домов в городе.
    public Street findStreetWithMinHouses(City city) {
        List<Street> streets = new ArrayList<>(city.getStreets());
        Street minStreetHouse = null;
        int minHouseCount = streets.get(0).getHouseNumbers();
        for (int i = 1; i < streets.size(); i++) {
            Street street = streets.get(i);
            int houseCount = street.getHouseNumbers();
            if (minHouseCount > houseCount) {
                minHouseCount = houseCount;
                minStreetHouse = street;
            }
        }
        return minStreetHouse;
    }

    //    15)Найти город с минимальным числом улиц в регионе.
    public City findCityWithMinStreets(Set<Region> regions) {
        City cityWithMinStreets = null;
        int minStreets = 0;
        List<Region> regionList = new ArrayList<>(regions);
        for (int i = 0; i < regionList.size(); i++) {
            Region region = regionList.get(i);
            int streetsInRegion = 0;
            List<City> cities = new ArrayList<>(region.getCities());
            City city = null;
            for (int j = 0; j < cities.size(); j++) {
                city = cities.get(j);
                int streetsInCity = city.getStreets().size();
                if (streetsInCity < streetsInRegion) {
                    streetsInRegion = streetsInCity;
                    cityWithMinStreets = city;
                }
            }
            if (streetsInRegion < minStreets) {
                minStreets = streetsInRegion;
                cityWithMinStreets = city;
            }
        }
        return cityWithMinStreets;
    }

    //    16)Подсчитать общее количество регионов в списке стран.
    public int countRegionsInCountriesList(List<Country> countries) {
        int countRegions = 0;
        for (int i = 0; i < countries.size(); i++) {
            //countRegions = countRegions + countries.get(i).getRegions().size();
            countRegions += countries.get(i).getRegions().size();
        }
        return countRegions;
    }

    //    17)Найти регион с минимальным доходом.
    public Region findRegionWithMinIncome(Country country) {
        List<Region> regions = new ArrayList<>(country.getRegions());
        Region minIncomeRegion = null;
        double minIncome = 0;
        for (int i = 0; i < regions.size(); i++) {
            Region region = regions.get(i);
            double incomeRegion = region.getRegionIncome();
            if (incomeRegion < minIncome) {
                minIncome = incomeRegion;
                minIncomeRegion = region;
            }
        }
        return minIncomeRegion;
    }

    //    18) Найти страну, у которой город с максимальным населением имеет наименьший доход в регионе.
    public Country findCountryWithCityHavingMaxPopulationAndMinIncome(List<Country> countries) {
        Country countryWithCity = null;
        long maxPopulationInCity = 0;
        float minIncomeInCity = 0;
        for (int i = 0; i < countries.size(); i++) {
            Country country = countries.get(i);
            List<Region> regions = new ArrayList<>(country.getRegions());
            for (int j = 0; j < regions.size(); j++) {
                Region region = regions.get(j);
                List<City> cities = new ArrayList<>(region.getCities());
                for (int k = 0; k < cities.size(); k++) {
                    City city = cities.get(k);
                    long populationInCity = city.getCityPopulation();
                    float incomeInCity = city.getCityIncome();
                    if (populationInCity > maxPopulationInCity && incomeInCity < minIncomeInCity) {
                        maxPopulationInCity = populationInCity;
                        minIncomeInCity = incomeInCity;
                        countryWithCity = country;
                    }
                }
            }
        }
        return countryWithCity;
    }

    //    19)Подсчитать общее количество улиц в стране.
    public int countStreetsInCountry(Country country) {
        List<Region> regions = new ArrayList<>(country.getRegions());
        int countStreets = 0;
        for (int i = 0; i < regions.size(); i++) {
            Region region = regions.get(i);
            List<City> cities = new ArrayList<>(region.getCities());
            for (int j = 0; j < cities.size(); j++) {
                City city = cities.get(j);
                countStreets = countStreets + city.getStreets().size();
                //countStreets += city.getStreets().size();
            }
        }
        return countStreets;
    }

    //    20)Определить среднее количество домов на улице в городе.
    public float calculateAverageHousesPerStreet(City city) {
        List<Street> streets = new ArrayList<>(city.getStreets());
        int totalHouse = 0;
        int totalStreets = streets.size();
        for (int i = 0; i < streets.size(); i++) {
            totalHouse += streets.get(i).getHouseNumbers();

        }
        return totalHouse / totalStreets;
    }

    //    21)Найти страну, у которой больше всего городов с населением больше миллиона.
    public Country findCountryWithMostCitiesOverMillion(List<Country> countries) {
        Country mostCitiesOverMillion = null;
        int maxCitiesOverMillion = 0;
        for (int i = 0; i < countries.size(); i++) {
            Country country = countries.get(i);
            int citiesOverMillion = 0;
            for (int j = 0; j < country.getCities().size(); j++) {
                City city = country.getCities().get(j);
                if (city.getCityPopulation() > 1000000) {
                    citiesOverMillion++;
                }
            }
            if (citiesOverMillion > maxCitiesOverMillion) {
                maxCitiesOverMillion = citiesOverMillion;
                mostCitiesOverMillion = country;
            }
        }
        return mostCitiesOverMillion;
    }

    //    22)Определить среднее население городов в регионе.
    public float calculateAverageCityPopulationInRegion(Region region) {
        List<City> cities = new ArrayList<>(region.getCities());
        float totalPopulationInRegion = 0;
        if (cities.size() > 0) {
            for (int i = 0; i < cities.size(); i++) {
                totalPopulationInRegion += cities.get(i).getCityPopulation();
            }
            return totalPopulationInRegion / cities.size();
        } else {
            return 0;
        }
    }

    //    23)Найти регион с наибольшим количеством городов.
    public Region findRegionWithMostCities(Country country) {
        List<Region> regions = new ArrayList<>(country.getRegions());
        Region maxCitiesInRegion = null;
        int totalCityCount = 0;
        for (int i = 0; i < regions.size(); i++) {
            Region region = regions.get(i);
            int totalCity = region.getCities().size();
            if (totalCity > totalCityCount) {
                totalCityCount = totalCity;
                maxCitiesInRegion = region;
            }
        }
        return maxCitiesInRegion;
    }

    //    24)Найти страну, у которой регион с наименьшим населением имеет наибольший доход.
    public Country findCountryWithRegionHavingMinPopulationAndMaxIncome(List<Country> countries) {
        Country countryWithRegion = null;
        long minPopulationInRegion = 0;
        float maxIncomeInRegion = 0;
        for (int i = 0; i < countries.size(); i++) {
            Country country = countries.get(i);
            List<Region> regions = new ArrayList<>(country.getRegions());
            for (int j = 0; j < regions.size(); j++) {
                Region region = regions.get(j);
                long populationInRegion = region.getRegionPopulation();
                float incomeInRegion = region.getRegionIncome();
                if (populationInRegion < minPopulationInRegion && incomeInRegion > maxIncomeInRegion) {
                    minPopulationInRegion = populationInRegion;
                    maxIncomeInRegion = incomeInRegion;
                    countryWithRegion = country;
                }
            }
        }
        return countryWithRegion;
    }

    //    25)Найти город, у которого улица с наибольшим количеством домов имеет наименьшее население.
    public City findCityWithStreetHavingMaxHousesAndMinPopulation(Region region) {
        List<City> cityList = new ArrayList<>(region.getCities());
        City cityWithStreet = null;
        int maxCountHouse = 0;
        long minCountPopulation = 0;
        for (int i = 0; i < cityList.size(); i++) {
            City city = cityList.get(i);
            long countPopulation = city.getCityPopulation();
            List<Street> streetList = new ArrayList<>(city.getStreets());
            for (int j = 0; j < streetList.size(); j++) {
                Street street = streetList.get(j);
                int countHouse = street.getHouseNumbers();
                if (countPopulation < minCountPopulation || (countPopulation == minCountPopulation && countHouse > maxCountHouse)) {
                    minCountPopulation = countPopulation;
                    maxCountHouse = countHouse;
                    cityWithStreet = city;
                }

            }
        }
        return cityWithStreet;
    }

    //    26)Подсчитать общий доход городов в регионе.
    public float calculateTotalIncomeForCitiesInRegion(Region region) {
        List<City> cities = new ArrayList<>(region.getCities());
        float totalIncomeForCities = 0;
        for (int i = 0; i < cities.size(); i++) {
            totalIncomeForCities += cities.get(i).setCityIncome();
        }
        return totalIncomeForCities;
    }

    //    27)Найти улицу в регионе, у которой наименьшее количество домов и которая находится в городе с наибольшим населением.
    public Street findStreetInRegionWithMinHousesAndLocatedInMostPopulatedCity(Region region) {
        List<City> cities = new ArrayList<>(region.getCities());
        Street streetInRegion = null;
        long maxPopulationCity = 0;
        int minTotalStreets = 0;
        for (int i = 0; i < cities.size(); i++) {
            City city = cities.get(i);
            long populationCity = city.getCityPopulation();
            List<Street> streets = new ArrayList<>(city.getStreets());
            for (int j = 0; j < streets.size(); j++) {
                Street street = streets.get(j);
                int totalHouses = street.getHouseNumbers();
                if (populationCity > maxPopulationCity ||
                        (populationCity == maxPopulationCity && totalHouses < minTotalStreets)) {
                    maxPopulationCity = populationCity;
                    minTotalStreets = totalHouses;
                    streetInRegion = street;
                }
            }
        }
        return streetInRegion;
    }

    //    28)Найти страну, у которой регион с наименьшим числом городов имеет наибольшее количество улиц.
    public Country findCountryWithRegionHavingMinCitiesAndMaxStreets(List<Country> countries) {
        Country countryWithRegionHavingMinCitiesAndMaxStreets = null;
        int minCountCityInRegion = 0;
        int maxCountStreets = 0;
        for (int i = 0; i < countries.size(); i++) {
            Country country = countries.get(i);
            List<Region> regionList = new ArrayList<>(country.getRegions());
            for (int j = 0; j < regionList.size(); j++) {
                Region region = regionList.get(j);
                int totalCity = region.getCities().size();
                int totalStreetinRegion = 0;
                List<City> cityList = new ArrayList<>(region.getCities());
                for (int k = 0; k < cityList.size(); k++) {
                    City city = cityList.get(k);
                    List<Street> streets = new ArrayList<>(city.getStreets());
                    int totalStreet = streets.size();
                    totalStreetinRegion += totalStreet;
                }
                if (totalCity < minCountCityInRegion && totalStreetinRegion > maxCountStreets) {
                    minCountCityInRegion = totalCity;
                    maxCountStreets = totalStreetinRegion;
                    countryWithRegionHavingMinCitiesAndMaxStreets = country;
                }
            }
        }
        return countryWithRegionHavingMinCitiesAndMaxStreets;
    }

    //    29)Найти город с максимальным населением и минимальным количеством улиц.
    public City findCityWithMaxPopulationAndMinStreets(Region region) {
        List<City> cities = new ArrayList<>(region.getCities());
        City cityWithMaxPopulationAndMinStreets = null;
        int cityMaxPopulation = 0;
        int cityMinStreets = 0;
        for (int i = 0; i < cities.size(); i++) {
            City city = cities.get(i);
            int populationCount = 0;
            List<Street> streets = new ArrayList<>(city.getStreets());
            for (int j = 0; j < streets.size(); j++) {
                Street street = streets.get(j);
                populationCount += street.getHouseNumbers();
            }
            int streetsCount = streets.size();
            if (populationCount > cityMaxPopulation && streetsCount < cityMinStreets) {
                cityMaxPopulation = populationCount;
                cityMinStreets = streetsCount;
                cityWithMaxPopulationAndMinStreets = city;
            }
        }
        return cityWithMaxPopulationAndMinStreets;
    }

    //    30)Определить, в каком городе региона улица с наибольшим числом домов имеет наибольшее население.
    public City findCityInRegionWhereStreetWithMaxHousesHasMaxPopulation(Region region) {
        List<City> cities = new ArrayList<>(region.getCities());
        City maxHousesPopulapionStreet = null;
        int maxTotalHouses = 0;
        int maxTotalPopulation = 0;
        for (int i = 0; i < cities.size(); i++) {
            City city = cities.get(i);
            int houseCount = 0;
            List<Street> streets = new ArrayList<>(city.getStreets());
            for (int j = 0; j < streets.size(); j++) {
                Street street = streets.get(j);
                int populationCount = street.getHouseNumbers();
                houseCount += populationCount;
                if (populationCount > maxTotalPopulation) {
                    maxTotalPopulation = populationCount;
                }
            }
            if (houseCount > maxTotalHouses) {
                maxTotalHouses = houseCount;
                maxHousesPopulapionStreet = city;
            }
        }
        return maxHousesPopulapionStreet;
    }

    //    31)Подсчитать общее количество улиц, названия которых начинаются на заданную букву, в городе.
    public int countStreetsInCityStartingWithLetter(City city, char letter) {
        List<Street> streets = new ArrayList<>(city.getStreets());
        int totalStreetsWhithLetter = 0;
        for (int i = 0; i < streets.size(); i++) {
            Street street = streets.get(i);
            if (street.getName().startsWith(String.valueOf(letter))) {
                totalStreetsWhithLetter++;
            }
        }
        return totalStreetsWhithLetter;
    }

    //    32)Найти город с наибольшим количеством улиц, названия которых начинаются на заданную букву.
    public City findCityWithMostStreetsStartingWithLetter(Region region, char letter) {
        List<City> cities = new ArrayList<>(region.getCities());
        City cityStreetsWithLetter = null;
        int maxStreetCount = 0;
        for (int i = 0; i < cities.size(); i++) {
            City city = cities.get(i);
            int streetCount = 0;
            List<Street> streets = new ArrayList<>(city.getStreets());
            for (int j = 0; j < streets.size(); j++) {
                Street street = streets.get(i);
                if (street.getName().startsWith(String.valueOf(letter))) {
                    streetCount++;
                }
            }
            if (streetCount > maxStreetCount) {
                maxStreetCount = streetCount;
                cityStreetsWithLetter = city;
            }
        }
        return cityStreetsWithLetter;
    }

    //    33)Найти регион с наименьшим количеством улиц, названия которых заканчиваются на заданную букву.
    public Region findRegionWithMinStreetsEndingWithLetter(Country country, char letter) {
        List<Region> regions = new ArrayList<>(country.getRegions());
        Region regionWithMinStreets = null;
        int minStreetCount = 0;
        for (int i = 0; i < regions.size(); i++) {
            Region region = regions.get(i);
            int streetCount = 0;

            List<City> cities = new ArrayList<>(region.getCities());
            for (int j = 0; j < cities.size(); j++) {
                City city = cities.get(j);
                List<Street> streets = city.getStreets();
                for (int k = 0; k < streets.size(); k++) {
                    Street street = streets.get(k);
                    if (street.getName().endsWith(String.valueOf(letter))) {
                        streetCount++;
                    }
                }
            }
            if (streetCount < minStreetCount) {
                minStreetCount = streetCount;
                regionWithMinStreets = region;
            }
        }
        return regionWithMinStreets;
    }
}



