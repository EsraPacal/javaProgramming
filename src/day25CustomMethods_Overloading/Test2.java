package day25CustomMethods_Overloading;

import utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};

        ArraysUtility.printEachElementElement(arr1);

        System.out.println("----------------------------------------");

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};

        ArraysUtility.printEachElement(arr2);

        System.out.println("_________________________________________");

        char[] arr3 = {'A', 'B', 'C','D'};

        ArraysUtility.printEachElement(arr3);

        System.out.println("------------------------------------------");

        String[] arr4 = {"Esra", "Orhan", "Omer", "Ilhan"};

        ArraysUtility.printEachElement(arr4);

        System.out.println("------------------------------------------");
        
        int[] n1 = {1, 2, 3, 4,5,6};
        
        int max1 = ArraysUtility.max(n1);

        System.out.println("max1 = " + max1);

        System.out.println("------------------------------------------");
        
        double[] n2 = {2.3,5.5,9.2, 6.5};
        
        double max2 = ArraysUtility.max(n2);

        System.out.println("max2 = " + max2);

        System.out.println("--------------------------------------------");

        int[] a1 = {1,2,3,4,5,6,7};

        boolean result1 = ArraysUtility.contains(a1,5);

        System.out.println("result1 = " + result1);
    }

}
