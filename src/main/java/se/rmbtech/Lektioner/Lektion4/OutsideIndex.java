package se.rmbtech.Lektioner.Lektion4;

import java.util.Scanner;

public class OutsideIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Vilket index ? ");
        int index = scanner.nextInt();

        try {
            int value = numbers[index];
            System.out.println("Värdet är: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Det finns inget värde på index " + index + ".");
        }

    }
}
