package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumbers {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);  // if we create Scanner object inside the loop, loop will repeat 10 times, extra memory.
                                               // one Scanner object outside the loop, it's enough
        int [] numbers= new  int[10];

        for (int i = 0; i < numbers.length; i++) {  // user will enter a number 10 times
            System.out.println("Enter a number:");
            numbers[i] = scan.nextInt();  // each user entered input will be assigned to the indexes of the array numbers
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] > max ){
                    max= numbers[i];
            }

            if(numbers[i]< min){
                min= numbers[i];
            }

        }
        System.out.println("numbers = " + Arrays.toString(numbers) );
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        








    }
}
/*
    3. Write a program that asks user to enter a number 10 times:

        1. store all user entered numbers in an array
        2. find the max number
        3. find the min number

 */
