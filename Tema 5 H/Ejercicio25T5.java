
import java.util.Scanner;
public class Ejercicio25T5 {
    
    public static void main (String[] args){

    
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número: ");

        int x = s.nextInt();
        int rev = 0;

        while (x > 0) {
            rev = (rev * 10) + (x % 10);
            x /= 10;
          }

        System.out.println("El número al revés es " + rev);

    }

}
