import java.util.Scanner;
public class Ejercicio10T5 {

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca todos los números de los que quiera hacer la media. Cuando termine, inserte un número negativo: ");

        int x = 0;
        int total = 0;
        int i = 0;
        do{
            x =  s.nextInt();
            total += x;
            i++;
        }while(x >= 0);

        total-= x;
        System.out.println("La media de todos los números es " + total/(i-1));
    }


}
