package se.rmbtech.Lektioner.Lektion4;

import se.rmbtech.Lektioner.InputHelper;

import java.util.Scanner;

public class FlexibleRounder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Avrundningsverktyg ===");
        double inputTal = InputHelper.readDouble(scanner, "Skriv ett decimaltal att avrunda: ");

        System.out.printf("%n=== Resultat ===%n");
        System.out.println("round heltal(" + inputTal + ") -> " + rounder(inputTal));
        System.out.println("round upp till 2 decimaler(" + inputTal + ") -> " + rounder(inputTal, 2));
        scanner.close();
    }

    private static int rounder(double value) {
        return (int) Math.round(value);

    }
    private static double rounder(double value, int decimals) {
        double decimalFactor = Math.pow(10, decimals);
        return Math.round(value * decimalFactor) / decimalFactor;
    }
}
