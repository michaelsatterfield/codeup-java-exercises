package shapes;

public class Rectangle {
    protected double length;
    protected double width;
//constructors
    public Rectangle(double lengthIn, double widthIn) {
        this.length = lengthIn;
        this.width = widthIn;
    }

//methods
    public double getPerimeter(){
       return (2 * this.length) + (2 * this.width);


    }
    public double getArea(){
        return this.length * this.width;

    }


}
