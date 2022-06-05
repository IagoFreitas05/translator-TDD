
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

    @Test
    public void twoWordTranslateForTheSameWord(){
        translator.setTranslation("bom","good");
        translator.setTranslation("bom","nice");
        assertFalse(translator.isEmpty());
        assertEquals("good, nice", translator.translate("bom"));
    }

    @Test
    public void sentenceTranslator(){
        translator.setTranslation("guerra","war");
        translator.setTranslation("é","is");
        translator.setTranslation("ruim","bad");

        assertEquals("war is bad", translator.translateSentence("guerra é ruim"));
    }
}
