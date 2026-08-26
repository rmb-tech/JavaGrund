package se.rmbtech.Lektioner.Lektion2;

public class Rabattberäkning {
    public static void main(String[] args) {
        double price = 199.0;
        int discountPercent = 20;
        double discount = price * discountPercent / 100.0;
        double finalPrice = price - discount;

        System.out.println("Du beltar: " +finalPrice + " kr");

    }
}
