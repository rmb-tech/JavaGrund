package se.rmbtech.Lektioner.Lektion3;

import java.util.Scanner;

public class PositivtNegorZero  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tal;

        System.out.print("Ange ett tal: ");
        tal = scanner.nextInt();
        if (tal == 0 ){
            System.out.println("Noll");
        }
        else if (tal > 0) {
            System.out.println("Positivt");
        }
        else{
            System.out.println("Negativt");
        }
        scanner.close();
    }
}