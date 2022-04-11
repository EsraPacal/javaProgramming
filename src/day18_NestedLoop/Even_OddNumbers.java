package day18_NestedLoop;

import java.util.Scanner;

public class Even_OddNumbers {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String answer=" ";

       while(true) {   // it' s put "true" here, because,  we don't know how many times loop will repeate...!
           System.out.println("Enter a number: ");

           int num = scan.nextInt();

           if (!(num % 2 == 0)) {
               System.out.println("Odd number");
           } else {
               System.out.println("Even number");
           }

           System.out.println();

           System.out.println("Would you like to enter another number?");

           answer = scan.next().toLowerCase();

           while(!(answer.equals("yes") || (answer.equals("no"))) ) {   // if the answer is invalid (not yes or not no)

               System.err.println("Please re-enter, Would you like to enter another number?");
               answer = scan.next().toLowerCase();
           }

           if(answer.equals("no")){
               break;
           }

       }



    }
}
/*
    Write a program that asks user to enter a numnber , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
        if user enters yes, repeat the previous steps
        if user enters no, print nothing

        If user enteres invalid answer, repeat the previous steps

 */

