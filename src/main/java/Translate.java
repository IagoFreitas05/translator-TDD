import java.util.HashMap;
import java.util.Map;

public class Translate {

    private Map<String, String> translations = new HashMap<>();

    public boolean isEmpty() {
        return this.translations.isEmpty();
    }

    public void setTranslation(String word, String translation) {
        this.translations.put(word, translation);
    }

    public String translate(String word) {
        return this.translations.get(word);
    }
}
