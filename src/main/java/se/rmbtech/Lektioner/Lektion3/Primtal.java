package se.rmbtech.Lektioner.Lektion3;

import java.util.Scanner;

public class Primtal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange ett heltal: ");
        int primtal = scanner.nextInt();
        boolean isPrimtal = true;

        if (primtal <= 1) {
            isPrimtal = false;
        }
        else {
            for (int i = 2; i * i <= primtal; i++){
                if (primtal % i == 0){
                    isPrimtal = false;
                    break;
                }
            }
        }
        if (isPrimtal) {
            System.out.println(primtal + " är ett primtal.");
        } else {
            System.out.println(primtal + " är inte ett primtal.");
        }
        scanner.close();
    }
}
