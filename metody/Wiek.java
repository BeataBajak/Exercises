package pl.samouczekprogramisty.ćwiczenia.metody;

import java.time.LocalDate;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;

public class Wiek {


    public static void main(String[] args) {
        int Year = java.time.Year.now().getValue();
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj Twój rok urodznia");
        int rok_urodzenia=input.nextInt();
        int wiek = Year-rok_urodzenia; // rok_urodzenia;
        System.out.println("Masz " + wiek + " lat.");
    }
}
