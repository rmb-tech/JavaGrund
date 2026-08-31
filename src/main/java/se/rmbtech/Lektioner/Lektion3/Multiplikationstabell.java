package se.rmbtech.Lektioner.Lektion3;

import java.util.Scanner;

public class Multiplikationstabell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange ett tal: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(number + "x" + i + " = " + (number * i));
        }
        scanner.close();
    }
}
