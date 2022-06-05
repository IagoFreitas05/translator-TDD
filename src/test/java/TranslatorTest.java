
import org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TranslatorTest {

    @Test
    public void noWordTranslator(){
        Translate translator = new Translate();
        assertTrue(translator.isEmpty());
    }
}
