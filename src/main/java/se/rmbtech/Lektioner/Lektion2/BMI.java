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

        System.out.println("====================================");
        System.out.printf("Hej %s, ditt BMI är %.2f %n", name, bmi);
        System.out.println("Hälsosamt BMI är mellan 18.5 och 25");

        // Undervikt, normalvikt, övervikt
        if (bmi < 18.5) {
            System.out.println("Ditt BMI indikerar undervikt!");
        } else if (bmi < 25) {
            System.out.println("Ditt BMI ligger inom spannet för normalvikt!");
        } else if (bmi < 30) {
            System.out.println("Ditt BMI indikerar övervikt!");
        } else {
            System.out.println("Ditt BMI indikerar Obesitas!");
        }

        scanner.close();

    }
}
