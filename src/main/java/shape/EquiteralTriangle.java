package shape;

public class EquiteralTriangle extends Shape{
    private double side;
    public EquiteralTriangle(String name, double side){
        super(name);
        this.side = side;
    }
    public String toString(){
        return super.toString() + side;
    }
    public double getPerimeter(){
        return 3 * side;

    }
    public double getArea(){
        return  (1.72/4) * side * side ;
    }
}
