package Opgaver.Opgave3;

public class Film {
    private int udgivelsesÅr;
    private String titel;
    private Producer producer;

    public Film(String titel, int udgivelsesÅr){
        this.titel = titel;
        this.udgivelsesÅr = udgivelsesÅr;
    }

    public Film(String titel) {
        this.titel = titel;
        udgivelsesÅr = 2022;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Producer getProducer() {
        return producer;
    }

    public static void main(String[] args){
        Film kingKong = new Film("King Kong", 2004);
        kingKong.setProducer(new Producer("James Cameron"));

        System.out.printf("Filmen \"%s\" er produceret af %s, og udgivet i %d", kingKong.titel, kingKong.getProducer(), kingKong.udgivelsesÅr);
    }
}
