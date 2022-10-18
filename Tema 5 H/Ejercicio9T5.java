import java.util.Scanner;
public class Ejercicio9T5 {

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int x = s.nextInt();
        int i = 0;
        
        do{
            x/=10;
            i++;
        }while(x != 0);

        System.out.println("El número tiene " + i + " dígitos.");
			
	
	}


}
