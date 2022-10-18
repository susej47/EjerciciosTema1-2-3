public class Ejercicio22T5 {
    public static void main (String[] args){
   
        
        boolean primo = false;

        for (int x = 2; x <= 100; x++) {

            primo = true;
            for (int i = 2; i < x; i++) {
              if (x % i == 0) {
                primo = false;
              }
            }
      
            if (primo) {
              System.out.print(x + " ");
            }
          }


    }
}
