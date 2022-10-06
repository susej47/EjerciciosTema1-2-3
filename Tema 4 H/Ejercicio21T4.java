import java.util.Scanner;
public class Ejercicio21T4 {
	
	public static void main (String[] args) {
	     Scanner s = new Scanner(System.in);
         System.out.print("Dime la nota del examen 1 = ");
		 double nota1 = s.nextDouble();
         System.out.print("Dime la nota del examen 2 = ");
		 double nota2 = s.nextDouble();
         double medianota = (nota1 + nota2)/2;
         

         
         if (medianota >= 5){
			System.out.println("El alumno esta aprobado y su nota es " + medianota);
			}
		
		if (medianota < 5 && medianota > -1){
			System.out.println("El alumno ha ido a recuperación ");
		    System.out.print("Introduzca apto/noapto: ");
		    String recuperacion = s.next();
	        switch (recuperacion) {
			
			case "apto":
			System.out.println("El alumno esta aprobado y su nota es un 5");
			break;
			case "noapto":
			System.out.println("El alumno no esta aprobado y su nota es " + (medianota));
			break;
			
			default:
			System.out.println("Error, inválido.");
			break;
		  }

     	}	
         
         
     }
}
