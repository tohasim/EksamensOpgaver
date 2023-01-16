package Opgaver.Opgave4;

import java.util.ArrayList;
import java.util.Arrays;

public class Keyword {
    private String word;
    private String definition;
    private ArrayList<Keyword> seeAlso = new ArrayList<>();

    public Keyword(String word){
        this.word = word;
        this.definition = "None";
    }

    public Keyword(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }

    public void addSeeAlso(Keyword seeAlso) {
        this.seeAlso.add(seeAlso);
    }

    public Object[] getSeeAlso(){
        ArrayList<String> returnArray = new ArrayList<>();
        for (Keyword word: seeAlso) {
            returnArray.add(word.word);
        }
        return returnArray.toArray();
    }

    private boolean matches(String word){
        return this.word.toLowerCase().contains(word.toLowerCase());
    }

    @Override
    public String toString() {
        return String.format("Word: %s, definition: %s, see also: %s", this.word, this.definition, Arrays.toString(this.getSeeAlso()));
    }

    public static void main(String[] args) {
        Keyword kw = new Keyword("Test");
        Keyword seeAlsoWord = new Keyword("See Also Word1");
        Keyword seeAlsoWord2 = new Keyword("See Also Word2");
        kw.addSeeAlso(seeAlsoWord);
        kw.addSeeAlso(seeAlsoWord2);
        System.out.println(kw.matches("est"));
        System.out.println(kw.matches("False"));
        System.out.println(kw.matches("eSt"));
        System.out.println(kw.matches("Test"));
        System.out.println(kw.matches("TEST"));
        System.out.println(kw);
    }
}
