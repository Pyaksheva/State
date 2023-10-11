package ru.piaksheva.stateapp.model.service;

import ru.piaksheva.stateapp.view.ResultWriter;

import java.util.Scanner;

public class Menu {
    ResultWriter writer = new ResultWriter();

    public void start() {
        printMenu();
        StateEventService stateEventService = new StateEventService();
        Scanner inputInt = new Scanner(System.in);
        while (true) {
            int option = inputInt.nextInt();
            if (option == 1) {
                stateEventService.printCapital();
            } else if (option == 2) {
                stateEventService.countRegions();
            } else if (option == 3) {
                stateEventService.squareState();
            } else if (option == 4) {
                stateEventService.printRegionCentre();
            } else if (option == 5) {
                stateEventService.printAverageAge();
            } else if (option == 6) {
                writer.printResult("Введите нужное число букв, из которых состоит имя жителя");
                int n = inputInt.nextInt();
                stateEventService.nLetters(n);
            } else if (option == 7) {
                writer.printResult("Введите английскую букву, чтобы узнать, у скольких людей имя начинается с этой буквы");
                String m = inputInt.next();
                stateEventService.mLetters(m);
            }
            printMenu();
        }
    }

    public void printMenu() {
        writer.printResult("Нажмите на клавиатуре 1, чтобы вывести столицу");
        writer.printResult("Нажмите на клавиатуре 2, чтобы вывести количество областей");
        writer.printResult("Нажмите на клавиатуре 3, чтобы вывести площадь государства");
        writer.printResult("Нажмите на клавиатуре 4, чтобы вывести областные центры");
        writer.printResult("Нажмите на клавиатуре 5, чтобы вывести средний возраст жителей");
        writer.printResult("Нажмите на клавиатуре 6, чтобы вывести жителей, у которых имя состоит из n букв");
        writer.printResult("Нажмите на клавиатуре 7, чтобы вывести список жителей, у которых имя начинается с m");
    }
}
