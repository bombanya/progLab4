package please.help.shorties;

import please.help.interfaces.ObjectForJokes;

public class Runner extends ShortyVisitor{

    public Runner(String name){
        super(name);
        profession = "Бегун";
        jokesObject = new ObjectForJokes() {
            @Override
            public String getStringForTheJoke() {
                return "бегает на тоненьких ножках, а сзади у него собачий хвост";
            }
        };
    }
}
