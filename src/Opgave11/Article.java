package Opgave11;

import java.util.ArrayList;
import java.util.Arrays;

//14:38
public class Article {
    private String heading;
    private String body;
    private String author;
    public Article(){
        heading = "<Test Heading>";
        body = "Test test1 test11 test11 test11111, test,,, testertester, waddup.\n" +
                "waddup, waddup! tester.";
        author = "Tore Hald Simonsen";
    }

    public String getLongestWord(){
        body = body.replaceAll("\\W", " ");
        String[] bodyArray = body.split(" ");
        String longestWord = bodyArray[0];
        for (String word : bodyArray) {
            if (word.length() > longestWord.length())
                longestWord = word;
        }
        return longestWord;
    }

    public ArrayList<String> getWords(){
        ArrayList<String> listOfWords = new ArrayList<>();
        body = body.replaceAll("\\W", " ");
        String[] bodyArray = body.split(" ");
        for (String word : bodyArray) {
            if (!listOfWords.contains(word))
                listOfWords.add(word);
        }
        return listOfWords;
    }

    public static void main(String[] args) {
        Article article = new Article();
        System.out.println(article.getLongestWord());
        System.out.println(Arrays.toString(article.getWords().toArray()));
    }
}
