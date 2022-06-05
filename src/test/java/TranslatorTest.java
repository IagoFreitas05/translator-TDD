
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TranslatorTest {

    private Translate translator;

    @Before
    public void makeTranslator(){
        this.translator = new Translate();
    }

    @Test
    public void noWordTranslator(){
        assertTrue(translator.isEmpty());
    }

    @Test
    public void oneWordTranslate(){
        translator.setTranslation("bom","good");
        assertFalse(translator.isEmpty());
        assertEquals("good", translator.translate("bom"));
    }

    @Test
    public void twoWordTranslate(){
        translator.setTranslation("bom","good");
        translator.setTranslation("mal","bad");
        assertFalse(translator.isEmpty());
        assertEquals("good", translator.translate("bom"));
        assertEquals("bad", translator.translate("mal"));
    }
}
