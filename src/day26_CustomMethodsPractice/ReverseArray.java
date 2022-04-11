package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr= {1,2,3,4};

        int[] result = reverse(arr);

        System.out.println(Arrays.toString(result));
    }



    // reverses the given array, returns a new array
    public static int[] reverse(int[] array){

        int[] result = new int[array.length];

        int j = 0;
        for (int i = array.length -1; i >=0; i--){          // other solution
            result[j++] = array[i];
        }
        return result;
        }

    // reverses the given array, returns a new array
    public static double[] reverse(double[] array){

        double[] result = new double[array.length];

        int j = 0;  // j: index number of new array
        for (int i = array.length -1; i >=0; i--){          // other solution
            result[j++] = array[i];
        }
        return result;
    }

    // reverses the given array, returns a new array
    public static char[] reverse(char[] array){

        char[] result = new char[array.length];

        int j = 0;
        for (int i = array.length -1; i >=0; i--){          // other solution
            result[j++] = array[i];
        }
        return result;
    }

    // reverses the given array, returns a new array
    public static String[] reverse(String[] array){

        String[] result = new String[array.length];

        int j = 0;
        for (int i = array.length -1; i >=0; i--){          // other solution
            result[j++] = array[i];
        }
        return result;
    }




}




