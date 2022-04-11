package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        int[] array = {1,1,2,3,3,4,5,5,6,7,7,7};  // arrays's size is fixed
        int[] unique = uniqueElements(array);
        System.out.println(Arrays.toString (unique));

        System.out.println("----------------------------------------------------");

        double[] array2 = {1.5,2.5, 1.5, 3.5, 4.5,4.5,5.5,5.5};
        double[] unique2= uniqueElements(array2);
        System.out.println(Arrays.toString(unique2));

        System.out.println("----------------------------------------------------");

        char[] array3= {'A','B','A','C','C'};
        char [] unique3= uniqueElements(array3);
        System.out.println(Arrays.toString(unique3));

        System.out.println("---------------------------------------------------- ");

        String[] names= {"Esra", "Esra", "Ilhan", "Omer", "Orhan","Orhan"};
        String[] unique4 = uniqueElements(names);
        System.out.println(Arrays.toString(unique4));

    }


    // returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[]array){
        int[] result ={};   // new int [0]   // array size is fixed

        for (int each : array) {
            if(ArraysUtility.frequencyOfElements(array, each)==1){   // if the frequency is 1, the element is unique
                result = ArraysUtility.addElement(result, each);  // a new array object will be created

            }

        }

        return result;
    }

    // returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[]array){
        double[] result ={};   // new int [0]   // array size is fixed

        for (double each : array) {
            if(ArraysUtility.frequencyOfElements(array, each)==1){   // if the frequency is 1, the element is unique
                result = ArraysUtility.addElement(result, each);  // a new array object will be created
            }
        }
        return result;
    }


    // returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[]array){
        char[] result ={};   // new int [0]   // array size is fixed

        for (char each : array) {
            if(ArraysUtility.frequencyOfElements(array, each)==1){   // if the frequency is 1, the element is unique
                result = ArraysUtility.addElement(result, each);  // a new array object will be created
            }
        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[]array){
        String[] result ={};   // new int [0]   // array size is fixed

        for (String each : array) {
            if(ArraysUtility.frequencyOfElements(array, each)==1){   // if the frequency is 1, the element is unique
                result = ArraysUtility.addElement(result, each);  // a new array object will be created
            }
        }
        return result;
    }






}