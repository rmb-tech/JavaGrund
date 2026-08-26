package se.rmbtech.Lektioner.Lektion2;

import java.util.Scanner;

public class Dricks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Notan: ");
        double nota = scanner.nextDouble();

        System.out.print("Dricks i procent: ");
        double dricksProcent = scanner.nextDouble();

        double dricksSumma = nota * (dricksProcent / 100.0);
        double attBetala = nota + dricksSumma;

        System.out.println("====================");
        System.out.printf("Dricks: %.2f kr%n", dricksSumma);
        System.out.printf("Att betala: %.2f kr%n", attBetala);

        scanner.close();
    }
}