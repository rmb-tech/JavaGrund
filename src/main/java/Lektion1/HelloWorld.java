package Lektion1;

import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {

        String namn = "Rickard Malm";
        String today = LocalDate.now().toString();

        System.out.println("+----------------+");
        System.out.println("| Hej Världen 🌍 |");
        System.out.println("+----------------+");
        System.out.println("Mitt namn är " + namn);
        System.out.println("Dagens datum är " + today);
    }
}