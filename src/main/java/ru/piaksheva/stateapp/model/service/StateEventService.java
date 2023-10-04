package ru.piaksheva.stateapp.model.service;

import ru.piaksheva.stateapp.model.entity.*;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StateEventService {
    public void printCapital() {
        System.out.println("Столица " + State.getInstance().getCapital());
    }

    public void countRegions() {
        int count = State.getInstance().getRegions().size();
        System.out.println("Количество областей в государстве " + count);
    }

    public void squareState() {
        double square = State.getInstance().getRegions().stream()
                .map(region -> region.getSquare())
                .reduce((double) 0, (prev, next) -> prev + next);
        System.out.println("Площадь государства равна " + square + " тыс.км2");
    }

    public void printRegionCentre() {
        System.out.println("Список областных центров ");
        State.getInstance().getRegions().stream()
                .map(region -> region.getRegionCentre())
                .map(city -> city.getCityName())
                .forEach(cityName -> System.out.println(cityName));
    }

    public void printAverageAge() {
        List<Citizen> citizens = State.getInstance().getRegions().stream()
                .flatMap(region -> region.getDistricts().stream())
                .flatMap(district -> district.getCities().stream())
                .flatMap(city -> city.getCitizens().stream())
                .collect(Collectors.toList());
        int age = citizens.stream()
                .map(citizen -> citizen.getAge())
                .reduce(0, (prev, next) -> prev + next);
        System.out.println("Средний возраст жителей " + Math.round((double) (age) / citizens.size()) + " лет");
    }

    public void printCitizens(Predicate<Citizen> predicate) {
//      Predicate<Citizen> predicate = citizen -> citizen.getName().length() == n;
        for (Region region: State.getInstance().getRegions()){
            for (District district : region.getDistricts()) {
                for (City city : district.getCities()) {
                    List<Citizen> filteredCitizens = city.getCitizens().stream()
                            .filter(predicate)
                            .collect(Collectors.toList());
                    if (filteredCitizens.size() != 0) {
                        System.out.println("Жители области: " + region.getRegionName() + ", района: " + district.getDistrictName() + ", города: " + city.getCityName());
                        filteredCitizens.forEach(citizen -> System.out.println(citizen));
                    }
                }
            }

        }
    }

    public void nLetters(int n) {
        printCitizens(citizen -> citizen.getName().length() == n);
    }

    public void mLetters(String m) {
        printCitizens(citizen -> citizen.getName().startsWith(m));
    }

}


















