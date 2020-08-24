package please.help.shorties;

import please.help.NoNameException;
import please.help.interfaces.ObjectForJokes;
import java.util.Objects;

public abstract class Shorty {

    private String name;
    protected String profession;
    protected ObjectForJokes jokesObject;

    public Shorty(String name){
        this.name = name;
    }

    public String getName() throws NoNameException{
        if (name == null || name.equals("")){
            throw new NoNameException();
        }
        return name;
    }

    public String getProfession(){
        return profession;
    }

    public String makeFunOfShorty(){
        return jokesObject.getStringForTheJoke();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null) return false;
        if (getClass() != other.getClass()) return false;
        return (other.toString()).equals(toString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(toString());
    }

    @Override
    public String toString() {
        try{
            return getProfession() + " " + getName();
        }
        catch (NoNameException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            name = "Безымянный";
            return getProfession() + " " + name;
        }
    }
}
