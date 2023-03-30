package shape;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(String name, double length, double width){
        super(name);
        this.length = length;
        this.width = width;
    }
    public String toString(){
        return super.toString() + length + " " + width;
    }

    public double getPerimeter(){
        return 2 * length + 2 * width;
    }
    public double getArea(){
        return length * width;
    }
}
