import java.util.Scanner;
public class Ejercicio11T4 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca horas: ");
        int horas = s.nextInt();
        System.out.print("Introduzca minutos: ");
        int minutos = s.nextInt();

        if (horas >= 24){
            System.out.println("Horas inválida.");
        }
        if (minutos >= 60){
            System.out.println("Minutos inválido.");
        }
        
        System.out.println("Faltan " + (((24-horas)*3600) - (minutos*60)) + " segundos");

    }
}
