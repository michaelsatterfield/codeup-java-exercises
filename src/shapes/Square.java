package shapes;

public class Square extends Rectangle{
//    default constructor
    public Square(double side){
        super(side,side);

    }
    @Override
    public double getArea(){
        return Math.pow(this.width,2);
    }
    @Override
    public double getPerimeter(){
        System.out.println("square perim");
        return 4 *this.length;
    };

}
