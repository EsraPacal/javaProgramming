package day34_GarbageCollection_AccessModifiers.day39_Recap.shapeTask;

public class Rectangle extends Shape {

    private double width, length;

    public double getWidth() {
        return width;
    }

    // setter and getter for setting information
    public void setWidth(double width) {
        if (width<=0){
            System.err.println("Invalid width: "+width);
            System.exit(1);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<=0){
            System.err.println("Invalid length: "+length);
            System.exit(1);
        }
        this.length = length;
    }

    public Rectangle(double width, double length) {
        super("Rectangle");
        setWidth(width);
        setLength(length);
    }

    // methods of the parent class with implementation
    @Override   // overriding the methods of the super class
    public double area() {
        return width*length;  // implementation
    }

    @Override  // overriding the methods of the super class
    public double perimeter() {
        return 2*width*length;   // implementation
    }

    // toString method by adding manually area and perimeter
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
