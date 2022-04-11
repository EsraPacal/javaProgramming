package day07_Operators;

public class ArithmeticOperators {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;

        int division = num1 / num2;     //int division = 10/3; -- division variable contains the result of num1 divided by
         int remainder = num1 % num2;   // int remainder = 10%3; ---- remainder variable contains the remainder of num1 divided by
        // 10 divide by 3 is equal to 3 with a remainder of 1


        System.out.println( num1 + " divided by " + num2 + " is equal to " + division + " with a remainder of " + remainder );

        System.out.println("-----------------------------------------------------------------------");

        int num3 = 25;
        int num4 = 4;

        int division1 = num3 / num4;
        int remainder1 = num3 % num4;

        System.out.println(remainder1);


    }
}
