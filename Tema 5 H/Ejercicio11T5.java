import java.util.Scanner;
public class Ejercicio11T5 {


    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int x = s.nextInt();
        int i = 0;
        
        do{
            System.out.println(x + "\t" + (x*x) + "\t" + (x*x*x));
            i++;
            x++;
        }while(i <= 4);			
	}

}


