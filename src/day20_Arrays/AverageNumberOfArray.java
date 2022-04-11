package day20_Arrays;

import java.util.Scanner;

public class AverageNumberOfArray {

    public static void main(String[] args) {

       /*
        Scanner scan =new Scanner(System.in);

        System.out.println("How many number do you want to enter?");
        scan.nextInt();

        */

        int[] numbers = {10, 55, 85, 60, 80, 10};

        double sum = 0;  // total subtraction of the entered numbers [10+20+65...)

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }

            double averageNumber = sum / numbers.length;
            System.out.println("averageNumber = " + averageNumber);



    }
}
/*
    4. AverageNumber:
        1. Ask the user how many numbers they want to enter
        2. get all the inputs from the user and store them into an array
        3. Iterate the array & return the average number

 */