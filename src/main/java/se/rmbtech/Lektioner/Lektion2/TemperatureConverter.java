package se.rmbtech.Lektioner.Lektion2;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange temperatur i Celsius: ");

        double celsius = scanner.nextDouble();
        // Formel F = C * 9/5 + 32
        // Formel K = + 273.15
        double farenheight = celsius * 9 / 5.0 + 32;

        System.out.printf("%.1f°C är %.1f°F%n och %.k", celsius, farenheight );
        scanner.close();

    }
}