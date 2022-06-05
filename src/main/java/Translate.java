public class Translate {

    private String translation;

    public boolean isEmpty(){
        return this.translation == null;
    }

    public void setTranslation(String word, String translation){
        this.translation = translation;
    }

    public Object translate(String word){
        return this.translation;
    }
}
