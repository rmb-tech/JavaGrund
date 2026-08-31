package se.rmbtech.Lektioner.Lektion3;

import java.util.Scanner;

public class Loopar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Testar vilkor först
        int count = 0;
        while (count < 3){
            System.out.println("Hej " + count);
            count++;
        }
        // Minst ett varv
        int input;
        do {
            System.out.print("Skriv ett positivt tal: ");
            input = scanner.nextInt();
            System.out.println("Du skrev: " + input);
        }while (input <= 0);
        // Vet antalet varb
        for (int i = 0; i < 5; i++){
            System.out.println("Varv " + i);
        }
        // Har en samling (array) , bryr dig om värdet.
        String [] names = {"Anna", "Bo", "Cecilia"};
        for (String name : names){
            System.out.println("Hej " + name);
        }
        scanner.close();
    }
}
