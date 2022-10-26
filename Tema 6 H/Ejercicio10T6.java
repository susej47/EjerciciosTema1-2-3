public class Ejercicio10T6 {
    public static void main (String[] args) {


        int n = (int)(Math.random()*40-1);
        int cn = (int)(Math.random()*6-1);
        String c = "";

        for(int i = 1; i <= 10; i++) {
      
            n = (int)(Math.random() * 40) + 1;
            cn = (int)(Math.random() * 6);
            
            switch(cn) {
              case 0:
                c = "*";
                break;
              case 1:
                c = "-";
                break;
              case 2:
                c = "=";
                break;
              case 3:
                c = ".";
                break;
              case 4:
                c = "|";
                break;
              case 5:
                c = "@";
                break;
              default:
            }
            
            for(int j = 1; j <= n; j++) {
              System.out.print(c);
            }
            System.out.println();
          }

    }
    
}
