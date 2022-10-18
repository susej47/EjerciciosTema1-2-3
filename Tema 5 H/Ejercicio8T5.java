import java.util.Scanner;
public class Ejercicio8T5 {

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int x = s.nextInt();
        
        for(int i = 0; i <= 10; i++){
            System.out.println(x + " x " + i + " = " + x*i);
        }
			
	
	}


}
