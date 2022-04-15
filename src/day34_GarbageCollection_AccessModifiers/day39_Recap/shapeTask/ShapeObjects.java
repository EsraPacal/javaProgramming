package day34_GarbageCollection_AccessModifiers.day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(8);

        System.out.println(square);

        System.out.println(square.getName());

        square.setSide(6);   // refactor the value
        System.out.println(square);   // refactor the value


        System.out.println("------------------------------------------------------");

        Rectangle rectangle = new Rectangle(4,12);

        System.out.println(rectangle);


        rectangle.setLength(8);
        System.out.println(rectangle.getLength());  // 8.0
        rectangle.setWidth(2);
        System.out.println(rectangle);

        System.out.println("-------------------------------------------------------");

        Circle circle = new Circle(12);

        System.out.println(circle);

        circle.setRadius(9);

        System.out.println(  circle.getName() );
        System.out.println( circle.getRadius() );

        System.out.println(circle);
    }
}
