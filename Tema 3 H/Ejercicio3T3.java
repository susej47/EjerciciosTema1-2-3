import java.util.Scanner;
public class Ejercicio3T3 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca pesetas ");
		int pesetas = s.nextInt();
		
		System.out.println("La conversión de pesetas a euros es " + (pesetas/166.03));
		
			}
}
