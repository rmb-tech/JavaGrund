package se.rmbtech.Lektioner.Lektion3;

public class Nedräkning {
    public static void main(String[] args) {
        for (int i = 10; i > 1; i--){
            System.out.println(i);
            //Vänta, för nedräkningseffekt
            int startTid = (int) System.currentTimeMillis();
            while ((int) System.currentTimeMillis() - startTid < 300) {
            }
        }
        System.out.println("Avfyrning!");
        // 1-5 tabellen
        for (int row = 1; row <= 5; row++){
            for (int col = 1; col <= 5; col++){
                System.out.print(row * col + "\t");
            }
            System.out.println();
        }
    }
}
