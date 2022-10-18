import java.util.Scanner;
public class Ejercicio17T5 {

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un numero entero positivo: ");
        int x = s.nextInt();
        int sum = 0;

        if(x < 0){
            System.out.println("Número inválido, introduzca un número positivo.");
        }
        if (x > 0){
            for(int i = x; i < x+100; i++){
            sum += i;
            }
        System.out.println("La suma de los 100 siguientes números es " + sum);
        
        }
    }   
}
