import java.util.Scanner;
public class Ejercicio33T5 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
      System.out.print("Introduzca la altura de la U: ");
      int h = s.nextInt();
  
      for (int i = 1; i < h; i++) {
        System.out.print("* ");
        for (int j = 2; j < h; j++) {
          System.out.print("  ");
        }
        System.out.println("*");
      }
  
      System.out.print("  ");
      for (int i = 2; i < h; i++) {
        System.out.print("* ");
      }
  
    }
  }
