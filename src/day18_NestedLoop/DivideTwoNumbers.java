package day18_NestedLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        /*
   1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.

         */

        int a = 30;
        int b = 7;

        int count= 0;  // fir int, temporariy value is "0", but for String it's "";

        while(a >= b) {
            // System.out.println(a);   // it gives the solution

            a -= b;     // it gets executed as long as the boolean is true
            count++;    // it gives the exact number
        }

        System.out.println(count+" with a remainder of "+a);





    }
}

 /*

        a -= b;   // 30-7=23
        a -= b;   // 23- 7= 16
        a -= b;   // 16-7= 9
        a -= b;   // 9 - 7= 2     execution stops

        */
