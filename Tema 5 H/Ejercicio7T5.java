import java.util.Scanner;
public class Ejercicio7T5 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Diga contraseña ");
        int pass = s.nextInt();
        int trypass = 0;

        System.out.println("Pruebe contraseña ");

        for(int i = 0; i < 4; i++){
            trypass = s.nextInt();
            if(trypass == pass){
                i = 4;
            }
            if(trypass != pass){
                System.out.println("Lo siento, esa no es la combinación. " + (3-i) + " intentos restantes");
            }

        }
        if(trypass == pass){
            System.out.println("La caja fuerte se ha abierto.");
        }
        if(trypass != pass){
            System.out.println("La caja fuerte se ha bloqueado por motivos de seguridad.");
        }
    }   
}
