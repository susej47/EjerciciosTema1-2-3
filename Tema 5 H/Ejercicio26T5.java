import java.util.Scanner;
public class Ejercicio26T5 {
    public static void main (String[] args){


    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número: ");
    long nIn = s.nextLong();

    System.out.print("Introduzca un dígito: ");
    int digito = Integer.parseInt(System.console().readLine());
    
    long n = nIn;
    
    n = n * 10 + 1;
    
    
    long rev = 0;
    int longi = 0;
    int pos = 1;
    
    if (n == 0) {
      longi = 1;
    }
    
    while (n > 0) {
      rev = (rev * 10) + (n % 10);
      n /= 10;
      longi++;
    }
        
    while (rev != 1) {
      if ((rev % 10) == digito) {
        System.out.print(pos + " ");
      }
      rev /= 10;
      pos++;
    }

    }
}
