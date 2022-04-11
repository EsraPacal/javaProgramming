package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        int maxNum = 0;   // min num for int: -2147483648
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5 ; i++) {     // created for repeating the statement which the user will follow
            System.out.println("Enter a number:");
            int num = scan.nextInt();

            if(num > maxNum) {
                maxNum = num;  // If the number that user entered is greater than the maxnumber given in the  variable,
                               // then the maxnum given in variable will be assigned to the entered (max) number.
                               // otherwise, it will not be assigned. So maxnum in variable is not changed
            }

        }

        System.out.println("maxNum = " + maxNum);

    }
}

/*
Write a program that the users to enter a number for 5 times.
return the maximum number
 */
