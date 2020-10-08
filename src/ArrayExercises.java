import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ArrayExercises {

//     Method               returns | name
    public static Person[]addPerson(Person[]personArray,Person newPerson ){
//        creates new array with a null (not filled yet)
        Person[] newArray = Arrays.copyOf(personArray,personArray.length + 1);
//        empty item thats get filled
        newArray[newArray.length-1] = newPerson;
//         needs a return because its not a void
        return newArray;

    };

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

//constructors
//      Person objects       |       Constructors
        Person p1 = new Person("jon");
        Person p2 = new Person("maria");
        Person p3 = new Person("jane");

//        instantiate array
        Person[] person = {p1,p2,p3};

//      create new person  (constructor)
        Person p4 = new Person("joann");
//        creating new array
        Person[] y = addPerson(person,p4);
//          iterate with for loop
        for(Person x : y) {
            System.out.println(x.getName());
        }
    }
}


