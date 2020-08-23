package please.help;

import please.help.shorties.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Exhibition hermitage = new Exhibition();
        Doctor pillman = new Doctor("Пилюлькин", ThermometerTypes.MERCURIAL);
        Unemployed neznaika = new Unemployed("Незнайка");
        Gourmet donut = new Gourmet("Пончик");
        Hunter pellet = new Hunter("Пулька", "Булька");
        Runner bustler = new Runner("Торопыжка");
        Doctor doc = new Doctor(null, ThermometerTypes.ELECTRONIC);

        ArrayList<Portrait> portraits = neznaika.makePortraits(new Shorty[]{pillman, donut, pellet, bustler, doc});
        ArrayList<Portrait> caricatures = neznaika.makeCaricatures(new Shorty[]{pillman, donut, pellet, bustler, doc});
        hermitage.addPortraits(portraits);
        hermitage.addPortraits(caricatures);
        hermitage.addVisitor(pillman);
        hermitage.addVisitor(donut);
        hermitage.addVisitor(pellet);
        hermitage.addVisitor(bustler);
        hermitage.addVisitor(doc);
        hermitage.start();
    }
}
