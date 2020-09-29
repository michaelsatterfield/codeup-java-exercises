//public class HelloWorld {
//    public static void main(String[] args) {
//        String name = "codeup";
//        System.out.printf("Hello there, %s. I'm Michael.\n", name);
//
//
//        System.out.print("Hello, ");
//
//
//        System.out.println("Codeup");
//
//        int myFavoriteNumber = 390;
//        System.out.print(myFavoriteNumber);
//
//        String myString = (" is an interesting Number");
//        System.out.println(myString);
//
//        float myNumber = 3.14f;
//        System.out.println(myNumber);
//
////        int x = 5;
////        System.out.println(++x);
////        System.out.println(x);
//
////        int class = 5;
//
////        int x = 4;
////        x += 5;
////        System.out.println(x);
//
////        int x = 3;
////        int y = 4;
////        y += x;
////
////        System.out.println(y);
//
//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
//        System.out.println(y);
//        System.out.println(x);
//
//     long z  = Integer.MAX_VALUE;
//
//
//        System.out.println(z);
//        System.out.println(Integer.MAX_VALUE);
//
//
//
//
//
//    }
//}

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        int number = 4;
        String typeOfPets = "cats;";
        System.out.printf("I have %d %s",number, typeOfPets);

        float curence = 1000;
        System.out.printf("the cost of typical is $%.2f.\n", curence);

        Scanner sc = new Scanner(System.in);
//
//        System.out.println("please enter your first name.");
//        String firstName = sc.next();
//        String middleName = sc.next();
//        System.out.printf("hello, %s %s\n", firstName, middleName);
//
//
//        System.out.println("how old?");
//        int age = sc.nextInt();
//        System.out.printf("%s is not that old", age);

//      ********whole line ******************
        System.out.println("what is your fav quote?");
        String quote = sc.nextLine();
        System.out.printf("Wow \"%s\" is a great quote. \n",quote);




    }
}