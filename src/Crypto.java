import java.util.*;

public class Crypto {
    public static void main(String[] args){
        normalizeText();
    }
    public static void normalizeText(){
        String text = "This is some \\\"really\\\" great. (Text)!?";
        String normalizeText = text.replaceAll("[^A-Za-z]", "").toUpperCase();
        System.out.println(normalizeText);
    }
}
