package Opgave6;

public class Bil {
    private Trailer tilkobletTrailer;
    private static int VÆGT;

    public Bil(int vægt) {
        VÆGT = vægt;
    }

    public boolean connectTrailer(Trailer trailer){
        this.tilkobletTrailer = trailer;
        if (totalVægt() > 3500) {
            this.tilkobletTrailer = null;
            return false;
        }
        return true;
    }

    public int totalVægt(){
        int totalVægt =  this.tilkobletTrailer != null ? tilkobletTrailer.getVægt() + VÆGT : VÆGT;
        return totalVægt;
    }

    @Override
    public String toString() {
        return String.format("Bilen vejer: %d, totalvægten er: %d\n", VÆGT, totalVægt());
    }

    public static void main(String[] args){
        Bil bil = new Bil(3000);
        Trailer trailer = new Trailer(500);
        if (!bil.connectTrailer(trailer)){
            System.out.println("Trailer ikke tilkoblet");
        }
        System.out.println(bil);
    }
}
