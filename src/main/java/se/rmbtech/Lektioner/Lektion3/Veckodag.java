package se.rmbtech.Lektioner.Lektion3;

import java.util.Scanner;

public class Veckodag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Välj dag (1-7): ");
        int day = scanner.nextInt();

        String name = switch (day){
            case 1 -> "Måndag";
            case 2 -> "Tisdag";
            case 3 -> "Onsdag";
            case 4 -> "Torsdag";
            case 5 -> "Fredag";
            case 6 -> "Lördag!";
            case 7 -> "Söndag!";
            default -> null;
        };
        String typAvDag = switch (day){
            case 1, 2, 3, 4, 5 ->  "Vardag";
            case 6, 7 ->  "Helg!!";
            default -> null;
        };

        if (name != null) {
            System.out.println("Veckodag: " + name + " och det är en " + typAvDag);
        } else {
            System.out.println("Va ?!? Okänd dag");
        }
        scanner.close();
    }
}
