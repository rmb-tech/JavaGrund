package se.rmbtech.Lektioner.Lektion3;

import java.util.Scanner;

public class CountingUp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange N (heltal): ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++){
            System.out.println(i);
        }
    }
}
