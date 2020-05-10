package pl.samouczekprogramisty.ćwiczenia.metody;

import java.time.Year;
import java.time.YearMonth;
import java.util.Date;
import java.util.Scanner;

public class Imię {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj swoje imię.");
        String imię = input.next();
        System.out.println("Masz na imię "+imię+".");
    }
}
