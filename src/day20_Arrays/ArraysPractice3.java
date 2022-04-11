package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice3 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt();

        if(length<=0){
            System.err.println("Invalid length");
            System.exit(0);
        }

        int [] numbers = new int[length];  // array needs to have enough capacity to contain all the elements that user will enter

        for (int i = 0; i < length ; i++) {   // OR======> (  i<= length -1 ) entering a number
            System.out.println("Enter a number");
           numbers[i] = scan.nextInt();   // 5 // each input user provided during each execution of the loop, will be assigned to the indexes of the array

        }
        System.out.println(Arrays.toString(numbers));


    }
}
