import java.util.Scanner;
public class Ejercicio13T3 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca la nota del primer examen: ");
		double nota1Examen = s.nextDouble();
		
		System.out.println("¿Qué nota quieres en el trimestre?: ");
		double nota1Trimestre = s.nextDouble();
		
		System.out.println("Para tener un " + nota1Trimestre + " en el trimestre necesitas sacar un " + (((nota1Trimestre)-(nota1Examen*0.4))/0.6) + " en el segundo examen");

		
	}
}
