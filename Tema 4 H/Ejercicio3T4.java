import java.util.Scanner;
public class Ejercicio3T4 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Dime un numero del 1 al 7: ");
		int numero = s.nextInt();
		String diasemana = " ";
		switch (numero) {

            case 1:
                diasemana = "Lunes";
                break;

            case 2:
                diasemana = "Martes";
                break;

            case 3:
                diasemana = "Miercoles";

                break;
                
            case 4:
                diasemana = "Jueves";
                break;
                
            case 5:
                diasemana = "Viernes";
                break;    
                                
            case 6:
                diasemana = "Sabado";
                break;    
                                
            case 7:
                diasemana = "Domingo";
                break;    
            default:
            
            }
            
            System.out.println(diasemana);
        }
	}
