
import org.junit.Test;

import static org.junit.Assert.*;

public class TranslatorTest {


    @Test
    public void noWordTranslator(){
        Translate translator = new Translate();
        assertTrue(translator.isEmpty());
    }

    @Test
    public void oneWordTranslate(){
        Translate translator = new Translate();
        translator.setTranslation("bom","good");
        assertFalse(translator.isEmpty());
        assertEquals("good", translator.translate("bom"));
    }
}
