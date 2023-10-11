import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Bitte eine Zahl eingeben: ");
        int zahl = eingabe.nextInt();

        int teiler = 2;
        while ( teiler <= zahl-1 ) {
            // was auch immer hier passiert
            System.out.println(teiler);

            teiler = teiler + 1;
        }


        System.out.println(zahl + " ist eine Primzahl");
        System.out.println(zahl + " ist KEINE Primzahl");
    }
}
