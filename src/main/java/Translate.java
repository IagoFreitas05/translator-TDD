import java.util.HashMap;
import java.util.Map;

public class Translate {

    private Map<String, String> translation = new HashMap<>();

    public boolean isEmpty() {
        return this.translation.isEmpty();
    }

    public void setTranslation(String word, String translation) {
        this.translation.put(word, translation);
    }

    public String translate(String word) {
        return this.translation.get(word);
    }
}
