package se.rmbtech.Lektioner.Lektion3;


import java.util.Random;
import java.util.Scanner;

public class Talgissning {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min , max + 1);

        System.out.printf("Jag tänker på ett tal mellan %d och %d. Gissa!%n", min, max);

        do{
            System.out.print("Din gissning: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber){
                System.out.println("För lågt!");
            }
            else if (guess > randomNumber){
                System.out.println("För högt!");
            }
            else {
                System.out.println("Rätt! Du klarade det på " + attempts + " gissningar." );
            }
        }while(guess != randomNumber);

        scanner.close();
    }
}
