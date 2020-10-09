package shapes;

public class ShapesTest {
    public static void main(String[] args) {


//        can create an array ..to not repeat.
        Rectangle[] group = new Rectangle[2];


        group[0] = new Rectangle(4, 5);

//        or..is same as above (for grouping)
//
//
//        Rectangle box1 = new Rectangle(4,5);
////                           |polymorhpism...(data types are related)
//        Rectangle box2 = new Square(5);
//
//        System.out.println("box1.getArea() = " + box1.getPerimeter());
//        System.out.println("box2.getPerimeter() = "+ box2.getPerimeter());
//    }
        System.out.println("first with a rectangle");
        Measurable myShape = new Rectangle(3,4);
        System.out.println(myShape.getArea());
        System.out.println( myShape.getPerimeter());

        System.out.println("now a square");
        myShape = new Square(7);
        System.out.println(myShape.getArea());
        System.out.println( myShape.getPerimeter());
    }
}
