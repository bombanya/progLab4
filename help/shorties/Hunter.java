package please.help.shorties;

import please.help.NoNameException;
import please.help.Portrait;
import please.help.interfaces.ExhibitionVisitor;
import please.help.interfaces.ObjectForJokes;

public class Hunter extends ShortyVisitor {

    public Hunter(String name, String favouriteDoggyName){
        super(name);
        profession = "Охотник";
        jokesObject = new Doggy(favouriteDoggyName);
    }

    public class Doggy implements ObjectForJokes, ExhibitionVisitor {
        private String name;
        private final Shorty owner = Hunter.this;

        public Doggy(String name){
            this.name = name;
        }

        public String getName() throws NoNameException{
            if (name == null || name.equals("")){
                throw new NoNameException();
            }
            return name;
        }

        public Shorty getOwner(){
            return owner;
        }

        @Override
        public String getStringForTheJoke() {
            return "едет верхом на собачке " + name;
        }

        @Override
        public String toString() {
            try{
                return "Собачка " + getName();
            }
            catch (NoNameException e){
                System.out.println(e.getMessage());
                e.printStackTrace();
                name = "Безымянная";
                return "Собачка " + name;
            }

        }

        @Override
        public void lookAtThePortrait(Portrait portrait) {
            System.out.print(this + " смотрит на " + portrait + ": ");
            if (portrait.getPortrayed().equals(getOwner())){
                System.out.println("виляет хвостом.");
            }
            else{
                System.out.println("гавкает.");
            }
        }
    }
}
