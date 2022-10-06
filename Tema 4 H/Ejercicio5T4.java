import java.util.Scanner;
public class Ejercicio5T4 {

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca a: ");
        double a = s.nextDouble();
        System.out.print("Introduzca b: ");
        double b = s.nextDouble();
        System.out.print("Introduzca c: ");
        double c = s.nextDouble();
        System.out.println("X = " + ((c-b)/a));

    }
}
