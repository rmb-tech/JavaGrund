package se.rmbtech.Lektioner;

import java.util.Scanner;

public class InputHelper {

    public static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();

            if (input.trim().isEmpty()) {
                System.out.println("Ogiltig input. Skriv ett heltal");
                continue;
            }
            try {
                return Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("Ogiltig input. Skriv ett heltal");
            }
        }
    }

    public static int readIntBetween(Scanner scanner, String prompt, int min, int max) {
        while (true) {
            int value = readInt(scanner, prompt);
            if (value >= min && value <= max) {
                return value;
            }
            System.out.printf("Värdet måste vara mellan %d och %d.%n", min, max);
        }
    }

    public static double readDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();

            if (input.trim().isEmpty()) {
                System.out.println("Ogiltigt input. Skriv ett tal");
                continue;
            }
            try {
                return Double.parseDouble(input.trim().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Ogiltigt input. Skriv ett tal");
            }
        }
    }
    public static String readString(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Input får inte vara tom. Försök igen.");
        }
    }
}
