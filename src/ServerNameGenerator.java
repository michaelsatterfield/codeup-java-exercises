import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {
//public static String[]generator(){
//    final String[] nouns = {"car", "rock", "chair", "coupon", "border", "Montana", "accordion", "pen", "microphone", "book"};
//    final String[] adjectives = {"yellow", "bold", "soft", "organized", "loud", "even", "wacky", "cold", "tart", "rapid"};
//    Random randomAdj = new Random();
//    int indexA = randomAdj.nextInt(adjectives.length);
//    Random randomNoun = new Random();
//    int indexN= randomNoun.nextInt(nouns.length);
//
//    System.out.println("Here is your server name:\n"+adjectives[indexA]+"-"+nouns[indexN]);
//
//return generator();
//
//}






    public static void main(String[] args) {

        final String[] nouns = {"car", "rock", "chair", "coupon", "border", "Montana", "accordion", "pen", "microphone", "book"};
        final String[] adjectives = {"yellow", "bold", "soft", "organized", "loud", "even", "wacky", "cold", "tart", "rapid"};
        Random randomAdj = new Random();
        int indexA = randomAdj.nextInt(adjectives.length);
        Random randomNoun = new Random();
        int indexN= randomNoun.nextInt(nouns.length);

        System.out.println("Here is your server name:\n"+adjectives[indexA]+"-"+nouns[indexN]);


    }


}
