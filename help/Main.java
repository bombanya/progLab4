package please.help;

import please.help.shorties.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Exhibition hermitage = new Exhibition();
        Unemployed neznaika = new Unemployed("Незнайка");
        Gourmet donut = new Gourmet("Пончик");
        Hunter pellet = new Hunter("Пулька", "Булька");
        Runner bustler = new Runner("Торопыжка");

        Doctor.Thermometer gradusnik = new Doctor.Thermometer(ThermometerTypes.ELECTRONIC);
        gradusnik.measureTemperature(neznaika);
        gradusnik.measureTemperature(donut);

        Doctor doc = new Doctor(null, ThermometerTypes.ELECTRONIC);
        Doctor pillman = new Doctor("Пилюлькин", ThermometerTypes.MERCURIAL);

        Hunter.Doggy dog = pellet.new Doggy("Бобик");

        ArrayList<Portrait> portraits = neznaika.makePortraits(pillman, donut, pellet, bustler, doc);
        ArrayList<Portrait> caricatures = neznaika.makeCaricatures(pillman, donut, pellet, bustler, doc);
        hermitage.addPortraits(portraits);
        hermitage.addPortraits(caricatures);
        hermitage.addVisitor(pillman);
        hermitage.addVisitor(donut);
        hermitage.addVisitor(pellet);
        hermitage.addVisitor(bustler);
        hermitage.addVisitor(doc);
        hermitage.addVisitor(dog);
        hermitage.start();
    }
}
