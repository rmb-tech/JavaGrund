package se.rmbtech.Lektioner.Lektion4;

import java.util.Scanner;

public class TextToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange ett tal: ");
        String userInput = scanner.next();

        testText(userInput);

        scanner.close();
    }

    private static void testText(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.printf("\"%s\" -> Talet är %d%n", text, number);
        } catch (NumberFormatException e) {
            System.out.printf("\"%s\" -> Det där var inget tal.%n", text);
        }
    }
}
