package shape;

abstract class Shape implements ShapeInterface{
    private String name;
    public Shape(String name){
        this.name = name;
    }

    @Override
    public abstract  double getPerimeter();


    public abstract double getArea();
}
