import java.util.Scanner;
public class Ejercicio16T4 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int resultado = 0;
        System.out.println ("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        System.out.println ("a) Si");
        System.out.println ("b) No");
        String pregunta1 = s.next();
        System.out.println ("Ha aumentado sus gastos de vestuario");
        System.out.println ("a) Si");
        System.out.println ("b) No");
        String pregunta2 = s.next();
        System.out.println ("Ha perdido el interés que mostraba anteriormente por ti");
        System.out.println ("a) Si");
        System.out.println ("b) No");
        String pregunta3 = s.next();
        System.out.println ("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
        System.out.println ("a) Si");
        System.out.println ("b) No");
        String pregunta4 = s.next();
        System.out.println ("No te deja que mires la agenda de su teléfono móvil");
        System.out.println ("a) Si");
        System.out.println ("b) No");
        String pregunta5 = s.next();
        System.out.println ("A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
        System.out.println ("a) Si");
        System.out.println ("b) No");
        String pregunta6 = s.next();
        System.out.println ("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
        System.out.println ("a) Si");
        System.out.println ("b) No");
        String pregunta7 = s.next();
        System.out.println ("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
        System.out.println ("a) Si");
        System.out.println ("b) No");
        String pregunta8 = s.next();
        System.out.println ("Has notado que últimamente se perfuma más");
        System.out.println ("a) Si");
        System.out.println ("b) No");
        String pregunta9 = s.next();
        System.out.println ("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
        System.out.println ("a) Si");
        System.out.println ("b) No");
        String pregunta10 = s.next();


        switch (pregunta1) {
			
			case "a":
			resultado+=3;
			break;
			case "b":
			break;
		}
		
		        switch (pregunta2) {
			
			case "a":
			resultado+=3;
			break;
			case "b":
			break;
		}

		        switch (pregunta3) {
			
			case "a":
			resultado+=3;
			break;
			case "b":
			break;
		}
				
		        switch (pregunta4) {
			
			case "a":
			resultado+=3;
			break;
			case "b":
			break;
		}		
		
		        switch (pregunta5) {
			
			case "a":
			resultado+=3;
			break;
			case "b":
			break;
		}
		
		        switch (pregunta6) {
			
			case "a":
			resultado+=3;
			break;
			case "b":
			break;
		}
							
		
		        switch (pregunta7) {
			
			case "a":
			resultado+=3;
			break;
			case "b":
			break;
		}
		
		        switch (pregunta8) {
			
			case "a":
			resultado+=3;
			break;
			case "b":
			break;
		}
		
		        switch (pregunta9) {
			
			case "a":
			resultado+=3;
			break;
			case "b":
			break;
		}
		
		        switch (pregunta10) {
			
			case "a":
			resultado+=3;
			break;
			case "b":
			break;
		}
		
		System.out.println("El resultado final es " + (resultado));	
		System.out.println("Puntuación entre 0 y 10:");	
		System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
		System.out.println("Puntuación entre 11 y 22:");
		System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
		System.out.println("Puntuación entre 22 y 30");
		System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");

									
	}
}
