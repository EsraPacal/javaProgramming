package utilities;

import java.util.Arrays;

public class ArraysUtility {

    // prints each integer of an array in separate lines
    public static void printEachElementElement(int[] array) {

        for (int each : array) {
            System.out.println(each);
        }
    }


    // prints each double of an double array in separate lines
    public static void printEachElement(double[] array) {

        for (double each : array) {
            System.out.println(each);
        }
    }


    // prints each char of a char array in separate lines
    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }


    // prints each string of a string array in separate lines
    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }



    // returns the max number for integer array
    public static int max(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    // returns the max number for double array
    public static double max(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }


    // returns the min number for int array
    public static int min(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    // returns the min number for double array
    public static double min(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];

    }



    //checks if the given integer is contained in the given array. returns boolean. contains(int[], int)
    public static boolean contains(int[] array, int element) {
        boolean result = false;

        for (int each : array) {   // getting all the elements of array
            if (each == element) {    // checks if the given element is matching with the elements of array or not
                result = true;
            }
        }
        return result;
    }

    //checks if the given double is contained in the given array. returns boolean. contains(double[], double)
    public static boolean contains(double[] array, double element) {
        boolean result = false;

        for (double each : array) {
            if (each == element) {
                result = true;
            }

        }
        return result;
    }

    //checks if the given char is contained in the given array. returns boolean. contains(char[], char)
    public static boolean contains(char[] array, char element) {
        boolean result = false;

        for (char each : array) {
            if (each == element) {
                result = true;
            }

        }
        return result;
    }

    //checks if the given String is contained in the given array. returns boolean. contains(String[], String)
    public static boolean contains(String[] array, String element) {
        boolean result = false;

        for (String each : array) {
            if (each.equalsIgnoreCase(element)) {     // for the String we need to use equals()
                result = true;
            }

        }
        return result;


    }



    //1. create a return method called addInteger that can add an Integer  after the  last index of an integer array
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length +1];

        int i = 0;  // the value of the new element

        for (int each : array){  // in order to find each element of array

            result[i++] = each;  // to add each element to the new i
        }

        result[i] = element;

        return  result;
    }

    // 2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addElement (double[] array, double element) {
        double[] result = new double[array.length +1];

        int i = 0;  // the value of the new element

        for (double each : array){  // in order to find each element of array

            result[i++] = each;  // to add each element to the new i
        }

        result[i] = element;

        return result;

    }

    // 3. create a return method called addString that can add a String after the last index of a String array
    public static String[] addElement(String[] array, String element){

        String[] result = new String[array.length +1];

        int i= 0;

        for(String each : array){

            result[i++]= each;

        }
        result[result.length-1 ] = element;
        //result[i] = element;

        return result;


    }

    //4. create a return method called addChar that can add a char after last index of a char array
    public static char[] addElement(char[] array, char element){

        char[] result = new char[array.length +1];

        int i= 0;

        for(char each : array){

            result[i++]= each;

        }
        result[result.length-1 ] = element;
        //result[i] = element;

        return result;


    }



    // returns the frequency of the given element from the given array
    public static int frequencyOfElements(int[] array, int element){  // frequency number is always "int"
        int count = 0;
        for (int each : array) {
            if(each== element){
                count++;
            }

        }
        return count;

    }

    // returns the frequency of the given element from the given array
    public static int frequencyOfElements(char[] array, char element){  // frequency number is always "int"
        int count = 0;
        for (char each : array) {
            if(each== element){
                count++;
            }

        }
        return count;

    }

    // returns the frequency of the given element from the given array
    public static int frequencyOfElements(String[] array, String element){  // frequency number is always "int"
        int count = 0;
        for (String each : array) {
            if(each.equals(element) ){   // in string, we use equal.() instead of  "==" !
                count++;
            }

        }
        return count;

    }

    // returns the frequency of the given element from the given array
    public static int frequencyOfElements(double[] array, double element){  // frequency number is always "int"
        int count = 0;
        for (double each : array) {
            if(each== element){
                count++;
            }

        }
        return count;

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



    public static int[] removeElement(int [] array, int index){

        if(index<0 || index > array.length-1){

            System.err.println("Invalid Index:"+index);
            System.exit(0);   // terminated the prog if the condition is true
        }

        int[] result= new int[array.length-1];   // 1,2

        int j= 0;
       /*  // if we remove a given index non-duplicated, recommended using "for each loop", else,  regular for loop in the case of duplicated elements

        for (int each : array) {
            if(each==array[index]){
                continue;   // skip the given index number in the array of if statement and continue adding the others
            }
            result[j++] = each; // indexes of the new array
        }

        */

        for (int i = 0; i < array.length; i++) {
            if(i==index){  //if the index of array is matching with the given index
                continue; // skip them and continue adding the other
            }
            result[j++] = array[i];
        }
        return result;
    }

    public static double[] removeElement(double [] array, int index){  // index num is always in integer  !!!!!!

        if(index<0 || index > array.length-1){

            System.err.println("Invalid Index:"+index);
            System.exit(0);   // terminated the prog if the condition is true
        }

        double[] result= new double[array.length-1];   // 1,2

        int j= 0;   // index num is always integer
       /*  // if we remove a given index non-duplicated, recommended using "for each loop", else,  regular for loop in the case of duplicated elements

        for (double each : array) {
            if(each==array[index]){
                continue;   // skip the given index number in the array of if statement and continue adding the others
            }
            result[j++] = each; // indexes of the new array
        }

        */

        for (int i = 0; i < array.length; i++) {
            if(i==index){  //if the index of array is matching with the given index
                continue; // skip them and continue adding the other
            }
            result[j++] = array[i];
        }
        return result;
    }

    public static char[] removeElement(char [] array, int index){

        if(index<0 || index > array.length-1){

            System.err.println("Invalid Index:"+index);
            System.exit(0);   // terminated the prog if the condition is true
        }

        char[] result= new char[array.length-1];   // 1,2

        int j= 0;


        for (int i = 0; i < array.length; i++) {
            if(i==index){  //if the index of array is matching with the given index
                continue; // skip them and continue adding the other
            }
            result[j++] = array[i];
        }
        return result;
    }

    public static String[] removeElement(String [] array, int index){

        if(index<0 || index > array.length-1){

            System.err.println("Invalid Index:"+index);
            System.exit(0);   // terminated the prog if the condition is true
        }

        String[] result= new String[array.length-1];   // 1,2

        int j= 0;
       /*  // if we remove a given index non-duplicated, recommended using "for each loop", else,  regular for loop in the case of duplicated elements

        for (int each : array) {
            if(each==array[index]){
                continue;   // skip the given index number in the array of if statement and continue adding the others
            }
            result[j++] = each; // indexes of the new array
        }

        */

        for (int i = 0; i < array.length; i++) {
            if(i==index){  //if the index of array is matching with the given index
                continue; // skip them and continue adding the other
            }
            result[j++] = array[i];
        }
        return result;
    }



    // merge the given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = {};

        for (int each : arr1) {
            result=  ArraysUtility.addElement(result, each);

        }
        for (int each : arr2) {
            result= ArraysUtility.addElement(result, each);

        }
        return  result;
    }

    // merge the given two arrays and returns the new array
    public static double[] merge(double[] arr1, double[] arr2){
        double[] result = {};

        for (double each : arr1) {
            result=  ArraysUtility.addElement(result, each);

        }
        for (double each : arr2) {
            result= ArraysUtility.addElement(result, each);

        }
        return  result;
    }

    // merge the given two arrays and returns the new array
    public static char[] merge(char[] arr1, char[] arr2){
        char[] result = {};

        for (char each : arr1) {
            result=  ArraysUtility.addElement(result, each);

        }
        for (char each : arr2) {
            result= ArraysUtility.addElement(result, each);

        }
        return  result;
    }

    // merge the given two arrays and returns the new array
    public static String[] merge(String[] arr1, String[] arr2){
        String[] result = {};

        for (String each : arr1) {
            result=  ArraysUtility.addElement(result, each);

        }
        for (String each : arr2) {
            result= ArraysUtility.addElement(result, each);

        }
        return  result;
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



    // replace the element of the array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement){

        if ( index <0 || index > array.length-1){
            System.err.println("Invalid Index:" +index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }
    // replace the element of the array at given index with the new element
    public static double[] replace(double[] array, int index, double newElement){   // index is always integer

        if ( index <0 || index > array.length-1){
            System.err.println("Invalid Index:" +index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }
    // replace the element of the array at given index with the new element
    public static char[] replace(char[] array, int index, char newElement){

        if ( index <0 || index > array.length-1){
            System.err.println("Invalid Index:" +index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }
    // replace the element of the array at given index with the new element
    public static String[] replace(String[] array, int index, String newElement){

        if ( index <0 || index > array.length-1){
            System.err.println("Invalid Index:" +index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
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