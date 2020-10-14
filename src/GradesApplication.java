import grades.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication  {
    public static void main(String[] args) {

        HashMap<String, ArrayList> students= new HashMap<>();
        Student Gordon = new Student("Gordon");
        Gordon.addGrade(100);
        Gordon.addGrade(72);
        Gordon.addGrade(81);
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


        students.put("Gordon", Gordon.getGrade());
        students.put("ZtecFive", Zac.getGrade());
        students.put("Gt88",Gerald.getGrade());
        students.put("fleabag815",Vanessa.getGrade());


        System.out.println(students);
    }
}
