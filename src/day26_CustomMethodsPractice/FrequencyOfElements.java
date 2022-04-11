package day26_CustomMethodsPractice;

import day02_HelloWorld.JavaComponents;

public class FrequencyOfElements {

    public static void main(String[] args) {

        int[] arr = {1,1,1,11,1,2,3,3,3,4,4,1,1,1,1};
        int n = frequencyOfElements(arr, 1);
        System.out.println( n);

        System.out.println("------------------------------------------------");

        char[] arr1= {'A','B','C','C','A','C','C','D'};
        int n1= frequencyOfElements(arr1,'C');
        System.out.println(n1);

        System.out.println("------------------------------------------------");

        String[] names = {"Esra","Ilhan","Omer","Java","Java"};
        int n2= frequencyOfElements(names, "Java");
        System.out.println(n2);

        System.out.println("------------------------------------------------");

        double[] arr3= {1.5,2.5,3.5,1.5,1.5};
        int n3=frequencyOfElements(arr3, 1.5);
        System.out.println(n3);



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
            if(each.equals(element)){
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















}
