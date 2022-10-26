public class Ejercicio9T6 {
    public static void main(String[] args) {

      int n = 0;
      int i = 0;
      
      while (n != 24) {
        n = (int)(Math.random() * 51) * 2;
        System.out.print(n + " ");
        i++;
      }
      System.out.println("\nSe han generado " + i + " números.");
    }
  }
