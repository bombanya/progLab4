package please.help.shorties;

import please.help.NoNameException;
import please.help.interfaces.ObjectForJokes;

public class Hunter extends ShortyVisitor {

    public Hunter(String name, String doggyName){
        super(name);
        profession = "Охотник";
        jokesObject = new Doggy(doggyName);
    }

    @Override
    public String toString() {
        return getProfession() + " " + getName() + " и его " + jokesObject;
    }

    static class Doggy implements ObjectForJokes {
        private String name;

        public Doggy(String name){
            this.name = name;
        }

        public String getName(){
            try{
                if (name == null || name.equals("")){
                    throw new NoNameException();
                }
            }
            catch (NoNameException e){
                System.out.println(e.getMessage());
                e.printStackTrace();
                name = "Безымянная";
            }
            return name;
        }

        @Override
        public String getStringForTheJoke() {
            return "едет верхом на собачке " + name;
        }

        @Override
        public String toString() {
            return "Собачка " + getName();
        }
    }
}
