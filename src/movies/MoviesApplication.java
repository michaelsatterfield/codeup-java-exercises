package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] moviesList = new MoviesArray().findAll();
        System.out.println(moviesList);
        Input UserIn = new Input();

        Scanner Scan = new Scanner(System.in);

        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "\n" +
                "Enter your choice: " );
        String userChoice = Scan.next();
        System.out.print(userChoice);
        if(userChoice.equals(1)){
            System.out.println(moviesList);
        }


    }
}
