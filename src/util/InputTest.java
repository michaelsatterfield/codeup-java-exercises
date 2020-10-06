package util;

import java.util.Scanner;

public class InputTest {
//public class Input {
//    private Scanner scanner;
//}
    public static void main(String[] args) {
        Input input = new Input();

       if(input.yesNo())
           System.out.println("this is true");
       else
           System.out.println("not true");

        System.out.println(input.getDouble(120,350));
    }
}
