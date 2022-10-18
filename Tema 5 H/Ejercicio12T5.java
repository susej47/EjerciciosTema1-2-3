import java.util.Scanner;
public class Ejercicio12T5 {

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el número de factores de Fibonacci: ");
        int a = 0;
        int b = 1;
        int n = s.nextInt();
        int i = 0;
        int c = 0;

        System.out.println("\n\n FIBONNACI \n\n");
        switch(n){
            case 1:
            System.out.println("0");
            break;
            case 2:
            System.out.println("0\n1");
            break;
            default:
            System.out.println("0");
            do{
                a = b;
                b = c;
                c = a+b;
                System.out.println(c);
                i++;
            }while(i < n-1);	
        }
        		
	}

}
