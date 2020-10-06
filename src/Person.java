public class Person {
//    has private name property:

   private String name;
   private String age;
   private String gender;




//constructors**************************

   public Person(String personName){
       this.name = personName;
       this.age = "unassigned";
       this.gender = "unassigned";

   }
    public Person(String personName,String personAge){
        this.name = personName;
        this.age = personAge;
        this.gender = "unassigned";
    }
    public Person(String personName,String personAge, String personGender){
        this.name = personName;
        this.age = personAge;
        this.gender = personGender;
    }

// ******methods***

    public void setName(String name){
      this.name = name;
    }

    public String getName(){
       return String.format("name: %s. age: %s, gender: %s", name, age, gender);
    }
    public String sayHello(){
        return String.format("Hello, World my name is %s. I'm %s years old, I am %s.", name, age, gender);
    }


    public static void main(String[] args) {

        Person p1 = new Person("Jon Bitters","35","Male");
        Person p2 = new Person("Itzel Flores",".5", "Female");

        System.out.println(p1.getName());
        System.out.println(p1.sayHello());

    //       person 2
        System.out.println(p2.getName());
        System.out.println(p2.sayHello());

//**********curriculum example of how "Names" dont equate to the actual object created

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);



// ***** curriculum example of object equaling an object with "="

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

// ***** curriculum example of trying to change name not working

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
//        fix "setName" method
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

   }

};

//Understanding references
// The following code blocks make use of the Person class from the previous exercise.
// For each code block, think about what the code will output, then copy the code into
// IntelliJ and run it to see if it matches your expectations.




