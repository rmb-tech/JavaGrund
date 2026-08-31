package se.rmbtech.Lektioner.Lektion3;

import java.util.Scanner;

public class Mydighet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.print("Ange din ålder: ");
        age = scanner.nextInt();
        //System.out.println(age);
        if (age >=18){
            System.out.println("Du är myndig");
        }
        else System.out.println("Du är inte myndig");

        scanner.close();
    }
}
