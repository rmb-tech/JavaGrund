package se.rmbtech.Lektioner.Lektion3;

import java.util.Scanner;

public class Betyg {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange poäng: ");
        int score = scanner.nextInt();

        if (score >= 90){
            System.out.println("Betyg: A");
        }
        else if(score >= 75){
            System.out.println("Betyg: B");
        }
        else if (score >= 60){
            System.out.println("Betyg: C");
        }
        else if (score >= 50){
            System.out.println("Betyg: D");
        }
        else {
            System.out.println("Betyg: F");
        }
        scanner.close();
    }
}
