public class Ejercicio1T6 {
    public static void main (String[] args) {
        int dado = 0;
        int suma = 0;
        for(int i = 0; i <3; i++){
            dado= (int)(Math.random()*6)+1;
            System.out.println(dado);
            suma += dado;
        }
        System.out.println("La suma de las 3 tiradas es de "+ suma);
        

    }
}
