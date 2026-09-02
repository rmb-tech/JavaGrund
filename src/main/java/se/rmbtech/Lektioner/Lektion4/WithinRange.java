package se.rmbtech.Lektioner.Lektion4;

import java.util.Scanner;

import static se.rmbtech.Lektioner.InputHelper.readIntBetween;

public class WithinRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int age = checkAge(scanner);
        //System.out.printf("Du angav %d%n " , age);

        int grade = readIntBetween (scanner, "Betyg (1-5): ", 1 , 5);
        System.out.printf("Tack, du gav betyget %s.%n", grade );
    }

    /*private static int checkAge(Scanner scanner) {
        while (true){
            System.out.print("Hur gammal är du ? ");
            try {
                int number = scanner.nextInt();
                scanner.nextLine();
                return number;
            } catch (InputMismatchException e){
                System.out.println("Ogiltig input . Skriv ett heltal");
                scanner.nextLine();
            }
        }
    }*/
}
