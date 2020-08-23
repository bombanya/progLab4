package please.help.shorties;

import please.help.Portrait;
import please.help.interfaces.Painter;
import please.help.shorties.Shorty;

public class Unemployed extends Shorty implements Painter {

    public Unemployed(String name){
        super(name);
        profession = "Безработный";
    }

    @Override
    public Portrait makePortrait(Shorty shorty) {
        System.out.println(this + " рисует " + shorty + ".");
        return new Portrait(this, shorty);
    }

    @Override
    public Portrait makeCaricature(Shorty shorty) {
        System.out.println(this + " рисует карикатуру на " + shorty + ".");
        return new Portrait(this, shorty, true);
    }
}
