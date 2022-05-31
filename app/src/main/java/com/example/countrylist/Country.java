package com.example.countrylist;

public class Country {
    String countryFlag,countryMap,capital,countryName,population,area;

    public Country(String countryFlag, String countryMap, String capital, String countryName, String population, String area) {
        this.countryFlag = countryFlag;
        this.countryMap = countryMap;
        this.capital = capital;
        this.countryName = countryName;
        this.population = population;
        this.area = area;
    }

    public String getCountryFlag() {
        return countryFlag;
    }

    public void setCountryFlag(String countryFlag) {
        this.countryFlag = countryFlag;
    }

    public String getCountryMap() {
        return countryMap;
    }

    public void setCountryMap(String countryMap) {
        this.countryMap = countryMap;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
