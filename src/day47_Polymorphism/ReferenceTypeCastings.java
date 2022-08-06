package day47_Polymorphism;

import day43_Abstraction.employee.Employee;
import day43_Abstraction.employee.Person;
import day43_Abstraction.employee.Tester;
import day44_Abstraction_Interface.animalTask.Animal;
import day44_Abstraction_Interface.animalTask.Cat;
import day44_Abstraction_Interface.animalTask.Dog;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;

public class ReferenceTypeCastings {

    public static void main(String[] args) {


        //   Shape shape = (Shape) new Circle(4); //upcasting

        Shape shape2 = new Circle(5);

        // WebDriver driver = (WebDriver) new ChromeDriver();

        // Dog  dog2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");;
        //  Dog dog3 = dog2;


        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        //   Dog dog = (Dog)animal; // down-casting ====> if we need to use it more than oce, it's NOT the best way
        //  dog.bark();

        System.out.println( animal.getName() );    // if we need to use it more than oce, it's not the best way
        // System.out.println( dog.getName() );

        (  (Dog)animal  ).bark();


        Shape shape1 = new Square(5);  // it has already been initialized at the beginning

        System.out.println( ((Square) shape1).getSide() +": side of square" );  // in order to get the size of Square subclass, we need the down-casting


        System.out.println("---------------------------------------------------");

        Animal animal2 = new Cat("Jim", "Scottish", 'M', 3, "Small", "White");

        //Cat cat = (Cat) animal2;
        // cat.meow();

        ( (Cat) animal2 ).meow();

        // ( (Dog) animal2 ).bark();   // ClassCastException ====> In the Cat class, no bark() method

        System.out.println("---------------------------------------------------");

        Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);

        ( (Tester)employee ).bugReport();

        //  ( (Tester)employee ).unitTest();  // unitTest() ===> is the method of Dev. class ===> compile error

        //  ( (Developer)employee ).unitTest();  // ClassCastException

        //  Driver driver = (Driver) employee;  // line 1       // Tester class can not cast the Driver class... No IS A relationship between them
        Person person = (Person) employee; // line 2        //  upcasting ===> IS A relationship between Tester and Person classes
        //  Teacher teacher = (Teacher) employee; // line 3     //Tester class can not cast the Teacher class... No IS A relationship between them

        System.out.println("----------------------------------------------------");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();

        //  ( (Cube)s1 ).volume();   // ClassCastException   ===> no IS A relationship

        









    }


}
