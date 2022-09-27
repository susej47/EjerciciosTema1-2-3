import java.util.Scanner;
public class Ejercicio11T3 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca Kb: ");
		double Kb = s.nextDouble();
		
		System.out.println((Kb / 1000) + " Mb");
	}
}

