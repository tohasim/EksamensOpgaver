package Opgave13;

import java.util.Random;

//15:34
public class JuleGave {
    private boolean isSoft;
    private boolean isRectangular;
    private boolean doesRattle;

    public JuleGave(){
        Random random = new Random();
        isSoft = random.nextBoolean();
        isRectangular = random.nextBoolean();
        doesRattle = random.nextBoolean();
    }

    public JuleGave(boolean isSoft, boolean isRectangular, boolean doesRattle) {
        this.isSoft = isSoft;
        this.isRectangular = isRectangular;
        this.doesRattle = doesRattle;
    }

    public boolean couldBeLego(){
        return ((!isSoft) && isRectangular && doesRattle);
    }

    public static void main(String[] args) {
        JuleGave juleGave = new JuleGave();
        JuleGave lego = new JuleGave(false, true, true);
        System.out.printf("Er julegaven blød: %s\n" +
                "Er julegaven rekatangulær: %s\n" +
                "Rasler gaven: %s\n" +
                "Kan den være lego?: %s\n", juleGave.isSoft, juleGave.isRectangular, juleGave.doesRattle, juleGave.couldBeLego());
    }
}
