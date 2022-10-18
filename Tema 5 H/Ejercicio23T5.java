import java.util.Scanner;
public class Ejercicio23T5 {
    public static void main (String[] args){


        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca números.");
        int sum = 0;
        int i = 0;
        int introd = 0;
        int sumtotal = 0;
        while(sumtotal < 10000){
            i++;
            introd = s.nextInt();
            sumtotal+=introd;
            if(sumtotal < 10000){
            sum+= introd;
            }
        }
        System.out.println("El total es " + sum);
        System.out.println("Se escribieron "+ (i-1) + " números.");
        System.out.println("La media es de " + (sum/i));

    }
}
