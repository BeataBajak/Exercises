package pl.samouczekprogramisty.interfejsy;

import java.util.Scanner;

public class Zadanie {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Zadanie main = new Zadanie();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication(); // zaimplementuj brakującą klasę
        } else {
            computation = new Addition(); // zaimplementuj brakującą klasę
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        System.out.println("Czy chcesz wykonać mnożenie? Jeśli tak, wciśnij T. W przeciwnym wypadku wykonam dodawanie.");
        return scanner.next().equals("T"); // tutaj zapytaj użytkownika co chce zrobić (mnożenie czy dodawanie)
    }

    private double getArgument() {
        System.out.println("Podaj liczbę: ");
        return scanner.nextDouble(); // tutaj pobierz liczbę od użytkownika
    }
}
