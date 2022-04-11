package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        double sum = 0;
        // 1+2+....+100

        for (int i = 0; i < 100; i++) {   // OR  for (int i = 1; i < 101; i++) {
            sum += i;

        }

        System.out.println("sum = " + sum);


        System.out.println("-----------------------------------");


        int total = 0;
        Scanner scan= new Scanner(System.in);

        for (int i = 0; i < 5 ; i++) {    // OR  for (int i = 1; i < 6; i++) {   // for repeating 5 times...

            System.out.println("Enter a number:");
            total += scan.nextInt();


        }
        System.out.println("total = " + total);

        scan.close();

    }
}
