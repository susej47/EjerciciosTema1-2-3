import java.util.Scanner;
public class Ejercicio27T5 {
    public static void main (String[] args){


        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int n = s.nextInt();
        int count = 0;
        int sum= 0;

        for(int i = 0; i <= n; i+=3){
            System.out.println(i);
            count++;
            sum = sum+i;
        }
        System.out.print("\n Son " + count + " números que suman " + sum);
    }
}
