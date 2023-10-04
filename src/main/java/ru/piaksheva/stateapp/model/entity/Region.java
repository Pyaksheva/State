package ru.piaksheva.stateapp.model.entity;

import java.util.List;

public class Region {
    private final String regionName;
    private final List<District> districts;
    private final double square;
    private final City regionCenter;

    public Region(String regionName, List<District> districts, double square, City regionCenter) {
        this.regionName = regionName;
        this.districts = districts;
        this.square = square;
        this.regionCenter = regionCenter;
    }

    public String getRegionName() {
        return regionName;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public double getSquare() {
        return square;
    }

    public City getRegionCentre() {
        return regionCenter;
    }

    @Override
    public String toString() {
        return "Region{" +
                "regionName='" + regionName + '\'' +
                ", square=" + square +
                ", regionCenter=" + regionCenter +
                '}';
    }
}
