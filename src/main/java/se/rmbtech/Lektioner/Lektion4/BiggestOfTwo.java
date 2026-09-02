package se.rmbtech.Lektioner.Lektion4;

public class BiggestOfTwo {
    public static void main(String[] args) {

        int a = 3;
        int b = 7;

        double c = 2.5;
        double d = 1.9;

        int intResult = storst(a, b);
        double doubleResult = storst(c, d);

        System.out.printf("Störst av %d och %d: %d%n", a, b, intResult);
        System.out.printf("Störst av %.1f och %.1f: %.1f%n", c, d, doubleResult);
    }

    public static int storst(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static double storst(double a, double b) {
        if (a > b) {
            return a;
        }
        return b;
    }
}
