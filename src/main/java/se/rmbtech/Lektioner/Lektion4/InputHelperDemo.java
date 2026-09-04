package se.rmbtech.Lektioner.Lektion4;

import se.rmbtech.Lektioner.InputHelper;

import java.util.Scanner;

public class InputHelperDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = InputHelper.readInt(scanner, "Ålder: ");
        int grade = InputHelper.readInt(scanner, "Betyg (1-5): ", 1, 5);
        double price = InputHelper.readDouble(scanner, "Pris: ");

        System.out.printf("Tack! (%d, %d, %.1f)%n", age, grade, price);

        scanner.close();
    }
}