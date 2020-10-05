import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int range = 100 - 1 + 1;
        int numberToGuess = (int) ((Math.random() * range) + 1);
        System.out.println("numberToGuess = " + numberToGuess);


        while(true){
            System.out.println();
        }
    }
}
