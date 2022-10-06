import java.util.Scanner;
public class Ejercicio6T4 {
    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca la altura: ");
        double h = s.nextDouble();

        System.out.println("Tardará " + ((2*h)/9.81) + "s en caer.");
    }
}
