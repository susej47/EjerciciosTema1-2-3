import java.util.Scanner;
public class Ejercicio15T4 {
	
	public static void main (String[] args) {
	    Scanner s = new Scanner(System.in);
		System.out.println ("¿Hacia donde apunta la punta de la piramide?");
        System.out.println ("a) Arriba");
        System.out.println ("b) Abajo");
        System.out.println ("c) Derecha");
        System.out.println ("d) Izquierda");
        String piramide = s.next();
        System.out.println ("Dime un caracter");
        String c = s.next();

        
        switch (piramide) {
			
			case "a":
			System.out.println("  "+c  );
		    System.out.println(" "+c+c+c );
			System.out.println(c+c+c+c+c);
			break;
			case "b":
			System.out.println(c+c+c+c+c);
			System.out.println(" "+c+c+c );
			System.out.println("  "+c  );
			break;
			case "c":
			System.out.println(c);
			System.out.println(c+c);
			System.out.println(c+c+c);
			System.out.println(c+c);
			System.out.println(c);
			break;
			case "d":
			System.out.println("  "+c);
			System.out.println(" "+c+c);
			System.out.println(c+c+c);
			System.out.println(" "+c+c);
			System.out.println("  "+c);
			break;
		}
		
	}
}

