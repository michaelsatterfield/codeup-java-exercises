package grades;

import grades.Student;
import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication  {
    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
        Student Gordon = new Student("Gordon");
        Gordon.addGrade(100);
        Gordon.addGrade(72);
        Gordon.addGrade(81);




//        HashMap<String, ArrayList> students= new HashMap<>();
//        Student Gordon = new Student("Gordon");
//        Gordon.addGrade(100);
//        Gordon.addGrade(72);
//        Gordon.addGrade(81);
        Student Zac = new Student("Zac");
        Zac.addGrade(72);
        Zac.addGrade(72);
        Zac.addGrade(84);
        Student Vanessa = new Student("Vanessa");
        Vanessa.addGrade(72);
        Vanessa.addGrade(98);
        Vanessa.addGrade(80);
        Student Gerald = new Student("Gerald");
        Gerald.addGrade(72);
        Gerald.addGrade(98);
        Gerald.addGrade(80);


        students.put("Gordon", Gordon);
        students.put("ZtecFive", Zac);
        students.put("Gt88",Gerald);
        students.put("fleabag815",Vanessa);


        System.out.println(Gordon.getGrade());
        cli(students);
    }

    public static void cli(HashMap<String,Student> students) {
        Input input = new Input();
        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:");
        for(String ghUserName :students.keySet()){
            System.out.println(ghUserName+" ");
        }
        do {
            System.out.println("What student would you like to see more information on?");
            String username = input.getString();
            if (students.containsKey(username)) {
                System.out.printf("\n" +
                                "Name: %s - GitHub Username: %s\n" +
                                "Current Average: %f", students.get(username).getName(),
                        username,
                        students.get(username).getGradeAverage());
            } else {
                System.err.println("Sorry, no student found with the GitHub username of " + username);
            }
            System.out.println("Would you like to see another student?");
        } while(input.yesNo(""));

    }
}
