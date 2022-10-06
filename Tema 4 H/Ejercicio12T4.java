import java.util.Scanner;
public class Ejercicio12T4 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int resultado = 0;
        System.out.println ("¿Cómo se dice ordenador en inglés?");
        System.out.println ("a) Computer");
        System.out.println ("b) PC");
        System.out.println ("c) a y b son correctas");
        String pregunta1 = s.next();
        System.out.println ("¿Cómo se dice teclado en inglés?");
        System.out.println ("a) Keyboard");
        System.out.println ("b) Mouse");
        System.out.println ("c) Table");
        String pregunta2 = s.next();
        System.out.println ("¿Cómo se dice raton en inglés?");
        System.out.println ("a) Keyboard");
        System.out.println ("b) Mouse");
        System.out.println ("c) Table"); 
        String pregunta3 = s.next();
        System.out.println ("¿Cómo se dice ventana en inglés?");
        System.out.println ("a) Screen");
        System.out.println ("b) Tower");
        System.out.println ("c) Window"); 
        String pregunta4 = s.next();
        System.out.println ("¿Cómo se dice escritorio en inglés?");
        System.out.println ("a) Keyboard");
        System.out.println ("b) Table");
        System.out.println ("c) Deskstop"); 
        String pregunta5 = s.next();
        System.out.println ("¿Cómo se dice programador en inglés?");
        System.out.println ("a) Web developer");
        System.out.println ("b) Teacher");
        System.out.println ("c) Programmer"); 
        String pregunta6 = s.next();
        System.out.println ("¿Cómo se dice diseñador web en inglés?");
        System.out.println ("a) Programmer");
        System.out.println ("b) Teacher");
        System.out.println ("c) Web developer"); 
        String pregunta7 = s.next();
        System.out.println ("¿Cómo se dice sitio web en inglés?");
        System.out.println ("a) Program");
        System.out.println ("b) Browser");
        System.out.println ("c) Web site"); 
        String pregunta8 = s.next();
        System.out.println ("¿Cúal es el navegador que tiene un zorro?");
        System.out.println ("a) Internet explore");
        System.out.println ("b) Chrome");
        System.out.println ("c) Firefox"); 
        String pregunta9 = s.next();
        System.out.println ("¿Cúal es el lenguaje favorito de Paco?");
        System.out.println ("a) Java");
        System.out.println ("b) C++");
        System.out.println ("c) Python"); 
        String pregunta10 = s.next();


        switch (pregunta1) {
			
			case "a":
			System.out.print("Incorrecto");
			break;
			case "b":
			System.out.print("Incorrecto");
			break;
			case "c":
			System.out.print("Correcto");
			resultado++;
			break;
		}
		
		        switch (pregunta2) {
			
			case "a":
			System.out.print("Correcto");
			resultado++;
			break;
			case "b":
			System.out.print("Incorrecto");
			break;
			case "c":
			System.out.print("Incorrecto");
			break;
		}

		        switch (pregunta3) {
			
			case "a":
			System.out.print("Incorrecto");
			break;
			case "b":
			System.out.print("Correcto");
			resultado++;
			break;
			case "c":
			System.out.print("Incorrecto");
			break;
		}
				
		        switch (pregunta4) {
			
			case "a":
			System.out.print("Incorrecto");
			break;
			case "b":
			System.out.print("Incorrecto");
			break;
			case "c":
			System.out.print("Correcto");
			resultado++;
			break;
		}		
		
		        switch (pregunta5) {
			
			case "a":
			System.out.print("Incorrecto");
			break;
			case "b":
			System.out.print("Incorrecto");
			break;
			case "c":
			System.out.print("Correcto");
			resultado++;
			break;
		}
		
		        switch (pregunta6) {
			
			case "a":
			System.out.print("Incorrecto");
			break;
			case "b":
			System.out.print("Incorrecto");
			break;
			case "c":
			System.out.print("Correcto");
			resultado++;
			break;
		}
							
		
		        switch (pregunta7) {
			
			case "a":
			System.out.print("Incorrecto");
			break;
			case "b":
			System.out.print("Incorrecto");
			break;
			case "c":
			System.out.print("Correcto");
			resultado++;
			break;
		}
		
		        switch (pregunta8) {
			
			case "a":
			System.out.print("Incorrecto");
			break;
			case "b":
			System.out.print("Incorrecto");
			break;
			case "c":
			System.out.print("Correcto");
			resultado++;
			break;
		}
		
		        switch (pregunta9) {
			
			case "a":
			System.out.print("Incorrecto");
			break;
			case "b":
			System.out.print("Incorrecto");
			break;
			case "c":
			System.out.print("Correcto");
			resultado++;
			break;
		}
		
		        switch (pregunta10) {
			
			case "a":
			System.out.print("Incorrecto");
			break;
			case "b":
			System.out.print("Incorrecto");
			break;
			case "c":
			System.out.print("Correcto");
			resultado++;
			break;
		}
		
		System.out.println("El resultado final es " + (resultado));								
	}
}

