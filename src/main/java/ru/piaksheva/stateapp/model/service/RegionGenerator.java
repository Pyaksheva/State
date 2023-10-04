package ru.piaksheva.stateapp.model.service;

import ru.piaksheva.stateapp.model.entity.Citizen;
import ru.piaksheva.stateapp.model.entity.City;
import ru.piaksheva.stateapp.model.entity.District;
import ru.piaksheva.stateapp.model.entity.Region;

import java.util.ArrayList;
import java.util.List;

public class RegionGenerator {
    CitizenGenerator citizenGenerator = new CitizenGenerator();

    public String generateString() {
        int length = 7;
        String result = "";
        for (int i = 0; i < length; i++) {
            char ch = (char) ('a' + (int) (Math.random() * 100) % ('z' - 'a' + 1));
            result = result + ch;
        }
        return result;
    }

    public double generateSquare() {
        double square = Math.random() * 100 + 50;
        return square;
    }

    public City generateCity() {
        List<Citizen> citizens = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Citizen citizen = citizenGenerator.generateCitizen();
            citizens.add(citizen);
        }
        City city = new City(generateString(), citizens);
        return city;
    }

    public District generateDistrict() {
        List<City> cities = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            City city = generateCity();
            cities.add(city);
        }
        District district = new District(generateString(), cities);
        return district;
    }

    public Region generateRegion() {
        List<District> districts = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            District district = generateDistrict();
            districts.add(district);
        }
        Region region = new Region(generateString(), districts, generateSquare(), districts.get(0).getCities().get(0));
        return region;
    }
}
