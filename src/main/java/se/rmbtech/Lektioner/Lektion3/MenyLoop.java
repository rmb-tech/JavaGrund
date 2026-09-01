package se.rmbtech.Lektioner.Lektion3;

import java.util.Random;
import java.util.Scanner;

public class MenyLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean running = true;
        int choice;
        String name;

        while (running){
            System.out.println("==== Meny ====");
            System.out.println("1. Hälsa");
            System.out.println("2. Räkna BMI");
            System.out.println("3. Slumpa tal");
            System.out.println("4. Avsluta");
            System.out.print("Välj: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Ogiltigt val. Försök igen.");
                scanner.nextLine();
                choice = -1;
            }

            switch (choice) {
                case 1 ->  {
                    System.out.println("Vad heter du? ");
                    System.out.println("Hej " +scanner.nextLine() + "!");
                }
                case 2 -> {
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
                        System.out.println("====================================");
                    } else if (bmi < 25) {
                        System.out.println("Ditt BMI ligger inom spannet för normalvikt!");
                        System.out.println("====================================");
                    } else if (bmi < 30) {
                        System.out.println("Ditt BMI indikerar övervikt!");
                        System.out.println("====================================");
                    } else {
                        System.out.println("Ditt BMI indikerar Obesitas!");
                        System.out.println("====================================");
                    }
                }
                case 3 -> {
                    System.out.println("==============");
                    System.out.println("Här är ett slumpat tal: " + random.nextInt(100)+1);
                }
                case 4 -> {
                    System.out.println("Hej då!"); running=false;
                }
                default ->  System.out.println("Ogiltigt val. Försök igen.");
            }
            System.out.println(); // Tom rad för snyggare utskrift mellan varven
        }
        scanner.close();
    }
}