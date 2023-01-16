package Opgaver.Opgave5;

public class Card {
    private Suit suit;
    private int value;
    private static int MAX_VALUE = 13;
    private static int MIN_VALUE = 1;

    public Card(Suit suit, int value){
        this.suit = suit;
        this.value = value;
        if (this.value > MAX_VALUE)
            this.value = MAX_VALUE;
        if (this.value < MIN_VALUE)
            this.value = MIN_VALUE;
    }


    public static void main(String[] args){
        Card FiveOfSpades = new Card(Suit.spades, 5);
        Card FiveOfHearts = new Card(Suit.hearts, 5);
        Card FiveOfClubs = new Card(Suit.clubs, 5);
        Card FourOfHearts = new Card(Suit.hearts, 4);
        System.out.println(FiveOfSpades.Beats(FourOfHearts));
        System.out.println(FourOfHearts.Beats(FiveOfSpades));
        System.out.println(FiveOfSpades.Beats(FiveOfHearts));
        System.out.println(FiveOfClubs.Beats(FiveOfHearts));
    }

    private boolean Beats(Card cardToBeat) {
        if (this.value == cardToBeat.value){
            return this.suit.number > cardToBeat.suit.number;
        }
        else
            return this.value > cardToBeat.value;
    }
}
