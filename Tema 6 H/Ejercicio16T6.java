
public class Ejercicio16T6 {
    public static void main(String[] args) {


        int x= 0;
        String pos1 = "";
        String pos2 = "";
        String pos3 = "";
        String figura= "";
        System.out.println("Se generará una tirada.");
        for (int i = 0; i < 3; i++){
            x = (int)(Math.random()*5+1);
            switch(x){
                case 1:
                figura = "corazón";
                break;
                case 2:
                figura = "diamante";
                break;
                case 3:
                figura = "herradura";
                break;
                case 4:
                figura = "campana";
                break;
                case 5:
                figura = "limón";
                break;
                default:
                break;
            }
            if(i == 0){
                pos1 = figura;
            }
            if(i == 1){
                pos2 = figura;
            }
            if(i == 2){
                pos3 = figura;
            }
        }
        System.out.println("La tirada ha sido " + pos1 + " "+ pos2 + " "+ pos3);
        if(pos1 == pos2 || pos1 == pos3 || pos2==pos3){
            if(pos1 == pos2 && pos1 == pos3 && pos2==pos3){
                System.out.println("Has conseguido 10 monedas.");
            }
            else{
            System.out.println("Bien, ha recuperado su moneda");
            }
        }
        if(pos1 != pos2 && pos1 != pos3 && pos2!=pos3){
            System.out.println("Lo siento, has perdido");
        }

    

    }
}
