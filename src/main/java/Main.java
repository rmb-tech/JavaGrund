public class Main {
    public static void main(String[] args) {
        System.out.println("Programmering med Java, grund");


        //Notera radbrytning med \n ovan. Nedan bjussar jag på en gratis for-loop
        for (int i = 1; i <= 5; i++) {
            int countdownInt = 5 - i;
            System.out.println(countdownInt + 1);
            if (countdownInt == 0) {
                System.out.println("TAKEOFF!");
            }
        }
    }
}