import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f\n",pi);
//
        Scanner value = new Scanner(System.in);
//
//        System.out.println("Enter a number");
//        int num = value.nextInt();
//        System.out.printf("the number is %s.\n ", num);

//        System.out.println("What are the first 3 words that come to your mind?");
//        String firstWord = value.next();
//        String secondWord = value.next();
//        String thirdWord = value.next();
//        System.out.printf("first word is \"%s\"\n second is \"%s\"\n and third is \"%s\"\n",firstWord,secondWord,thirdWord);
//        value.nextLine();
//
//
//        System.out.println("Please write a sentence, any sentence");
//        String sentence = value.nextLine();
//        System.out.printf("%s\n",sentence);

//
//    Scanner measure = new Scanner(System.in);
//    System.out.println("What is the length of the room where you are in in feet?");
//    String length = measure.nextLine();
//    int l = Integer.parseInt(length);
//    System.out.println("What is the width of the room where you are in in feet?");
//    String width = measure.nextLine();
//    int w = Integer.parseInt(width);
//    int p = (2*l) +(2* w);
//

//        int i = 0;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
//
//
//        }

        for(int i = 0; i < 10; i += 1) {
            System.out.println("i is " + i);
        }


        for(int i = 1; i <= 10; i++) { // <--+
            if(i % 2 == 1) { //              |
                continue; // ----------------+
            }
            System.out.println(i);
        }

//*****While Loop*************
        int i = 0;
        while (i <= 10) {
            System.out.println("While loop: i:" + i);
            i++;
        }


// do While*************use on yes or no *
        int counter = 0;

         do {
            System.out.println("Loop counter" + counter);
            counter++;
        } while (counter <= 0);
//∞∞∞∞∞For Loop ∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞
        for(int x = 0; x <= 10; x++){
            System.out.println("val of x is: " + x);
        }
//        Break and continue
        for(int z = 0; z <= 10; z++) {
            if(z % 2 ==1) {
                continue; //--------------
            } else if(z > 5) {
                break;

            }
            System.out.println("a = "+ z);

        }
        System.out.println("finished");

    }
}
