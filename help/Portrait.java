package please.help;

import please.help.shorties.Shorty;

import java.util.Objects;

public class Portrait{

    private boolean caricature;

    private final Shorty author, portrayed;
    private final int portraitId;
    private static int nextPortraitId = 0;

    {
        portraitId = nextPortraitId;
        nextPortraitId++;
    }

    public Portrait(Shorty author, Shorty portrayed){
        this.author = author;
        this.portrayed = portrayed;
    }

    public Portrait(Shorty author, Shorty portrayed, boolean caricature){
        this.author = author;
        this.portrayed = portrayed;
        this.caricature = caricature;
    }

    public Shorty getAuthor(){
        return author;
    }

    public Shorty getPortrayed(){
        return portrayed;
    }

    public int getPortraitId(){
        return portraitId;
    }

    public boolean isCaricature(){
        return caricature;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null) return false;
        if (getClass() != other.getClass()) return false;
        return ((Portrait) other).getPortraitId() == this.portraitId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(portraitId, author, portrayed);
    }

    @Override
    public String toString() {
        if (caricature) {
            return "Портрет " + portrayed + ", который "
                    + portrayed.makeFunOfShorty() + ", написанный " + author;
        } else {
            return "Портрет " + portrayed + ", написанный " + author;
        }
    }
}
