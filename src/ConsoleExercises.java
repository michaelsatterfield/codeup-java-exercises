import java.awt.*;
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


    Scanner measure = new Scanner(System.in);
    System.out.println("What is the length of the room where you are in in feet?");
    String length = measure.nextLine();
    int l = Integer.parseInt(length);
    System.out.println("What is the width of the room where you are in in feet?");
    String width = measure.nextLine();
    int w = Integer.parseInt(width);
    int p = (2*l) +(2* w);

    System.out.println("Your area is: " + l*w + " feet");
    System.out.println("Your perimeter is: "+ p +" feet");


    }
}
