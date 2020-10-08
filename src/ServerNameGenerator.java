import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {
    public static String[] nouns = {"car", "rock", "chair", "coupon", "border", "Montana", "accordion", "pen", "microphone", "book"};
    public static String[] adjectives = {"yellow", "bold", "soft", "organized", "loud", "even", "wacky", "cold", "tart", "rapid"};





    public static void main(String[] args) {


//        Random randomAdj = new Random();
//        int indexA = randomAdj.nextInt(adjectives.length);
//        Random randomNoun = new Random();
//        int indexN= randomNoun.nextInt(nouns.length);

//        System.out.println("Here is your server name:\n"+adjectives[indexA]+"-"+nouns[indexN]);
        System.out.println(getWord(nouns) + " "+ getWord(adjectives));
    }
//    public can be seen
    public static String getWord(String[] words){
        Random randomWord = new Random();
        int indexA = randomWord.nextInt(words.length);
        return words[indexA];
    }


}
