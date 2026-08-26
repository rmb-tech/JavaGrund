package se.rmbtech.Lektioner.Lektion2;

import java.util.Scanner;

public class Decimaler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange ett decimaltal: ");
        double tal = scanner.nextDouble();

        int heltalsdel = (int) tal;

        System.out.println("Heltalsdelen är " + heltalsdel);

        scanner.close();
    }
}