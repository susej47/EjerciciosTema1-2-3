import java.util.Scanner;
public class Ejercicio13T4 {
	
	public static void main (String[] args) {
	     Scanner s = new Scanner(System.in);
	     System.out.print("Introduzca un número: ");
         int numero1 = s.nextInt();
         System.out.print("Introduzca otro número: ");
         int numero2 = s.nextInt();
         System.out.print("Introduzca otro número: ");
         int numero3 = s.nextInt();
         
        if (numero1 > numero2 && numero2 > numero3){
            System.out.println(numero1 + " > " + numero2 + ">" + numero3);
        }
        if (numero1 > numero2 && numero2 < numero3){
            System.out.println(numero1 + " > " + numero3 + ">" + numero2);
        }
        if (numero2 > numero3 && numero3 > numero1){
            System.out.println(numero2 + " > " + numero3 + ">" + numero1);
        }
        if (numero2 > numero1 && numero1 > numero3){
            System.out.println(numero2 + " > " + numero1 + ">" + numero3);   
        }
        if (numero3 > numero1 && numero1 > numero2){
            System.out.println(numero3 + " > " + numero1 + ">" + numero2);
        }
        if (numero3 > numero2 && numero2 > numero1){
            System.out.println(numero3 + " > " + numero2 + ">" + numero1);           		
	}
  }
}


