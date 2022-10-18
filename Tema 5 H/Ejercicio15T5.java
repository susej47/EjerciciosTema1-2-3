import java.util.Scanner;
public class Ejercicio15T5 {

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca una base: ");
        int b = s.nextInt();
        System.out.println("Introduzca un exponente (entero positivo): ");
        int etotal = s.nextInt();
        int i = 0;
        int res = 0;
        res = b;
        int e = 1;
        do{
            
            i++;
            System.out.println(b + "^" + e + " = " + res);
            res = (res*b);
            e++;
        }while(i <= (etotal-1));	
        
	}

}
