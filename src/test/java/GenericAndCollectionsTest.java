import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericAndCollectionsTest {


    @Test
    void testStringParameter() {
        GenericAndCollections ovning = new GenericAndCollections();
        Set<String> resultat = ovning.stringParameter("Jag gillar Java");

        assertEquals(3, resultat.size());
    }
}
