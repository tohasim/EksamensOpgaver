import java.io.CharArrayWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Raflebæger {
    private int antalTerninger;
    private int[] terninger;

    public Raflebæger(int antalTerninger){
        terninger = new int[antalTerninger];
        this.antalTerninger = terninger.length;
        ryst();
    }
    private int ryst(){
        int antalØjne = 0;
        Random rng = new Random();
        for (int i = 0; i < terninger.length; i++) {
            terninger[i] = rng.nextInt(1, 7);
            antalØjne += terninger[i];
        }
        return antalØjne;
    }

    private int[] se(){
        return terninger;
    }

    public static void main(String[] args) {
        Raflebæger bæger = new Raflebæger(4);
        System.out.println("Antal terninger: " + bæger.antalTerninger);
        for (int i = 0; i < 10; i++){
            bæger.ryst();
            System.out.println("Kast " + i + ": " + Arrays.toString(bæger.se()));
        }
    }
}
