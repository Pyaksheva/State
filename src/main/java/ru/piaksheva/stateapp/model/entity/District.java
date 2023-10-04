package ru.piaksheva.stateapp.model.entity;

import java.util.List;

public class District {
    private final String districtName;
    private final List<City> cities;

    public District(String districtName, List<City> cities) {
        this.districtName = districtName;
        this.cities = cities;
    }

    public String getDistrictName() {
        return districtName;
    }

    public List<City> getCities() {
        return cities;
    }

    @Override
    public String toString() {
        return "District{" +
                "districtName='" + districtName + '\'' +
                '}';
    }
}
