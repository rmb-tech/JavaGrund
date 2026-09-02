package se.rmbtech.Lektioner.Lektion4;

public class Greeting {
    public static void main(String[] args) {
        typeGreeting("Anna");
        typeGreeting("Bertil");
        typeGreeting("Cecilia");

    }
    public static void typeGreeting(String namn){
        System.out.println("Hej " + namn + "!");
    }
}
