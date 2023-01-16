package PrøveEksamener.PrøveEksamen4;

import java.util.ArrayList;

public class CodeMessage {
    private String plainText;
    private int[] ciphers;
    private int shiftValue;

    public CodeMessage(String plainText){
        this.plainText = plainText;
        setCiphers();
    }

    public int parseValue(char value){
        return switch (value){
            case 'a' -> 1;
            case 'b' -> 2;
            case 'c' -> 3;
            case 'd' -> 4;
            case 'e' -> 5;
            case 'f' -> 6;
            case 'g' -> 7;
            case 'h' -> 8;
            case 'i' -> 9;
            case 'j' -> 10;
            case 'k' -> 11;
            case 'l' -> 12;
            case 'm' -> 13;
            case 'n' -> 14;
            case 'o' -> 15;
            case 'p' -> 16;
            case 'q' -> 17;
            case 'r' -> 18;
            case 's' -> 19;
            case 't' -> 20;
            case 'u' -> 21;
            case 'v' -> 22;
            case 'w' -> 23;
            case 'x' -> 24;
            case 'y' -> 25;
            case 'z' -> 26;
            case 'æ' -> 27;
            case 'ø' -> 28;
            case 'å' -> 29;
            case ' ' -> 100;
            case ',' -> 101;
            case '.' -> 102;
            default -> 0;
        };
    }

    public void setCiphers(){
        ciphers = new int[plainText.length()];
        ArrayList<String> test = new ArrayList<>();
        for(int i = 0; i < plainText.length(); i++){
            ciphers[i] = parseValue(plainText.toLowerCase().charAt(i));
        }
    }

    public int[] getCiphers() {
        return ciphers;
    }

    public static void main(String[] args) {
        CodeMessage prog = new CodeMessage("Tester");


    }

}
