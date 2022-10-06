import java.util.Scanner;
public class Ejercicio1T4 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Dime el día de la semana: ");
		String hora1 = " ";
		String dia;
		dia = s.next();
		switch (dia) {

            case "Lunes":
                hora1 = " Base de datos";
                break;

            case "Martes":
                hora1 = " Programacion";
                break;

            case "Miercoles":
                hora1 = " Programacion";

                break;
                
            case "Jueves":
                hora1 = " Entornos de desarrollo";
                break;
                
            case "Viernes":
                hora1 = " Base de datos";
                break;    
            default:
            
            }
            
            System.out.println("A primera hora tienes" + hora1);
        }
	}

