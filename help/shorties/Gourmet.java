package please.help.shorties;

import please.help.interfaces.ObjectForJokes;

public class Gourmet extends ShortyVisitor{
    private final int weight;
    public Gourmet(String name){
        super(name);

        class Paunch implements ObjectForJokes{
            private final String offensiveDescription;

            public Paunch(){
                if (weight < 8){
                    offensiveDescription = "такой толстый, что с трудом помещается на портрете";
                }
                else{
                    offensiveDescription = "такой толстый, что даже не помещается на портрете";
                }
            }

            @Override
            public String getStringForTheJoke() {
                return offensiveDescription;
            }
        }

        profession = "Гурман";
        weight = (int)(Math.random() * 5 + 5);
        jokesObject = new Paunch();
    }


}
