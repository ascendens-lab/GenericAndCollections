import java.util.*;
import java.util.Comparator;

public class GenericAndCollections {

    public void main(){

        String text = "Det här var inte lätt. Hej vad det går.";

        Set <String> resultat = stringParameter(text);

        IO.println(resultat);


    }

    static Set<String> stringParameter(String a){

        Set<String> ord = new HashSet<>();
        /* Här kapas ett Set som heter ord.
        - Set<String> = typen: ett Set som innehåller String
        - ord = variabeln som refererar till Setet
        - new HashSet<>() = själva HashSet-objektet skapas. */

        String[] delar = a.split(" ");
        //Här delas texten i a upp vid varje mellanslag.




        for (String del : delar) {
            ord.add(del);
            //Här går for-loopen igenom arrayen delar, ett ord i taget.
        }

        return ord;
    }
}
