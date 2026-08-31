package se.rmbtech.Lektioner.Lektion3;

import java.util.Scanner;

public class BiggerThan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tal1;
        int tal2;
        int tal3;

        System.out.print("Tal 1: ");
        tal1 = scanner.nextInt();
        System.out.print("Tal 2: ");
        tal2 = scanner.nextInt();
        System.out.print("Tal 3: ");
        tal3 = scanner.nextInt();

        if(tal1 > tal2 && tal1 > tal3){
        System.out.println("Störst är " + tal1 + ".");
        }
        else if (tal2 > tal1 && tal2 > tal3){
            System.out.println("Störst är " + tal2 + ".");
        }
        else {
            System.out.println("Störst är " +tal3 + ".");
        }

        scanner.close();
    }
}
