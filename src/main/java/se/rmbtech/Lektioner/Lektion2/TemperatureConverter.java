package se.rmbtech.Lektioner.Lektion2;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double temp;
        String unit;
        boolean felaktigEnhet = false;

        System.out.printf("%nAnge temperatur (i Celsius): ");
        temp = scanner.nextDouble();

        System.out.print("Konvertera till Celsius, Fahrenheit eller Kelvin (C, F eller K): ");
        unit = scanner.next().toUpperCase();
        while(true){
            switch(unit){
                case "C" -> System.out.printf("Temperatur: %.1f°C%n", temp);
                case "F" -> {
                    double fahrenheit = (temp * 9.0 / 5.0)+ 32;
                    System.out.printf("Temperatur: %.1f°F%n", fahrenheit);
                }
                case "K" ->{
                    double kelvin = temp + 273.15;
                    System.out.printf("Temperatur: %.1fK%n", kelvin);
                }
                default -> {
                    System.out.println("Felaktig enhet! Ange C, F eller K.");
                    felaktigEnhet = true;
                }
            }

            if (felaktigEnhet){
                continue;
            }
            break;
        }
        scanner.close();
    }
}