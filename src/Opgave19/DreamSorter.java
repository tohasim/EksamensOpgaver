package Opgave19;

import java.util.Comparator;

public class DreamSorter implements Comparator<Dream> {
    @Override
    public int compare(Dream o1, Dream o2) {
        return o1.getDate().compareTo(o2.getDate());
    }
}
