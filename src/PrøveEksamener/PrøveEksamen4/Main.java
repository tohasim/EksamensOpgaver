package PrøveEksamener.PrøveEksamen4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String plainText = "abcde";
        CodeMessage message = new CodeMessage(plainText);
        System.out.println(Arrays.toString(message.getCiphers()));
    }
}
