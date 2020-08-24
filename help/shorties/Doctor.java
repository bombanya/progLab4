package please.help.shorties;

import please.help.ThermometerTypes;
import please.help.interfaces.ObjectForJokes;

public class Doctor extends ShortyVisitor {

    public Doctor(String name, ThermometerTypes thermType){
        super(name);
        profession = "Доктор";
        jokesObject = new Thermometer(thermType);
    }

    public static class Thermometer implements ObjectForJokes{
        private final String type;

        public Thermometer(ThermometerTypes type){
            if (type == ThermometerTypes.MERCURIAL){
                this.type = "Ртутный";
            }
            else{
                this.type = "Электронный";
            }
        }

        public void measureTemperature(Shorty shorty){
            double temp = Math.random() * 1.3 + 36;
            System.out.print("Температура " + shorty + ": ");
            System.out.format("%.1f°C%n", temp);
        }

        @Override
        public String getStringForTheJoke() {
            return "вместо носа использует " + type + " термометр";
        }

        @Override
        public String toString() {
            return type + " термометр";
        }
    }
}
