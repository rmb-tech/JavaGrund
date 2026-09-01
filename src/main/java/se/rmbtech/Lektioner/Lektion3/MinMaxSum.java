package se.rmbtech.Lektioner.Lektion3;

import java.util.Scanner;

public class MinMaxSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfNumbers = 0;
        double number;
        double summa = 0.0;
        double min = 0;
        double max = 0;

        System.out.print("Tal (0 avslutar):");
        number = scanner.nextDouble();

        if (number != 0) {
            min = number;
            max = number;
        }

        while(number !=0){
            numOfNumbers++;
            summa += number;

            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }

            System.out.print("Tal (0 avslutar):");
            number = scanner.nextDouble();

        }
        if (numOfNumbers > 0){
            System.out.println("Minst: " + min);
            System.out.println("Störst: " + max);
            System.out.println("Summa: " +  summa);
        }
        else {
            System.out.println("Inga tal matades in.");
        }
        scanner.close();
    }
}
