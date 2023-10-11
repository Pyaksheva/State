package ru.piaksheva.stateapp.controller;

import ru.piaksheva.stateapp.model.service.StateEventService;

public class Controller {
    StateEventService stateEventService = new StateEventService();

    public void printCapital(){
        stateEventService.printCapital();
    }

    public void countRegions() {
        stateEventService.countRegions();
    }

    public void squareState() {
        stateEventService.squareState();
    }

    public void printRegionCentre() {
        stateEventService.printRegionCentre();
    }

    public void printAverageAge() {
        stateEventService.printAverageAge();
    }

    public void nLetters(int n) {
        stateEventService.nLetters(n);
    }

    public void mLetters(String m) {
        stateEventService.mLetters(m);
    }
}
