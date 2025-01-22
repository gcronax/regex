import java.util.Arrays;
import java.util.Objects;

public class regex_prueba2 {
    public static void main(String[] args) {
       /* String prueba = "Tengo 2 gatos y 4 perros";
        String[] a=prueba.split(" ");
        for (String aux:a){
            System.out.print(aux);
            System.out.println(" "+aux
                    .matches("\\d"));
        }
        */

        String prueba = "guicamher@alu.edu.gva.es";
        String[] a=prueba.split("[.|@]");
        int count=0;
        for (String aux:a){
            if(Objects.equals(aux, "alu")){
                count++;
            }
            if(Objects.equals(aux, "edu")){
                count++;
            }
            if(Objects.equals(aux, "gva")){
                count++;
            }
            if(Objects.equals(aux, "es")){
                count++;
            }


        }
        if (count==4){
            System.out.println("es un gmail  valido");
        }





    }
}
