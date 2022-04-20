package day42_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        System.out.println("Enter your age");

        int age = new Scanner(System.in).nextInt();

        if(age<0){

            throw new InputMismatchException("Age can not be negative: "+ age);  // manually creating an exception
            /*
            System.err.println("Invalid age");        // previous way ===> exit methodk
            System.exit(1);

             */
        }

        if(age>21){
            System.out.println("You are eligible");
        }else{
            throw new RuntimeException("You must be at least 21 years old");    // manually creating an exception
        }

    }
}
