import java.util.Scanner;
public class Ejercicio18T4 {
	
	public static void main (String[] args) {
	     Scanner s = new Scanner(System.in);
	     System.out.print("Introduzca un número de hasta 5 cifras: ");
         int numero = s.nextInt();
         
         if(numero > 9999 && numero <= 99999){
			System.out.println(numero/10000);
			}
	     if(numero > 999 && numero <= 9999){
			System.out.println(numero/1000);
			}
	     if(numero > 99 && numero <= 999){
			System.out.println(numero/100);
			}
		 if(numero > 9 && numero <= 99){
			System.out.println(numero/10);
			}
		if(numero > 0 && numero <= 9){
			System.out.println(numero);
			}	

     }
}
