package se.rmbtech.Lektioner.Lektion2;

import java.util.Scanner;

public class Moms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Räkna ut moms");
        System.out.println("===============");
        System.out.print("Priset exkl. moms: ");
        double exmoms = scanner.nextDouble();

        double momsSumma = exmoms * 0.25;
        double inkmoms = exmoms * 1.25;

        System.out.printf("Moms (25%%): %.2f kr\n", momsSumma);
        System.out.printf("Totalt inkl. moms: %.2f kr\n", inkmoms);

        scanner.close();
    }
}
