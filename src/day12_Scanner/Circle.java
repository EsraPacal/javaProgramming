package day12_Scanner;

import java.util.Scanner;

public class Circle {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);    // if it's used "scan" right here, we have to close the scanner with "scan"
                                                  // OR for "scanner input", we have to close whit "input.close"
        System.out.println("Enter the radius of the circle: ");

        double radius = scan.nextDouble();
        
        
        double pI= 3.14;
        double area= radius *radius * pI;
        double perimeter = 2 * radius * pI;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        scan.close();
        
        
        





    }
}

            /*
            1. Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
             */