package day25CustomMethods_Overloading;

import java.util.Arrays;

public class MethodOverloading {

    public static void main(String[] args) {

        int[] intArray = {5, 6, 7, 0, 2};

        double[] doubleArray = {10.5,11.5, 5.5, 4.5};

        char[] charArray = {'E','F', 'B','D','C','A'};

        Arrays.sort(charArray);

        System.out.println("-----------------------------------------------------");


       // sum of 10 , 20
       int sum1 = sumOfNumbers(10,20);

       // sum of 10, 20, 30
        int sum2 = sumOfNumbers(10,20,30);

        // sum of 10, 20, 30, 40
        int sum3 = sumOfNumbers(10, 20, 30, 40);

        // sum of 15.2 and 32.1
        double sum4 = sumOfNumbers(15.2,32.1 );

        // sum of 5.5, 6.5, 4.5
        double sum5 = sumOfNumbers(4.5, 5.5, 6.5);

        // sum of 8.5,6.5, 2.5, 1.5
        double sum6 = sumOfNumbers(8.5,6.5,2.5,1.5);

    }

    public static int sumOfNumbers(int num1, int num2)  {
        return num1+num2;
    }

    public static double sumOfNumbers(double num1, double num2){
        return num1+num2;
    }

    public static int sumOfNumbers(int num1, int num2, int num3)  {
        return num1+num2+num3;
    }

    public static double  sumOfNumbers(double num1, double num2, double num3){
        return num1+num2+num3;
    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4) {
        return num1+num2+num3+num4;
    }

    public static double sumOfNumbers(double num1, double num2, double num3, double num4){
        return sumOfNumbers(num1,num2,num3)+num4;
    }


}
