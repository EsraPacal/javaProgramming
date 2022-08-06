package day46_Polymorphism;

import day43_Abstraction.employee.Employee;
import day43_Abstraction.employee.Tester;
import day44_Abstraction_Interface.animalTask.Animal;
import day44_Abstraction_Interface.animalTask.Cat;
import day44_Abstraction_Interface.animalTask.Dog;
import day45_Abstraction.shape.*;

public class PolymorphismIntro {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        Integer n1 = 2;

        Double n2 = 5.5;

        Boolean r1 = true;

        Object[] array = {str, n1, n2, r1, new Circle(4), new Square(7)};


        /*

                  WebDriver driver; // parent of drivers


                  driver = new CromeDriver;

                  driver = new FireFoxDriver;

         */

        System.out.println("--------------------------------------------------------------");

        Employee employee = new Tester("Sevil",35,'M',55,"SDET",60000);
        employee.work();
        // employee.bugReport();

        Animal animal = new Dog("Max","Doberman",'M',2,"Medium","White");

        animal.eat();      // we can only call the methods of Animal class not those of Dog class
        animal.drink();
       // animal.bark();
       // animal.play();   // we can only call the methods of Animal class not those of Dog class


        Animal animal2 = new Cat("Catty","Persian Cat",'F',1,"Small","Yellow");
        animal.eat();
        animal.drink();
       // animal.play();


        System.out.println();
        Shape shape = new Circle(5);
        shape.area();       // we can only call the methods of Animal class not those of Dog class

        // System.out.println(shape.getRadius());
        // System.out.println(shape.PI);                 // we can only call the methods of Animal class not those of Dog class

        boolean isSquare = shape instanceof Square;
        boolean isRectangle = shape instanceof Rectangle;
        boolean isTriangle = shape instanceof Triangle;
        boolean isCircle = shape instanceof Circle;

        System.out.println("isSquare = " + isSquare);
        System.out.println("isRectangle = " + isRectangle);
        System.out.println("isTriangle = " + isTriangle);
        System.out.println("isCircle = " + isCircle);


    }
}
