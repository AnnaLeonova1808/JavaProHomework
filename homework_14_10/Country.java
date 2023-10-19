package javaPro.homework_14_10;

import java.Homework6.HomeWorkRubberArray;
import java.util.List;
import java.util.Set;


public class Country {
    private String name;
    private Set<Region> regions;
    private long countryPopulation;


    public Country(String name, Set<Region> regions, long countryPopulation) {
        this.name = name;
        this.regions = regions;
        this.countryPopulation = countryPopulation;
    }

    public String getName() {
        return name;
    }

    public Set<Region> getRegions() {
        return regions;
    }

    public long getCountryPopulation() {
        return countryPopulation;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", regions=" + regions +
                ", countryPopulation=" + countryPopulation +
                '}';
    }

    public HomeWorkRubberArray getCities() {
        return null;
    }
}


class Region {
    private Set<City> cities;
    private String regName;
    private long regionPopulation;
    private float regionIncome;

    public Region(Set<City> cities, String regName, long regionPopulation, float regionIncome) {
        this.cities = cities;
        this.regName = regName;
        this.regionPopulation = regionPopulation;
        this.regionIncome = regionIncome;
    }

    public Set<City> getCities() {
        return cities;
    }

    public String getRegName() {
        return regName;
    }

    public long getRegionPopulation() {
        return regionPopulation;
    }

    public float getRegionIncome() {
        return regionIncome;
    }

    @Override
    public String toString() {
        return "Region{" +
                "cities=" + cities +
                ", regName='" + regName + '\'' +
                ", regionPopulation=" + regionPopulation +
                ", regionIncome=" + regionIncome +
                '}';
    }
}


class City {
    private String cityName;
    private long cityPopulation;
    private List<Street> streets;
    private float cityIncome;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public long getCityPopulation() {
        return cityPopulation;
    }

    public void setCityPopulation(long cityPopulation) {
        this.cityPopulation = cityPopulation;
    }

    public List<Street> getStreets() {
        return streets;
    }

    public void setStreets(List<Street> streets) {
        this.streets = streets;
    }

    public float getCityIncome() {
        return cityIncome;
    }

    public void setCityIncome(float cityIncome) {
        this.cityIncome = cityIncome;
    }

    public City(String cityName, long cityPopulation, List<Street> streets, float cityIncome) {
        this.cityName = cityName;
        this.cityPopulation = cityPopulation;
        this.streets = streets;
        this.cityIncome = cityIncome;
    }



    @Override
    public String toString() {
        return "*CITY*: [ CITY NAME-" + cityName + ". CITY POPULATION-" + cityPopulation + ". " + streets + "|";
    }

    public float setCityIncome() {
        return 0;
    }
}


class Street {
    private int houseNumbers;
    private String name;

    public Street(int houseNumbers, String name) {
        this.houseNumbers = houseNumbers;
        this.name = name;
    }

    public int getHouseNumbers() {
        return houseNumbers;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "*STREET*: [ HOUSE NUMBERS-" + houseNumbers + ". STREET NAME-" + name + ".";
    }
}