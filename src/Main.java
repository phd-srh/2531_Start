import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Bitte eine Zahl eingeben: ");
        int zahl = eingabe.nextInt();

        // so sieht eine while-Schleife zum Zählen aus
//        int teiler = 2;
//        while ( teiler <= zahl-1 ) {
//            // was auch immer hier passiert
//            System.out.println(teiler);
//
//            teiler = teiler + 1;
//        }

        // AUFGABE: Schleife bauen, das die Zahlen 1 bis 10 ausgibt
//        for ( int i = 1 ; i <= 10 ; i++ ) {
//            System.out.println(i);
//        }

        // AUFGABE: Schleife bauen, das die Zahlen 7 bis 3 ausgibt (absteigend)
//        for ( int i = 7 ; i >= 3 ; i-- ) {
//            System.out.println(i);
//        }

        // AUFGABE: Schleife bauen, das die geraden Zahlen von -5 bis 5 ausgibt
//        for ( int i = -4 ; i <= 4 ; i += 2 ) {
//            System.out.println(i);
//        }

        // AUFGABE: Schleife bauen, das die 7er Reihe von 7 bis 70 ausgibt
//        for ( int i = 1 ; i <= 10 ; ++i ) {
//            System.out.println( i*7 );
//        }


        // Zählschleife mit merkwürdiger Syntax
//        for ( int teiler = 2 ; teiler <= zahl-1 ; teiler = teiler + 1 ) {
//            System.out.println(teiler);
//        }


        System.out.println(zahl + " ist eine Primzahl");
        System.out.println(zahl + " ist KEINE Primzahl");
    }
}
