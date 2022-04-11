package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;

    public static ArrayList<Integer> numbers;

   // numbers.add(12);  =========> we can not add numbers directly. we have to do it into the static block

    public Circle(double radius){
        this.radius = radius;
        // pi = 3.14;
    }

   static{    // initialisation of static variable =======> this static block will be executed just one time
        // radius =5; we can not call it or give a value in static block. instance variable
        pi=3.14;
        name= "Circle";

        numbers= new ArrayList<>();
        numbers.add(12);
        numbers.add(20);
    }

    // if we initialize and run the static variables into the same class in which they are created, then we can not use them outside the class
     /*
        public static void main(String[] args) {   // main method also is a static. we can set the static variables

        pi = 3.14;
        name= "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);

    }

      */






}
