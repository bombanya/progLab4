package please.help.shorties;

import please.help.ThermometerTypes;
import please.help.interfaces.ObjectForJokes;

public class Doctor extends ShortyVisitor {

    public Doctor(String name, ThermometerTypes thermType){
        super(name);

        class Thermometer implements ObjectForJokes{
            private final String type;

            public Thermometer(){
                if (thermType == ThermometerTypes.MERCURIAL){
                    type = "Ртутный";
                }
                else{
                    type = "Электронный";
                }
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

        profession = "Доктор";
        jokesObject = new Thermometer();
    }

    @Override
    public String toString() {
        return getProfession() + " " + getName() + " и его " + jokesObject;
    }
}
