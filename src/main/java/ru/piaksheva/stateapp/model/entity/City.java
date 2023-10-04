package ru.piaksheva.stateapp.model.entity;

import java.util.List;

public class City {
    private final String cityName;
    private final List<Citizen> citizens;

    public City(String cityName, List<Citizen> citizens) {
        this.cityName = cityName;
        this.citizens = citizens;
    }

    public String getCityName() {
        return cityName;
    }

    public List<Citizen> getCitizens() {
        return citizens;
    }

    @Override
    public String toString() {
        return cityName;
    }
}
