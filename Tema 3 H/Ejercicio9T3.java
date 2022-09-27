import java.util.Scanner;
public class Ejercicio9T3 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca el radio y la altura: ");
		double x1 = s.nextInt();
		double x2 = s.nextInt();
		
		System.out.println("El volumen del cono es " + ((0.33)*(Math.PI)*(x1*x1)*(x2)));
		
			}
}
