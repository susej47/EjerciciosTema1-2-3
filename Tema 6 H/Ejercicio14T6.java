import java.util.Scanner;
public class Ejercicio14T6 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int oportunidades = 5;
    int numeroPensado;
    int minimo = 0;
    int maximo = 100;
    boolean acertado = false;
    int mayorMenorOIgual;
        
    System.out.println("Piensa un número del 0 al 100. Intentaré adivinarlo en 5 intentos.");

    do {
      numeroPensado = (int)(Math.random() * (maximo - minimo) + minimo);
      System.out.println("¿Es el " + numeroPensado + "?");
      System.out.print("El número que estás pensando es 1)mayor 2)menor 3)el mismo: ");
      mayorMenorOIgual = s.nextInt();
      oportunidades--;

      if ( (mayorMenorOIgual == 1) && (oportunidades > 0) )
        minimo = numeroPensado + 1;
      
      if ( (mayorMenorOIgual == 2) && (oportunidades > 0) )
        maximo = numeroPensado - 1;
      
      if (mayorMenorOIgual == 3) {
        acertado = true;
        System.out.println("He acertado");
      }
    } while(!acertado && (oportunidades > 0));
    
    if (!acertado) {
      System.out.println("No he acertado");
    }
  }
}
