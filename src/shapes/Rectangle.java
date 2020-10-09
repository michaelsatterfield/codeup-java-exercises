package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width){
        super(length,width);
    }



    @Override
    public void setLength(double lengthIn) {
       this.length = length;
    }

    @Override
    public void setWidth(double widthIn) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.getLength() + 2 * this.getWidth();
    }

    @Override
    public double getArea() {
        return this.getLength() * this.getWidth();
    }

// public Rectangle(double lengthIn, double widthIn){
//     super(lengthIn,widthIn);
// }





}
//
//
//
//    protected double length;
//    protected double width;
//    //constructors
//    public Rectangle(double lengthIn, double widthIn) {
//        this.length = lengthIn;
//        this.width = widthIn;
//    }
//
//    //methods
//    public double getPerimeter(){
//        return (2 * this.length) + (2 * this.width);
//
//
//    }
//    public double getArea(){
//        return this.length * this.width;
//
//    }

