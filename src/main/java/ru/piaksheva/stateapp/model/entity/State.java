package ru.piaksheva.stateapp.model.entity;

import ru.piaksheva.stateapp.model.service.RegionGenerator;

import java.util.ArrayList;
import java.util.List;

public class State {
    String stateName;
    City capital;
    List<Region> regions;

    private static State INSTANCE;

    private State() {}

    public static State getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new State();
            INSTANCE.stateName = "Россия";
            INSTANCE.regions = new ArrayList<>();
            RegionGenerator regionGenerator = new RegionGenerator();
            INSTANCE.regions.add(regionGenerator.generateRegion());
            INSTANCE.regions.add(regionGenerator.generateRegion());
            INSTANCE.regions.add(regionGenerator.generateRegion());
            INSTANCE.capital = INSTANCE.regions.get(0).getRegionCentre();
        }
        return INSTANCE;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public City getCapital() {
        return capital;
    }
    public List<Region> getRegions() {
        return regions;
    }
}
