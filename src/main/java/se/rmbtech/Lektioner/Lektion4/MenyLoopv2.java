package se.rmbtech.Lektioner.Lektion4;

import se.rmbtech.Lektioner.InputHelper;

import java.util.Random;
import java.util.Scanner;

public class MenyLoopv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean running = true;
        int choice;

        while (running) {
            showMenu();
            choice = InputHelper.readInt(scanner, "Välj: ", 1, 4);
            switch (choice) {
                case 1 -> greetings(scanner);

                case 2 -> bmiInput(scanner);
                case 3 -> randomNumberGenerator(random);
                case 4 -> {
                    System.out.println("Hej då!");
                    running = false;
                }
                default -> System.out.println("Ogiltigt val. Försök igen.");
            }
            System.out.println();
        }
        scanner.close();
    }

    private static void showMenu() {
        System.out.println("==== Meny ====");
        System.out.println("1. Hälsa");
        System.out.println("2. Räkna BMI");
        System.out.println("3. Slumpa tal");
        System.out.println("4. Avsluta");
    }

    private static void greetings(Scanner scanner) {
        String name = InputHelper.readString(scanner,"Vad heter du? ");
        System.out.println("Hej " + name + "!");
    }

    private static void bmiInput(Scanner scanner) {
        String name = InputHelper.readString(scanner,"Vad är ditt namn? ");
        int kg = InputHelper.readInt(scanner, "Vad är din vikt (kg) :");
        int cm = InputHelper.readInt(scanner, "Vad är din längd (cm) :");
        double bmi = calcBmi(kg, cm);
        String kategori = getBMICategory(bmi);
        printResults(name, bmi, kategori);
    }

    private static double calcBmi(int kg, int cm) {
        double langdM = cm / 100.0;
        return kg / (langdM * langdM);
    }

    private static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "undervikt";
        } else if (bmi < 25) {
            return "normalvikt";
        } else if (bmi < 30) {
            return "övervikt";
        } else {
            return "obesitas";
        }
    }

    private static void printResults(String name, double bmi, String kategori) {
        System.out.println("====================================");
        System.out.printf("Hej %s, ditt BMI är %.1f %n", name, bmi);
        System.out.println("Hälsosamt BMI är mellan 18.5 och 25");
        System.out.println("Ditt BMI indikerar " + kategori + "!");
        System.out.println("====================================");
    }

    private static void randomNumberGenerator(Random random) {
        System.out.println("==============");
        System.out.println("Här är ett slumpat tal: " + (random.nextInt(100) + 1));
    }
}
