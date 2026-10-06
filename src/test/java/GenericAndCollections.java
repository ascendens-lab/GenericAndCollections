import java.util.*;
import java.util.Comparator;

public class GenericAndCollections {

    public void main(){


        List<String> lista = new ArrayList();

        lista.add("Goodmorning");
        lista.add("Goodday");
        lista.add("Goodnight");

        IO.println(lista);

        //List<String> test = reverse(lista); Alternative lösning.

        IO.println(reverse(lista));


    }
    private List<String> reverse(List<String> a) {

      return a.reversed();


    }


}
