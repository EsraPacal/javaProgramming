package day34_GarbageCollection_AccessModifiers.day39_Recap.shapeTask;

public class Circle extends Shape {

    private double radius;   // instance variable
    public  static double pi= 3.14;  // static variable

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) { // getter and setter for giving any additional requirement
        if(radius<=0){
            System.err.println("Invalid Radius: "+radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    // override the methods by implementing
    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return 2*radius*pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi='" + pi + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
