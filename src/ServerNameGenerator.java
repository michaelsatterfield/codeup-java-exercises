import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {


        String[] nouns = {"car", "rock", "chair", "coupon", "border", "Montana", "accordion", "pen", "microphone", "book"};
        final String[] adjectives = {"yellow", "bold", "soft", "organized", "loud", "even", "wacky", "cold", "tart", "rapid"};
        Random random = new Random();
        int index = random.nextInt(adjectives.length);
        System.out.println(adjectives[index]);


    }
    public static void main(String[] args) {
        System.out.println();
}



