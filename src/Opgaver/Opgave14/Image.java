package Opgaver.Opgave14;

import java.util.ArrayList;

//15:44
public class Image {
    private String fileName;
    private int width;
    private int height;

    public Image(String fileName, int width, int height) {
        this.fileName = fileName;
        this.width = width;
        this.height = height;
    }

    public boolean isKnownFileType(){
        String[] fileNameArray = fileName.split("\\.");
        boolean isKnown = false;
        if(fileNameArray.length == 2){
            switch (fileNameArray[1]){
                case "gif", "jpg","jpeg","png","webp","bmp" -> isKnown = true;
            }
        }
        return isKnown;
    }

    public boolean isPortrait(){
        return height > width;
    }
    public boolean isLandscape(){
        return height <= width;}

    public static void main(String[] args) {
        Image portrait = new Image("portrait.jpeg", 20, 100);
        Image landscape = new Image("portrait.jpeg",  100, 20);
        Image portraitUnknownFile = new Image("landscaoe.test", 20, 100);
        ArrayList<Image> images = new ArrayList<>();
        images.add(portrait);
        images.add(portraitUnknownFile);
        images.add(landscape);
        for (Image image : images) {
            System.out.printf("%s: \n" +
                    "   Known file: %s\n" +
                    "   Is portrait: %s\n" +
                    "   Is Landscape: %s\n", image.fileName, image.isKnownFileType(), image.isPortrait(), image.isLandscape());
        }
    }
}
