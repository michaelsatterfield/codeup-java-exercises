package grades;

import java.util.ArrayList;
import java.util.List;


public  class Student {


    private  String name;
    private ArrayList<Integer> grades;


    //    constructors
    public  Student(String studentName) {
        this.name = studentName;
        this.grades = new ArrayList<>();

    }
//        getters
        public ArrayList getGrade(){return grades;};


        public String getName(){ return name;}




        public void addGrade(int grade) {grades.add(grade);};


        public double getGradeAverage() {

            double i;
            for (i = 0; i < grades.size(); i++) {

            }
            return grades.size() * i;

        }

    public static void main(String[] args) {
        Student Michael = new Student("Michael") ;
        Student John = new Student("John");

        John.addGrade(80);

        System.out.println();
//        ArrayList<Integer> grades = new ArrayList<>();

        Michael.addGrade(80);
        Michael.addGrade(70);
        Michael.addGrade(90);

        System.out.println(Michael.getName()+Michael.grades);
        System.out.println(Michael.getGradeAverage());

    }




    };



