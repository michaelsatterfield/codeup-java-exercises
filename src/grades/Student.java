package grades;

import java.util.ArrayList;
import java.util.List;


public  class Student {

    private  String name;
    private ArrayList<Integer> grades;

    // constructors(create a new student)
        public  Student(String studentName) {
        this.name = studentName;
//     empty array list!
        this.grades = new ArrayList<>();
    }


//     getters
        public String getName(){ return this.name;}

        public ArrayList getGrade(){return this.grades;};

//••••••method for adding grade•••••••
        public void addGrade(int grade){
            grades.add(grade);
        };
//average grade

        public double getGradeAverage() {

            double sum = 0;
            for(int grade:this.grades){
                sum += grade;
            }
            return sum/ this.grades.size();
        }

    public static void main(String[] args) {
//            !!!!!!new instance of Student object!!!!!
        Student Michael = new Student("Michael") ;
        Michael.addGrade(80);
        Michael.addGrade(70);
        Michael.addGrade(90);


        Student John = new Student("John");
        John.addGrade(80);

        System.out.println();




        System.out.println(Michael.getName()+Michael.grades);
        System.out.println(Michael.getGradeAverage());

    }




    };



