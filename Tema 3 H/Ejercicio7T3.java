import java.util.Scanner;
public class Ejercicio7T3 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca la base imponible: ");
		int baseImponible = s.nextInt();
		
		System.out.println("Base imponible " + baseImponible);
		System.out.println("IVA " + (baseImponible * 0.21));
		System.out.println("-------------------------------");
		System.out.println("Total " + (baseImponible * 1.21));
		
	}
}
