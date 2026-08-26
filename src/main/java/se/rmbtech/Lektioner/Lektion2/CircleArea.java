package se.rmbtech.Lektioner.Lektion2;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Radie: ");
        double radie = scanner.nextDouble();

        // Beräkna area: π * r^2
        double area = Math.PI * radie * radie;

        System.out.printf("Arean är %.2f%n", area);

        scanner.close();
    }
}