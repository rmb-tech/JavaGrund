package se.rmbtech.Lektioner.Lektion2;

import java.util.Scanner;

public class Räknare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Räknare");
        System.out.println("========");

        System.out.print("Tal 1: ");
        int a = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("Tal 2: ");
        int b = scanner.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double kvot = (double) a / b;
        int rest = a % b;
        System.out.println("========");
        System.out.printf("Summan av dina tal är: %d. Differensen är: %d. Produkten är %d. Kvoten är %.2f. Resten är %d", sum, difference, product, kvot, rest);

        scanner.close();
    }
}
