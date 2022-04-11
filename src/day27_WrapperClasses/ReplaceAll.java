package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {

        int[] array = {10,20,30,40,10,10,30,40,30};
        //              0  1  2  3  4  5  6  7  8
        array= replaceAll(array, 30,300);   // a new array

        System.out.println(Arrays.toString(array));

        array =replaceAll(array,300,500 ) ;

        System.out.println(Arrays.toString(array));

        System.out.println("-------------------------------------------------");



    }

    // replaces all the matching old values of the array with the new value
    public static int[] replaceAll(int[] array, int oldValue, int newValue){

        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldValue){  // matching  all the elements with old value
                array[i]= newValue;   // then replace it with new value
            }

        }
        return array;
    }

    // replaces all the matching old values of the array with the new value
    public static double[] replaceAll(double[] array, double oldValue, double newValue){

        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldValue){  // matching  all the elements with old value
                array[i]= newValue;   // then replace it with new value
            }

        }
        return array;
    }

    // replaces all the matching old values of the array with the new value
    public static char[] replaceAll(char[] array, char oldValue, char newValue){

        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldValue){  // matching  all the elements with old value
                array[i]= newValue;   // then replace it with new value
            }

        }
        return array;
    }

    // replaces all the matching old values of the array with the new value
    public static String[] replaceAll(String[] array, String oldValue, String newValue){

        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(oldValue) ){  // matching  all the elements with old value
                array[i]= newValue;   // then replace it with new value
            }

        }
        return array;
    }

}
