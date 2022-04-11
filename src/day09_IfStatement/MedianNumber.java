package day09_IfStatement;

public class MedianNumber {

    public static void main(String[] args) {

        int a =10,
                b = 20,
                c = 30;
       //                 a= 15, b= 10, c=20    a= 15, c=10   b= 20
        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);

        /*
        in order for a to be the median number:
        1. If c is the maximum number & b is the minimum number, then a is the median number
        2. If b is the "          "   &  c  "            "     , then a is the median number
         */


        //                b=15, a= 20,   c=10     b=15, a=10, c=20
        boolean bIsMedian = (b > c && b < a) || (b > a && b <c);

        /*
        in order for b to be the median number:
        1. If b is the maximum number & c is the minimum number, then b is the median number
        2. If c is the minimum number & b is the minimum number, then b is the median number
         */

        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if (aIsMedian) {  // if a is the median number

            System.out.println(a+ " is the median number");

        }

        if (bIsMedian){    // if b is the median number

            System.out.println(b+ " is the median number");
        }

        if (cIsMedian){    // if c is the median number

            System.out.println(c+" is the median number");
        }





    }
}


                 /*
                 2. Create a class called MedianNumber. write a program that can find
                    the median number between three DIFFERENT given integers
                               Ex:
                               a = 10, b= 15, c = 20;

                               Output:
                            15 is the median number

                            Posibility #1: a could be median number
                            Posibility #2: b could be median number
                            Posibility #3: c could be median number
                  */