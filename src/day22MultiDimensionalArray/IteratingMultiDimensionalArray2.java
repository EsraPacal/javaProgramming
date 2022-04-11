package day22MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray2 {

    public static void main(String[] args) {

        int[][] arr2D = { {1, 2, 3} , {4, 5, 6, 7} , {8, 9, 10, 11, 12} };

        for (int i = arr2D.length - 1; i >= 0; i--) {   // i: index num of 1D arrays starting from last index to 0

            //System.out.println(Arrays.toString(arr2D[i]));

            for (int i1 = 0; i1 < arr2D[i].length; i1++) {  // i1: index num of elements starting from 0

                System.out.print(arr2D[i][i1]+" ");

            }

            System.out.println();  // printing all the elements of an array in the same line but the others in different line

            }

        System.out.println("--------------------------------------------------");

        for (int i = 0; i < arr2D.length; i++) {

            for (int i1 = arr2D[i].length - 1; i1 >= 0; i1--) {

                System.out.print(arr2D[i][i1]+" ");

            }
            System.out.println();


        }

        System.out.println("--------------------------------------------");

        for (int i = arr2D.length - 1; i >= 0; i--) {

            for (int i1 = arr2D[i].length - 1; i1 >= 0; i1--) {

                System.out.print(arr2D[i][i1]+" ");

            }

            System.out.println();

        }

        }

}
