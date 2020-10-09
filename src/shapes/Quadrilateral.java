package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

//    constructor
    public Quadrilateral(double lengthIn, double widthIn) {
        this.length = lengthIn;
        this.width = widthIn;
            }
    //methods
    public double getWidth(){
            return this.width;
    }
    public double getLength(){
            return this.length;
    }
//abstract methods

    public abstract void setLength(double lengthIn);
    public abstract void setWidth(double widthIn);



};
