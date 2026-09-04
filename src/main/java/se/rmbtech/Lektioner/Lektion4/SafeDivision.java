package se.rmbtech.Lektioner.Lektion4;

import se.rmbtech.Lektioner.InputHelper;

import java.util.Scanner;

public class SafeDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Säker Division ===");

        String taljareStr = InputHelper.readString(scanner, "Täljare: ");
        String namnareStr = InputHelper.readString(scanner, "Nämnare: ");

        try {
            int taljare = Integer.parseInt(taljareStr);

            try {
                int namnare = Integer.parseInt(namnareStr);

                if (namnare == 0){
                    System.out.println("Kan inte dela med noll");
                }else {
                    int result = taljare / namnare ;
                    System.out.println(taljare + " / " + namnare + " = "+ result);
                }
            }catch (NumberFormatException e){
                System.out.printf("\"%s\" är inget tal.%n", namnareStr);
            }
        }catch (NumberFormatException e){
            System.out.printf("\"%s\" är inget tal.%n", taljareStr);
        }

        scanner.close();

    }
}
