package se.rmbtech.Lektioner.Lektion2;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;
        int kg;
        int cm;
        double bmi;

        System.out.print("Vad är ditt namn: ");
        name = scanner.nextLine();

        System.out.print("Vad är din vikt (kg) :");
        kg = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Vad är din längd (cm) :");
        cm = scanner.nextInt();
        scanner.nextLine();

        double langdM = cm / 100.0;
        bmi = kg / (langdM * langdM);

        System.out.printf("Hej %s, ditt BMI är %.2f %n", name, bmi);
        scanner.close();

    }
}
