package se.rmbtech.Lektioner.Lektion2;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ditt namn: ");
        String name = scanner.nextLine();
        System.out.println("Hej " + name + " Kul att se dig");

    }
}
