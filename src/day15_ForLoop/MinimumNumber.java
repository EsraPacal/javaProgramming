package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner scan =new Scanner (System.in);

        int minNum= 2147483647; // (max num for int(2147483647))  // any number that user enter will be less than this number.

        for (int i = 10; i < 15; i++) {   // The statement will be repeated for 5 times.
            // but if we use i-- instead of i++ for this condition , repeat will last without STOP...

            System.out.println("Enter a number:");

            int num= scan.nextInt();

            if (num < minNum){
                minNum = num;

            }

        }

        System.out.println("minNum = " + minNum);
    }

}
