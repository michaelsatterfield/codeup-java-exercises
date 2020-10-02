import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner bob = new Scanner(System.in);
        Boolean userCont = true;
        String message = "Say something to Bob!";



        do {
            System.out.println(message);
//can use bob.nextLine...instead of using the int qMark*****************
            String userResponse = bob.next().trim();
            int qMark = userResponse.lastIndexOf("?");

            if (qMark > 0) {
                System.out.println("Sure.");
            } else if (userResponse.endsWith("!")) {
                System.out.println("Whoa, chill out!");

            } else if (userResponse.isBlank()) {
                System.out.println("Fine. Be that Way!");
            } else {
                System.out.println("Whatever.");
            };
            System.out.println(message + "? Y/N");
            String userYN = bob.next();
            if (!userYN.equalsIgnoreCase("y")){
            userCont = false; }

        } while (userCont);


    }
}
