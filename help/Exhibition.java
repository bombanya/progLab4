package please.help;

import please.help.interfaces.ExhibitionVisitor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Exhibition {

    private final ArrayList<Portrait> listOfPortraits = new ArrayList<>();
    private final ArrayList<ExhibitionVisitor> listOfVisitors = new ArrayList<>();
    private final int exhibitionId;
    private static int nextExhibitionId = 0;

    {
        exhibitionId = nextExhibitionId;
        nextExhibitionId += 1;
    }

    public void addPortrait(Portrait portrait){
        listOfPortraits.add(portrait);
    }

    public void addPortraits(Collection<Portrait> list){
        listOfPortraits.addAll(list);
    }

    public ArrayList<Portrait> getListOfPortraits(){
        return listOfPortraits;
    }

    public void addVisitor(ExhibitionVisitor visitor){
        listOfVisitors.add(visitor);
    }

    public void addVisitors(Collection<ExhibitionVisitor> visitors){
        listOfVisitors.addAll(visitors);
    }

    public ArrayList<ExhibitionVisitor> getListOfVisitors(){
        return listOfVisitors;
    }

    public int getExhibitionId(){
        return exhibitionId;
    }

    public void start(){
        for (ExhibitionVisitor visitor : listOfVisitors){
            for (Portrait p : listOfPortraits){
                visitor.lookAtThePortrait(p);
            }
        }
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null) return false;
        if (getClass() != other.getClass()) return false;
        return ((Exhibition) other).getExhibitionId() == this.exhibitionId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(exhibitionId, listOfPortraits, listOfVisitors);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("Exhibition " + exhibitionId + ":\nPortraits : {");
        for (Portrait p : listOfPortraits){
            res.append(p.toString()).append("; ");
        }
        res.delete(res.length() - 2, res.length());
        res.append("}\nVisitors : {");
        for (ExhibitionVisitor visitor: listOfVisitors){
            res.append(visitor.toString()).append("; ");
        }
        res.delete(res.length() - 2, res.length());
        res.append("}");

        return res.toString();
    }
}
