import java.util.Scanner;
public class Ejercicio20T4 {
	
	public static void main (String[] args) {
	     Scanner s = new Scanner(System.in);
	     System.out.print("Introduzca un número de hasta 5 cifras: ");
         int numero = s.nextInt();
         boolean escapicua=false;
         
         if (numero>0){
         
         if(numero > 9999 && numero <= 99999){
			 if((numero/1000)%10 == (numero/10)%10 && numero%10 == numero/10000)
				escapicua=true;
			}
	     else if(numero > 999 && numero <= 9999){
			 if((numero/100)%10 == (numero/10)%10 && numero%10 == numero/1000)
				escapicua=true;
			}
	     else if(numero > 99 && numero <= 999){
			 if(numero%10 == numero/100)
				escapicua=true;
			}
		 else if(numero > 9 && numero <= 99){
			 if(numero%10 == numero/10)
				escapicua=true;
			}
		 else {
		    escapicua=true;
		 }
		 		if (escapicua)
			System.out.println("El numero es capicua");
		else
			System.out.println("El numero no es capicua");
			
		}
		 else 	
			System.out.println("Error");
			

		
	}		
}

