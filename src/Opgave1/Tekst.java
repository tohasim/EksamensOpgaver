package Opgave1;

import java.util.ArrayList;

public class Tekst {
    private ArrayList<String> tekstLinjer;

    private void tilføj(String tilføjelse){
        tekstLinjer.add(tilføjelse);
    }
    private int findAntalUnikke(){
        ArrayList<String> unikke = new ArrayList<>();
        for (String s : tekstLinjer) {
            if (!unikke.contains(s))
                unikke.add(s);
        }
        return unikke.size();
    }

    private int findAntalEnkeltstående(){
        ArrayList<String> unikke = new ArrayList<>();
        ArrayList<String> removedFromUnikke = new ArrayList<>();
        for (String s : tekstLinjer) {
            if (!unikke.contains(s) && !removedFromUnikke.contains(s))
                unikke.add(s);
            else {
                unikke.remove(s);
                removedFromUnikke.add(s);
            }
        }
        return unikke.size();
    }

    public static void main(String[] args) {
        Tekst program = new Tekst();
        program.tekstLinjer = new ArrayList<>();
        program.tilføj("Hund");
        program.tilføj("Kat");
        program.tilføj("Marsvin");
        program.tilføj("Hund");
        System.out.println("Tekstlinjer: " + program.tekstLinjer);
        System.out.println("Antal unikke: " + program.findAntalUnikke());
        System.out.println("Antal enkeltstående: " + program.findAntalEnkeltstående());
    }
}
