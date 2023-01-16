package Opgaver.Opgave18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Video extends Media{
    public String aspectRatio;

    public Video(String name, int duration, String s) {
        super(name, duration);
        this.aspectRatio = s;
    }

    @Override
    public String toString() {
        return super.toString() + " aspectRatio='" + aspectRatio + '\'';
    }

    public static void main(String[] args) throws FileNotFoundException {
        File outFile = new File("./src/Opgaver.Opgave18/mediaInfo.txt");
        PrintStream output = new PrintStream(outFile);

        ArrayList<Media> media = new ArrayList<>();
        Audio audio1 = new Audio("Audio1", 200, -13);
        Audio audio2 = new Audio("Audio2", 180, -2);
        Audio audio3 = new Audio("Audio3", 0, -10.4);
        Audio audio4 = new Audio("Audio4", 2, -13.37);

        Video video1 = new Video("Video1", 2, "13:31");
        Video video2 = new Video("Video2", 20, "16:9");
        Video video3 = new Video("Video3", 200, "10:2");

        media.addAll(List.of(audio1, audio2, video1, audio3, video2, video3, audio4));
        for(Media m : media){
            output.println(m);
        }

    }
}
