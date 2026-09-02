package se.rmbtech.Lektioner.Lektion4;

public class Area {
    public static void main(String[] args) {
        double area1 = calcArea(4, 3);
        double area2 = calcArea(5.5, 2.0);

        System.out.println("Area av 4 x 3: " + (int)area1);
        System.out.println("Area av 5.5 x 2.0: " + area2);
    }

    public static double calcArea(double width, double height) {
        return width * height;

    }
}
