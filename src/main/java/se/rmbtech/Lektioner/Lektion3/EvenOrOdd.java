package se.rmbtech.Lektioner.Lektion3;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tal;

        System.out.print("Ange ett heltal: ");
        tal = scanner.nextInt();
        if (tal % 2 == 0 ){
            System.out.println(tal + " är jämnt");
        }
        else System.out.println(tal + " är udda");

        scanner.close();
    }
}
