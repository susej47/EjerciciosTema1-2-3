import java.util.Scanner;
public class Ejercicio4T4 {

    public static void main (String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca las horas trabajadas: ");
        int h = s.nextInt();
        int he = 0;

        if(h >= 41){
            he = h-40;
            }

        System.out.println("Si el trabajador trabaja " + h + " horas, le corresponden " + ((h*12)+(he*16)) + "€ . "+ (he*16) + "€ son de horas extra.");

    }
}
