import java.util.Scanner;
public class Ejercicio7T4 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca las 3 notas: ");
		double x1 = s.nextDouble();
		double x2 = s.nextDouble();
		double x3 = s.nextDouble();
		
		System.out.println("La media es " + (x1+x2+x3)/3);
    
		
	}
}

