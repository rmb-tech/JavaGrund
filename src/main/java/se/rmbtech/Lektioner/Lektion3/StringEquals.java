package se.rmbtech.Lektioner.Lektion3;

import java.util.Scanner;

public class StringEquals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = "Hej";
        System.out.println("Skriv \"Hej\": ");
        String userinput = scanner.next();
        if(userinput.equalsIgnoreCase(a)){
            System.out.println("Du skrev jätterätt");
        }
        else System.out.println("Du skrev fel =( ");


        scanner.close();

    }
}
