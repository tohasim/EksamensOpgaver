package Opgave18;

public class Audio extends Media {
    private double loudness;

    public Audio(String name, int duration, double loudness){
        super(name, duration);
        this.loudness = loudness;
    }

    public String toString(){
        return super.toString() + " " + loudness + "dB";
    }
}
