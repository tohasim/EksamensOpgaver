package Opgaver.Opgave19;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Dream {
    private Date date;
    private int duration;
    public enum Type{DRY, LUCID, NIGHTMARE};
    private Type type;

    public Dream() {
    }

    public Dream(Date date, int duration, Type type){
        this.date = date;
        this.duration = duration;
        this.type = type;
    }

    public boolean isPleasant(){
        return switch (type){
            case DRY -> duration > 10;
            case LUCID -> duration <= 10;
            case NIGHTMARE -> false;
        };
    }

    @Override
    public String toString() {
        String duration1 = String.format("%d",duration) ;
        return duration1;
    }

    public Date getDate() {
        return date;
    }

    //--------------------------------------------//

    public static void main(String[] args){
        Dream dream1 = new Dream(new Date(), 21, Type.DRY);
        Dream dream2 = new Dream(new Date(), 22, Type.LUCID);
        Dream dream3 = new Dream(new Date(), 23, Type.NIGHTMARE);
        Dream dream4 = new Dream(new Date(), 9, Type.DRY);
        Dream main = new Dream();
        ArrayList<Dream> dreams = new ArrayList<>(List.of(dream1, dream2, dream3, dream4));
        System.out.println(main.dreamsSorted(dreams));
        for(int i = 0; i < dreams.size(); i++){
            System.out.printf("Drøm #%d, er pleasant: %s\n", i + 1, dreams.get(i).isPleasant());

        }
    }
    public ArrayList<Dream> dreamsSorted(ArrayList<Dream> dreams){
        DreamSorter sorter = new DreamSorter();
        dreams.sort(sorter);
        return dreams;
    }
}
