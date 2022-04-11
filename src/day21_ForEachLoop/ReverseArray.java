package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};
        //               0   1   2   3
        int[] reversed = new int [numbers.length];  // to make sure that the array has enough capacity all the elements of first array

        /*
        reversed[0] = numbers[numbers.length-1];   // Or ======>   = numbers[3];
        reversed[1] = numbers[2];
        reversed[2] = numbers[1];
        reversed[3] = numbers[0];

        System.out.println(Arrays.toString(reversed));

         */

        for (int i = numbers.length-1, j =0; i >=0 ;  i--, j++) {
            reversed[j]=numbers[i];

        }
        System.out.println(Arrays.toString(reversed));


        System.out.println("------------------------------------------------");

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6};

        int[] arr3 = {0};

        for (int each  : arr1  ) {


        }


    }
}


/*
 1. write a program that can merge two arrays of integers
		Ex:
			arr1 = {1,2,3,4}
			arr2 = {5,6}

		output
			arr3 = {1,2,3,4,5,6}
 */