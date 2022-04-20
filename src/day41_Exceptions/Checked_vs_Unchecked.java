package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {


        // unchecked exceptions

        int a= 10;
        int b= 0;

        // System.out.println("Hello World");  ====> the statement will be printed

       // System.out.println(a/b);  // Arithmetic Exception =====> runtime exception ===> unchecked exception

       // System.out.println("Wooden Spoon"); // compile will not print this statement

        char[] characters = {'A','B','C'};
        //                    0   1   2

       // System.out.println(characters[99]); // ArrayIndexOutOfBoundsException =====> runtime exception ==> unchecked exception

        Student student = null; //    =====> null: means that the object is not exist

       // System.out.println(student.getName());  // ===> unchecked exception
       // student.study();

        final String word = "Hello world"; // it will never be eligible for the garbage collector because of "final" keyword

        String str = "Wooden Spoon";  // eligible for garbage collector after reassign str to the null keyword
        str = null;

        // System.out.println( str.toUpperCase() );   // unchecked exception

        String str2= "";  // object != null   but   object == empty
        System.out.println( str2.isEmpty() );  // true



        //-----------------------checked exception -------------------------//

        System.out.println("Hello");

        //Thread.sleep(3000);   // checked exception

        System.out.println("Cydeo");

        // FileInputStream file = new FileInputStream("path of the file");

        System.out.println("Java".charAt(1000));  // unchecked exception


    }
}
