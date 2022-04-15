package day34_GarbageCollection_AccessModifiers.day39_Recap.shapeTask;

public class Square extends Shape {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {  // setting is responsible for setting the private variable
        if( side<=0){
            System.err.println("Invalid side "+side);
            System.exit(1);
        }
        this.side = side;
    }

    public Square( double side) {
        super("Square");
        setSide(side);  // if we don't use setSide(side) instead of this.side= side;, when we enter -100, this value will be accepted. So, we should call "setting"
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area='" + area() + '\'' +   // I added manually
                ", perimeter='" + perimeter() + '\'' +  // *i added manually
                '}';
    }
}
