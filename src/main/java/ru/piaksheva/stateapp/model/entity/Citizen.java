package ru.piaksheva.stateapp.model.entity;

public class Citizen {
    private final int id;
    private final String name;
    private final String surname;
    private final int age;
    private final State state;

    public Citizen(int id, String name, String surname, int age, State state) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
