package se.rmbtech.Lektioner.Lektion3;

import java.util.Scanner;

public class Medel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfNumbers = 0;
        double number;
        double summa = 0.0;

        System.out.print("Tal (0 avslutar):");
        number = scanner.nextDouble();

        while(number !=0){
            numOfNumbers++;
            summa += number;

            System.out.print("Tal (0 avslutar):");
            number = scanner.nextDouble();

        }
        if (numOfNumbers > 0){
            double medelvarde = summa / numOfNumbers;
            System.out.printf("Du matade in %d tal. Medelvärdet är %.2f", numOfNumbers, medelvarde);
        }
        else {
        System.out.println("Inga tal matades in.");
        }
        scanner.close();
    }
}
