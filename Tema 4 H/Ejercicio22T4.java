import java.util.Scanner;
public class Ejercicio22T4 {
	
	public static void main (String[] args) {
	     Scanner s = new Scanner(System.in);
	     System.out.print("Introduzca día de la semana: ");
		 String diasemana = s.next();
         int dia = 5;
         int hora = 0;
         int minuto = 0;
           switch (diasemana) {
			
			case "Lunes":
            dia = 1;
			break;
			case "Martes":
            dia = 2;
			break;
			case "Miercoles":
            dia = 3;
			break;
			case "Jueves":
            dia = 4;
			break;
			case "Viernes":
            dia = 5;
			break;
			
			default:
			System.out.println("Error, inválido.");
			break;
			
		  }
		  System.out.print("Introduzca hora:  ");
		  hora = s.nextInt();
		  System.out.print("Introduzca minuto: ");
		  minuto = s.nextInt();
		  
		  System.out.println("Quedan "+ (((5*24*60)+(15*60))  -  ((dia*24*60)+(hora*60)+(minuto*60))) + " minutos para el fin de semana.");
     }
}
