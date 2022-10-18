import java.util.Scanner;
public class Ejercicio32T5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long x = s.nextLong();

    long n = x;
    long volteado = 0;
    int longitud = 0;
    
    if (n == 0) {
      longitud = 1;
    }
    
    while (n > 0) {
      volteado = (volteado * 10) + (n % 10);
      n /= 10;
      longitud++;
    }

    System.out.print("Dígitos pares: ");

    int digito;
    int sumaPares = 0;
    
    for (int i = 0; i < longitud; i++) {

      digito = (int)(volteado % 10);

      if ((digito % 2) == 0) {
        System.out.print(digito + " ");
        sumaPares += digito;
      }

      volteado /= 10;
    }
    
    System.out.println("\nSuma de los dígitos pares: " + sumaPares);
  }
}
