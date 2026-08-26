package se.rmbtech.Lektioner.Lektion2;

import java.util.Scanner;

public class SekunderTillTid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Antal sekunder: ");
        int totalSekunder = scanner.nextInt();

        int timmar = totalSekunder / 3600;
        int restEfterTimmar = totalSekunder % 3600;
        int minuter = restEfterTimmar / 60;
        int sekunder = restEfterTimmar % 60;

        System.out.println(totalSekunder + " sekunder är " + timmar + " h " + minuter + " min " + sekunder + " s");

        scanner.close();
    }
}