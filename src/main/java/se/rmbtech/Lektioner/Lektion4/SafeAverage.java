package se.rmbtech.Lektioner.Lektion4;

import se.rmbtech.Lektioner.InputHelper;

import java.util.Scanner;

public class SafeAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = InputHelper.readInt(scanner, "Hur många tal? ");

        int [] numbers = new int[count];

        for(int i = 0; i < count; i++){
            numbers[i] = InputHelper.readInt(scanner , "Tal + " + (i +  1) + ": ");
        }

        double medel = calcMedel(numbers);
        System.out.printf("Medelvärde: %.1f", medel);
        scanner.close();
    }

    private static double calcMedel(int[] numbers) {
        if (numbers.length == 0){
            return 0.0;
        }
        double sum = 0;
        for (int number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
}
