package ru.piaksheva.stateapp.view;

import ru.piaksheva.stateapp.model.service.StateEventService;

import java.util.Scanner;

public class Menu {
    public static void start() {
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
                System.out.println("Введите нужное число букв, из которых состоит имя жителя");
                int n = inputInt.nextInt();
                stateEventService.nLetters(n);
            } else if (option == 7) {
                System.out.println("Введите английскую букву, чтобы узнать, у скольких людей имя начинается с этой буквы");
                String m = inputInt.next();
                stateEventService.mLetters(m);
            }
            printMenu();
        }
    }

    public static void printMenu() {
        System.out.println("Нажмите на клавиатуре 1, чтобы вывести столицу");
        System.out.println("Нажмите на клавиатуре 2, чтобы вывести количество областей");
        System.out.println("Нажмите на клавиатуре 3, чтобы вывести площадь государства");
        System.out.println("Нажмите на клавиатуре 4, чтобы вывести областные центры");
        System.out.println("Нажмите на клавиатуре 5, чтобы вывести средний возраст жителей");
        System.out.println("Нажмите на клавиатуре 6, чтобы вывести жителей, у которых имя состоит из n букв");
        System.out.println("Нажмите на клавиатуре 7, чтобы вывести список жителей, у которых имя начинается с m");
    }
}
