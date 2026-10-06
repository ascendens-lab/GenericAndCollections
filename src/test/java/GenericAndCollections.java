import java.util.*;
import java.util.Comparator;

public class GenericAndCollections {

    public void main(){

        String[] text = {"Hello", "Goodbye", "Evening"};
    convertToList(text);

    IO.println(Arrays.toString(text));

    IO.println(Arrays.asList(text));


    }

    private List convertToList(String[] a) {
        return Arrays.asList(a);

    }


}
