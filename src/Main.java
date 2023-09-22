import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Hallo, wer bist du: ");
        String name = eingabe.nextLine();
        System.out.println("Hallo, " + name);
    }
}
