package util;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {
    private Scanner scanner;


// instance created*****

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {

        return this.scanner.nextLine();

    }


    public boolean yesNo(String yesNo) {
        System.out.println("yes or no.");
        String input = this.scanner.nextLine();
        return input.trim().equalsIgnoreCase("yes");
    }

    public int getInt(int min,int max) {
        while (true) {
            System.out.printf("please enter a number between %d and %d.", min, max);

            String input = scanner.nextLine();
            int num = Integer.parseInt(input);
            if (num >= min && num <= max)
                return num;
        }
    }
        public int getInt() {
            System.out.println("enter a number");
//            String input = scanner.nextLine();
//            int num = Integer.parseInt(input);
            int num;
            try {
                num = Integer.parseInt(getString());
                return num;
            } catch (NumberFormatException e) {
                System.out.println("Try Again");
//                e.printStackTrace();
            }
           return getInt();
        }


        public double getDouble(double min, double max) {
            while (true) {
                System.out.printf("Please enter a number between %f and %f", min, max);

//                String input = scanner.nextLine();
//                double num = Double.parseDouble(input);
                try {
                    double num = Double.parseDouble(getString());
                    if (num >= min && num <= max)
                        return num;
                } catch (NumberFormatException e) {
                    System.out.println("Not a valid number.");
//                    e.printStackTrace();
                    return getDouble(min,max);
                }
            }
        }
//
        public double getDouble(){
            System.out.println("Please enter a number");
            String input = scanner.nextLine();
            return Double.parseDouble(input);

        }



}
//

