import java.util.Scanner;
public class Ejercicio13T5 {

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca diez números: ");
        int i = 0;
        int x = 0;
        int pos = 0;
        int neg= 0;
        
        do{
            x = s.nextInt();
            if(x < 0){
                neg++;
            }
            if(x > 0){
                pos++;
            }
            
            i++;
        }while(i <= 9);	
        
        System.out.println("Hay " + pos + " números positivos y " + neg + " negativos.");
	}

}
