import java.util.Scanner;
public class Ejercicio14T4 {
	
	public static void main (String[] args) {
	     Scanner s = new Scanner(System.in);
	     System.out.print("Introduzca un número: ");
         int numero = s.nextInt();
         
        if(numero%2 != 0){
			System.out.println("Es impar");
			}
		if(numero%5 != 0){
			System.out.println("Es indivible entre 5");
			}
		if(numero%2 == 0){
			System.out.println("Es par");
			}
	    if(numero%5 == 0){
			System.out.println("Es divisible entre 5");				 
		}
	}
}

