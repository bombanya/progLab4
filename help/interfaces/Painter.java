package please.help.interfaces;

import please.help.Portrait;
import please.help.shorties.Shorty;

import java.util.ArrayList;

public interface Painter {
     Portrait makePortrait(Shorty shorty);
     Portrait makeCaricature(Shorty shorty);
     default ArrayList<Portrait> makePortraits(Shorty[] listOfShorties){
          ArrayList<Portrait> listOfPortraits = new ArrayList<>();
          for (Shorty s: listOfShorties){
               listOfPortraits.add(makePortrait(s));
          }
          return listOfPortraits;
     }
     default ArrayList<Portrait> makeCaricatures(Shorty[] listOfShorties){
          ArrayList<Portrait> listOfCaricatures = new ArrayList<>();
          for (Shorty s: listOfShorties){
               listOfCaricatures.add(makeCaricature(s));
          }
          return listOfCaricatures;
     }
}
