package movies;
//application
import util.Input;

import java.util.Scanner;

public class MoviesApplication {
//    create a Method outside of main method(static)
    static Movie[] moviesList = new MoviesArray().findAll();
    public static void main(String[] args) {

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
                "5 - view movies in the scifi category\n");
//        String userChoice = Scan.next();
//        System.out.print(userChoice);
        switch (UserIn.getInt(0, 5)) {
            case 0:
                System.exit(0);
                break;
            case 1:
//                 class  var  |variable defined above
                for(Movie movie : moviesList) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
                break;
            case 2:
                printMovieByCategory("animated");
            case 3:
               printMovieByCategory("drama");
                break;
            case 4:
               printMovieByCategory("horror");
                break;
            case 5:
               printMovieByCategory("scifi");
                break;
            default:



        }
    }
//method for for loop to filter the categories..not used multiple times;
    public static void printMovieByCategory(String category) {
        System.out.println("View movies in the " + category + " category");
        for (Movie movie : moviesList) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }

        }


    }
}