package se.rmbtech.Lektioner.Lektion3;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Välj dag (1-7): ");
        int day = scanner.nextInt();

        String name = switch (day){
            case 1 -> name = "Måndag";
            case 2 -> name = "Tisdag";
            case 3 -> name = "Onsdag";
            case 4 -> name = "Torsdag";
            case 5 -> name = "Fredag";
            case 6 -> name = "Lördag!";
            case 7 -> name = "Söndag!";
            default -> null;
        };
        String typAvDag = switch (day){
            case 1, 2, 3, 4, 5 ->  "Vardag";
            case 6, 7 ->  "Helg!!";
            default -> null;
        };

        if (name != null) {
            System.out.println("Veckodag: " + name + " Det är en: " + typAvDag);
        } else {
            System.out.println("Va ?!? Okänd dag");
        }
        scanner.close();
    }
}
