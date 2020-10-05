import java.util.Scanner;

public class MethodExercises {
    public static void main(String[] args) {
//        System.out.println(addition(3,5));
//        System.out.println(subtract(22,2));
//        System.out.println(multiply(5,8));
//        System.out.println(divide(8,2));

        System.out.println(getInteger(20, 30));


        System.out.println(getFactorial(1));
        System.out.println(cont(5));

    }


    public static int addition(int num1, int numb2) {
        return num1 + numb2;
    }

    public static int subtract(int num1, int numb2) {
        return num1 - numb2;
    }

    public static int multiply(int num1, int numb2) {
        return num1 * numb2;
    }

    public static int divide(int num1, int numb2) {
        return num1 / numb2;
    }

//    Create a method that validates that user input is in a certain range

    public static int getInteger(int min, int max) {


        Scanner scan = new Scanner(System.in);
        System.out.println("What is Your Age?");
        int userAnswer = scan.nextInt();

        if (userAnswer > min && userAnswer < max) {
            System.out.println("this is in range!");
            return userAnswer;
        } else {
            System.out.println("try again.");
            return getInteger(min, max);
        }
    }


    public static int getFactorial(int number) {
        Scanner newScan = new Scanner(System.in);
        System.out.println("enter a number between 1 and 10");
        long userRes = newScan.nextInt();
        if (userRes > 0 && userRes < 11) {
            System.out.println("this is in range!");
//            return userRes;
        } else {
            System.out.println("try again.");
            return getFactorial(number);
        }
        ;

        int fact = 1;
        for (int i = 2; i <= userRes; i++) {
            fact = fact * i;
            System.out.println(i);
        }
        return fact;

    }

    public static int cont(int userCont) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to continue?");
        String yesNo = scan.nextLine();
        do {
            return getFactorial(1);
        } while(yesNo.equalsIgnoreCase("yes") || yesNo.equalsIgnoreCase("y"));


    }





}
