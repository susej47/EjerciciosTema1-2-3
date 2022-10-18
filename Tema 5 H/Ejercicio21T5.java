import java.util.Scanner;
public class Ejercicio21T5 {
    public static void main (String[] args){
		
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca tantos números como desee, se parará al insertar un número negativo.");

        int neg = 0;
        int i = 0;
        int impar = 0;
        int imparsum= 0;
        int hipar = 0;
        while(neg >=0){
            i++;
            System.out.println("Número "+ i);
            neg = s.nextInt();
            if (neg%2 != 0){
                imparsum+=neg;
                impar++;
            }
            if(neg > hipar){
                hipar = neg;
            }


        }
        System.out.println("Se han introducido "+ (i-1) + " números.");
        System.out.println("La media de los impares es de "+ ((double)(imparsum/impar)));
        System.out.println("El número par más grande fue "+ hipar);
    }
}
