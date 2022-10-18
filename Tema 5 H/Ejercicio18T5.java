import java.util.Scanner;
public class Ejercicio18T5 {
    public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca 2 números enteros: ");
    int x = s.nextInt();
    int y = s.nextInt();

    if (x == y){
        System.out.println("No puede ser el mismo número.");
    }
    
    if (y > x){
        for(int i = x; i < y; i+= 7){
            System.out.println(i);
        }
    }
    if(x > y){
        for(int i = y; i < x; i+= 7){
            System.out.println(i);
        }
    }

    }
}
