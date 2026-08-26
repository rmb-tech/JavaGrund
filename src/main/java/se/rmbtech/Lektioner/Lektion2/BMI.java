package se.rmbtech.Lektioner.Lektion2;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        // Formel BMI = vikt / (längd_meter)2

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vad är ditt namn: ");
        String name = scanner.nextLine();
        System.out.println(name);

        System.out.print("Vad är din vikt (kg) :");
        int kg = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Vad är din längd (cm) :");
        int cm = scanner.nextInt();

        System.out.println(name + kg + cm);

        scanner.close();

    }
}
