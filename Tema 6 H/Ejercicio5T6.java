 public class Ejercicio5T6 {
    public static void main (String[] args) {


        int ran;
        int max= 0;
        int min = 200;
        int media = 0;
        for(int i = 0; i <20; i++){
            ran = (int)(Math.random()*200-100)+100;
            System.out.print( ran + " ");
            if(max < ran){
                max = ran;
            }
            if(min > ran){
                min = ran;
            }
            media += ran;

        }  

        System.out.println("\nEl número más alto fue " + max + ", el más pequeño fue " + min + " y la media de todos los números es " + media/20);


    }
}
