package shapes;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class CircleApp {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);    // adding an element
        numbers.add(1, 21); // specifying an index
        numbers.add(0,22);

        System.out.println(numbers); // [21, 20, 22]

        numbers.size(); // 3
        numbers.get(2); // 22

        numbers.indexOf(20);    // 1
        numbers.indexOf("cat"); // -1
        System.out.println(numbers.clone());
        System.out.println(numbers.get(2));
        System.out.println(numbers.toString());
        ArrayList<String> roasts = new ArrayList<>();
        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");

        System.out.println(roasts); // [light, medium, medium, dark]

//        HashMap<String, String> usernames = new HashMap<>();

// and putting some data into it
//        usernames.put("Ryan", "ryanorsinger");
//        usernames.put("Zach", "zgulde");
//        usernames.put("Fernando", "fmendozaro");
//        usernames.put("Justin", "jreich5");
//
//        System.out.println(usernames);
//        usernames.get("Ryan"); // "ryanorsinger"
//        usernames.get("Phillip"); // null
//        usernames.getOrDefault("Jason", "gocodeup"); // "gocodeup"

        HashMap<String, String> usernames = new HashMap<>();
        usernames.put("Ryan", "ryanorsinger");

        System.out.println(usernames); // {Ryan=ryanorsinger}

        usernames.putIfAbsent("Zach", "zgulde");
        usernames.putIfAbsent("Zach", "coderdude24");
        System.out.println(usernames); // {Ryan=ryanorsinger, Zach=zgulde}


        Input input = new Input();
        double rad = input.getDouble(0,1000);
        Circle pokerChip = new Circle(rad);
        System.out.println("pokerChip.getCircumference() = " + pokerChip.getCircumference());
        System.out.println("pokerChip.getArea() = " + pokerChip.getArea());
    }
}
