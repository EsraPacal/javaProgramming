package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day31_Constructors.Student;
import day32_Constructor.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {

        /*
        int n = null;
        String str = null;
        System.out.println( str.toUpperCase() );

         */
        // "null" keyword is only for non-primitive data type. there is no way to use instance for this string, because there is no object

        String str = "Wooden Spoon"; // after line 13, "Wooden Spoon" will be eligible for garbage collection
        str = null;

        System.out.println( str );

        Car car1 = new Car("Toyota");
        car1= null;
        System.out.println( car1);

        System.out.println("---------------------------------------------");

        Dog dog1 = new Dog();
        dog1.name = "Lucy";  // after the assignment at line 33, this object is eligible for the garbage collection

        dog1 = new Dog();
        dog1.name = "Max";  // when dog1 at line 30 is assigned to the new object, then it will be eligible for the garbage collection

        System.out.println(dog1);

        String language = "Python";  // eligible for the garbage collection
               language =  "Java";

        System.out.println(language);

        System.out.println("--------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);

        ArrayList<Integer> list2 = list1;  // both object is equal now
        list2.addAll(Arrays.asList(200, 300, 400));  // when we add numbers into the list 2, those numbers are added into the list 1 as well.

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1==list2);

        System.out.println("--------------------------------------------------");

        Student student1 = new Student("Tahir", 30,'M','B',15) ;
        student1.grade='A';

        Student student2 = student1;
        student2.name="Ahmet";

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("------------------------------------------------");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");   // "Java" and "Python"
        
        ArrayList<String> l2 = l1;  // l2 and l1 are the same objects, and they have the same value
        l2.add("Python"); // "Java" and "Python"

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);



    }
}
