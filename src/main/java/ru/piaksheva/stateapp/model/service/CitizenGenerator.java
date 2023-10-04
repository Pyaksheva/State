package ru.piaksheva.stateapp.model.service;

import ru.piaksheva.stateapp.model.entity.Citizen;
import ru.piaksheva.stateapp.model.entity.State;

public class CitizenGenerator {
    int lastId = 0;

    public Citizen generateCitizen() {
        int id = lastId + 1;
        lastId = id;
        String name = generateString();
        String surname = generateString();
        int age = (int) (Math.random() * 100);
        Citizen citizen = new Citizen(id, name, surname, age, State.getInstance());
        return citizen;
    }

    public String generateString() {
        int length = 5 + ((int) (Math.random() * 100)) % 6;
        String result = "";
        for (int i = 0; i < length; i++) {
            char ch = (char) ('a' + (int) (Math.random() * 100) % ('z' - 'a' + 1));
            result = result + ch;
        }
        return result;
    }
}
