package se.rmbtech.Lektioner.Lektion3;

public class Booleska {
    public static void main(String[] args) {
        int age = 15;
        boolean hasLicense = true;

        if (age >= 18 && hasLicense){
            System.out.println("Du får köra bil");
        }
        if (age < 13 || age > 65){
            System.out.println("Du får rabatt");
        }
        if (!hasLicense){
            System.out.println("Du måste ta körkort");
        }

        //String status = (age >= 18 ) ? "vuxen" : "minderårig";
        //System.out.println(status);
    }


}
