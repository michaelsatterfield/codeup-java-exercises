package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle[] group = new Rectangle[2];
        group[1]  = new Rectangle(4,5);
//        or..is same as above (for grouping)
        Rectangle box1 = new Rectangle(4,5);
//                           |polymorhpism...(data types are related)
        Rectangle box2 = new Square(5);

        System.out.println("box1.getArea() = " + box1.getArea());
        System.out.println("box2.getPerimeter() = "+ box2.getPerimeter());
    }
}
