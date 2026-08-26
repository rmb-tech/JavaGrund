package se.rmbtech.Lektioner.Lektion2;

import java.util.Scanner;

public class SedlartillMynt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Belopp: ");
        int belopp = scanner.nextInt();

        int hundralappar = belopp / 100;
        int restEfterHundra = belopp % 100;

        int tiokronor = restEfterHundra / 10;
        int enkronor = belopp % 10;

        System.out.println(belopp + " kr = " + hundralappar + "st 100, " + tiokronor + "st 10, " + enkronor + "st 1");
        scanner.close();
    }
}