package se.rmbtech.Lektioner.Lektion4;

import java.util.Scanner;

public class TheCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange ett tal: ");
        int tal = scanner.nextInt();

        x2(tal);
        System.out.println("Utanför metoden: " + tal);
    }

    private static void x2(int tal) {
        tal = tal * 2;
        System.out.println("Inuti metoden: " + tal);
    }
}
