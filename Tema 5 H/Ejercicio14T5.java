import java.util.Scanner;
public class Ejercicio14T5 {


    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca una base: ");
        double b = s.nextDouble();
        System.out.println("Introduzca un exponente (entero positivo): ");
        int e = s.nextInt();
        int i = 0;
        double res = 0;
        res = b;
        do{
            res = (res*b);
            i++;
        }while(i <= (e-2));	
        
        System.out.println("El resultado es " + res);
	}

}
