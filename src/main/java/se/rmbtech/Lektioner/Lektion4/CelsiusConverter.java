package se.rmbtech.Lektioner.Lektion4;

import se.rmbtech.Lektioner.InputHelper;

import java.util.Scanner;

public class CelsiusConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius = InputHelper.readDouble(scanner , "Grader Celsius: ");
        double fahrenheit = convertToFahrenheit(celsius);
        printResult(celsius, fahrenheit);

        scanner.close();
    }

    private static double convertToFahrenheit(double celsius) {
        return celsius * 9.0/5.0 + 32;
    }

    private static void printResult(double celsius, double fahrenheit) {
        System.out.printf("%.1f grC = %.1f grF%n", celsius, fahrenheit);
    }
}
