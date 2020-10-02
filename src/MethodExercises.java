import java.util.Scanner;

public class MethodExercises {
    public static void main(String[] args) {
//        System.out.println(addition(3,5));
//        System.out.println(subtract(22,2));
//        System.out.println(multiply(5,8));
//        System.out.println(divide(8,2));

        System.out.println(getInteger(20,30));

        System.out.println(getFactorial(getInteger(1,10)));



    }




    public static int addition ( int num1, int numb2){
        return num1 + numb2;
    }
    public static int subtract ( int num1, int numb2){
        return num1 - numb2;
         }
    public static int multiply ( int num1, int numb2){
        return num1 * numb2;
    }
    public static int divide ( int num1, int numb2){
        return num1 / numb2;
    }

//    Create a method that validates that user input is in a certain range

    public static int getInteger(int min, int max){


        Scanner scan = new Scanner(System.in);
        System.out.println("What is Your Age?");
        int userAnswer = scan.nextInt();

        if(userAnswer > min && userAnswer < max) {
            System.out.println("this is in range!");
            return userAnswer;
        } else{
            System.out.println("try again.");
            return getInteger(min,max);
        }
    }

    public static int getFactorial(int number){
        Scanner newScan = new Scanner(System.in);
    }





}
