import java.util.Scanner;
public class Ejercicio24T5 {
    
    public static void main (String[] args){


        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca la altura de la pirámide: ");
        int x = s.nextInt();

    int h = 1;
    int i = 0;
    int spaces = x - 1;
    
    while (h <= x) {
      
      for (i = 1; i <= spaces; i++) {
        System.out.print(" ");
      }
      
      for (i = 1; i < h; i++) {
        System.out.print(i);
      }
      
      for (i = h; i > 0; i--) {
        System.out.print(i);
      }
      
      System.out.println();
      
      h++;
      spaces--;
    }


    }
}
