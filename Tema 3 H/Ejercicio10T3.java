import java.util.Scanner;
public class Ejercicio10T3 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca Mb: ");
		double Mb = s.nextDouble();
		
		System.out.println((Mb * 1000) + " Kb");
	}
}

