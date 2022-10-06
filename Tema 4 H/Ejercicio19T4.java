import java.util.Scanner;
public class Ejercicio19T4 {
	
	public static void main (String[] args) {
	     Scanner s = new Scanner(System.in);
	     System.out.print("Introduzca un número de hasta 5 cifras: ");
         int numero = s.nextInt();
         
         if(numero > 9999 && numero <= 99999){
			System.out.println("El numero tiene 5 digitos");
			}
	     if(numero > 999 && numero <= 9999){
			System.out.println("El numero tiene 4 digitos");
			}
	     if(numero > 99 && numero <= 999){
			System.out.println("El numero tiene 3 digitos");
			}
		 if(numero > 9 && numero <= 99){
		    System.out.println("El numero tiene 2 digitos");
			}
		if(numero > 0 && numero <= 9){
			System.out.println("El numero tiene 1 digitos");
			}	
		if(numero >= (-99999) && numero < (-9999)){
			System.out.println("El numero tiene 5 digitos");
			}
		if(numero >= (-9999) && numero < (-999)){
			System.out.println("El numero tiene 4 digitos");
			}
		if(numero >= (-999) && numero < (-99)){
			System.out.println("El numero tiene 3 digitos");
			}			
		if(numero >= (-99) && numero < (-9)){
			System.out.println("El numero tiene 2 digitos");
			}
		if(numero >= (-9) && numero < 0){
			System.out.println("El numero tiene 1 digitos");
			}		
			
			
     }
}
