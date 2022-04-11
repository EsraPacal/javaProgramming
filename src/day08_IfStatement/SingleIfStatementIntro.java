package day08_IfStatement;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        int number = 301;

        /*
        System.out.println("Odd Number");
        System.out.println("Even Number");
        */

        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = ! evenNumber;

        if (evenNumber){

            System.out.println(number + " is even number");
        }

        if (oddNumber){    // NOT even number

            System.out.println(number + " is odd number ");
        }

        System.out.println("_________________________________________________");

        int n = 200;

        //positive
        if (n > 0) {  // if the n is greater than 0, then it's positive.
            System.out.println(n + " is positive");

        }

        // negative
        if (n < 0) {    // if n is less than 0, it's negative numbe

            System.out.println(n + " is negative.");
        }

        // zero
        if (n == 0) {

            System.out.println(n + " is zero");
        }









    }


}


