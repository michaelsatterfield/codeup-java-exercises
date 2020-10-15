package util;

public class InputTest {
//public class Input {
//    private Scanner scanner;
//}
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getInt());

//       if(input.yesNo("Would you like to see another Student? Y/N"))
//           System.out.println("this is true");
//       else
//           System.out.println("not true");

        System.out.println(input.getDouble(120,350));
    }
}
