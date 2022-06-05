import java.util.HashMap;
import java.util.Map;

public class Translate {

    private Map<String, String> translations = new HashMap<>();

    public boolean isEmpty() {
        return this.translations.isEmpty();
    }

    public void setTranslation(String word, String translation) {
        if (translations.containsKey(word)) {
            translation = translate(word) + ", " + translation;
            this.translations.put(word, translation);
        }
        this.translations.put(word, translation);
    }

    public String translate(String word) {
        return this.translations.get(word);
    }

    public String translateSentence(String sentence) {
        String[] words = sentence.split(" ");
        String sentenceTranslated = "";
        for (String word : words) {
            String translated = translate(word);
            if(translated.contains(","))
                translated = translated.substring(0, translated.indexOf(","));
            sentenceTranslated += translated + " ";
        }
        return sentenceTranslated.trim();
    }

}
