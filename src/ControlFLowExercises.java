import java.lang.Math;
import java.sql.SQLOutput;
import java.util.Scanner;





public class ControlFLowExercises {
    public static void main(String[] args) {

//        Convert given number grades into letter grades.
//
//                Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0



        Scanner number = new Scanner(System.in);
        boolean userCont = true;

        do {
            System.out.println();
        }














//        Display a table of powers.
//
//                Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.



//        Scanner number = new Scanner(System.in);
//        System.out.println("enter an integer.");
//        boolean userCont = true;
//
//
//        do{
//            System.out.println("what number go up to?");
//            int userInt = number.nextInt();
//            System.out.println("here is table");
//            System.out.println("");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for(int i = 1; i <= userInt; i++){
//                System.out.printf("%-6d", i);
//                System.out.print(" | ");
//
//                System.out.printf("%-7d", i*i);
//                System.out.print(" | ");
//
//                System.out.print(i*i*i);
//
//                System.out.println();
//            }
//
//            System.out.println("Another Number? Y/N");
//            String userResponse = number.next();
//            if(!userResponse.equalsIgnoreCase("y")){
//                userCont = false;
//            }
//        } while (userCont);
//
//






//       for(int i = 1; i <= num; i*=i){
//           int l = i;
////           System.out.println(i*=i);
//
//           System.out.print(i+"    |   ");
//           System.out.print((i)+"     |   " );
//           System.out.println(i);
//
//
//           System.out.print((i) +"    |   ");
//           System.out.print((i=num*num)+"     |   " );
//           System.out.println(i=num*num*num);
//
//
//
//           System.out.print(l+"    |   ");
//           System.out.print((i*=i)+"     |   " );
//           System.out.print(i=num*num*num);
//       }
//




//for table processing
//        System.out.printf("%-6d |", num);








//        ••••••••••••••••••FizzBuzz•••••••••••••••••••••••
//
//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.

//        for(int i = 0; i <=100; i++){
//            if(i % 15 == 0 ){
//                System.out.println( "FizzBuzz");
//            } else if(i % 5 == 0){
//                System.out.println("Buzz");
//            } else if(i % 3 == 0){
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }
//



//Create a do-while loop that starts at 2, and displays the number squared
// on each line while the number
// is less than 1,000,000

//        long dw3 = 2;
//        do{
//            System.out.println(dw3);
//            dw3 *= dw3;
//        } while(dw3 <= 1000000);



//
//
// Reactor with a for loop ••••••••••••••••••••


//        for(int i = 0; i <= 100; i+=2 ){
//            System.out.println(i);
//        };
//

//        Alter your loop to count backwards by 5's from 100 to -10.
//
//        int dw2 = 100;
//        do{
//            System.out.println( dw2 );
//                  dw2 = dw2 - 5;
//        } while(dw2 > -10);


//Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//        int dw = 0;
//        do{
//        System.out.println( dw );
//            dw = dw + 2
//
//        } while(dw <= 100);


        // Reactor with a for loop ••••••••••••••••••••


//        for(int i = 100; i >= -10; i-=5){
//            System.out.println(i);
//        }
//


//While
//
//Create an integer variable i with a value of 5.
//Create a while loop that runs so long as i is less than or equal to 15
//Each loop iteration, output the current value of i, then increment i by one.
//Your output should look like this:
//
//5 6 7 8 9 10 11 12 13 14 15



//        int i = 5;
//        while (i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }

    }
}