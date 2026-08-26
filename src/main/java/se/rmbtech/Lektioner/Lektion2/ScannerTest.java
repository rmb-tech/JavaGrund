package se.rmbtech.Lektioner.Lektion2;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Vad heter du ?: ");
        String name = scanner.nextLine();
        System.out.println("Hej " + name + "!");
        scanner.close();

    }
}
