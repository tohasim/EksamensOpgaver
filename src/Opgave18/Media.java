package Opgave18;

public class Media {
    private String name;
    private int duration;

    public Media(String name, int duration){
        this.name = name;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Name ='" + name + '\'' +
                ", duration=" + duration;
    }
}
