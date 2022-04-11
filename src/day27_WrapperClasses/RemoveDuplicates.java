package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr ={1,1,1,1,1,2,2,2,3,3,3,4,4,4,5};

        arr = removeDuplicates(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println("-------------------------------------------");

        String[] words = {"Java","Java","C#", "Java","Python"};

        words= removeDuplicates(words);

        System.out.println(Arrays.toString(words));

        System.out.println("--------------------------------------------");

        int[] numbers = {1,1,1,1,2,2,2,3,3,3,4,4,4,6,6,5,5};

       // numbers= Arrays.stream(numbers).distinct().toArray();

       // System.out.println(Arrays.toString(numbers));


    }



    public static int[] removeDuplicates(int[] array){

        int[] result= {};  // temporary value of the new array

        for (int each : array) {
            if (!ArraysUtility.contains(result, each)) {   // if the result doesn't contain each element
                result = ArraysUtility.addElement(result, each);   // then add the element in the new array (result)
            }
        }
        return result;

    }

    public static double[] removeDuplicates(double[] array){

        double[] result= {};  // temporary value of the new array

        for (double each : array) {
            if (!ArraysUtility.contains(result, each)) {   // if the result doesn't contain each element
                result = ArraysUtility.addElement(result, each);   // then add the element in the new array (result)
            }
        }
        return result;

    }

    public static char[] removeDuplicates(char[] array){

        char[] result= {};  // temporary value of the new array

        for (char each : array) {
            if (!ArraysUtility.contains(result, each)) {   // if the result doesn't contain each element
                result = ArraysUtility.addElement(result, each);   // then add the element in the new array (result)
            }
        }
        return result;

    }

    public static String[] removeDuplicates(String[] array){

        String[] result= {};  // temporary value of the new array

        for (String each : array) {
            if (!ArraysUtility.contains(result, each)) {   // if the result doesn't contain each element
                result = ArraysUtility.addElement(result, each);   // then add the element in the new array (result)
            }
        }
        return result;

    }



}
