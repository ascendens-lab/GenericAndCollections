import java.util.*;
import java.util.Comparator;

public class GenericAndCollections {

    public void main(){


        List<String> lista = new ArrayList();

        lista.add("Goodmorning");
        lista.add("Goodday");
        lista.add("Goodnight");

        IO.println(lista);

        List<String> test = reverse(lista);

        IO.println(test);


    }
    private List<String> reverse(List<String> a) {

      return a.reversed();


    }


}
