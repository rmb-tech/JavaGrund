package se.rmbtech.Lektioner.Lektion2;

import java.util.Scanner;

public class BytaPlats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tal A: ");
        int a = scanner.nextInt();

        System.out.print("Tal B: ");
        int b = scanner.nextInt();

        System.out.println("Före byte: A=" + a + ", B=" + b);
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Efter byte: A=" + a + ", B=" + b);

        scanner.close();
    }
}