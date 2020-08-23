package please.help.shorties;

import please.help.BadRandomException;
import please.help.Phrases;
import please.help.Portrait;
import please.help.interfaces.ExhibitionVisitor;

public abstract class ShortyVisitor extends Shorty implements ExhibitionVisitor {

    public ShortyVisitor(String name){
        super(name);
    }

    @Override
    public void lookAtThePortrait(Portrait portrait) {
        System.out.print(getName() + " смотрит на " + portrait + ": ");
        if (this.equals(portrait.getPortrayed()) && portrait.isCaricature()){
            System.out.println(Phrases.TAKEOFFENCE.getPhrase());
        }
        else{
            try {
                int phraseId = (int)Math.round(Math.random() * 10 % Phrases.values().length);
                if (phraseId == Phrases.values().length){
                    throw new BadRandomException();
                }
                System.out.println(Phrases.values()[phraseId].getPhrase());
            }
            catch (BadRandomException e){
                System.out.println(e.getMessage());
                System.out.println("Коротышка соображает, как ему отреагировать.");
                lookAtThePortrait(portrait);
            }
        }
    }
}
