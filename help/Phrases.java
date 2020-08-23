package please.help;

public enum Phrases {
    LAUGH("смеется."),
    PUTONEYEGLASSES("нацепил на нос пенсне и стал рассматривать портрет очень внимательно."),
    DISLIKE("не доволен портетом."),
    TAKEOFFENCE("обиделся.");

    private final String phrase;
    Phrases(String phrase){
        this.phrase = phrase;
    }

    public String getPhrase(){
        return phrase;
    }
}
