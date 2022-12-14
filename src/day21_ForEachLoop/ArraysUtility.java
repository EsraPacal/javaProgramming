package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};

        System.out.println(nums);  // hashcode
        System.out.println(Arrays.toString(nums) );

        System.out.println(  nums[0]  );

      /*
        String str= "Java";
        System.out.println(str);
        System.out.println(str.toString());

       */

        System.out.println("------------------------------------------------------------");

        int[] scores= {95, 100, 55, 65, 85, 78};

        System.out.println(Arrays.toString(scores));

        Arrays.sort(scores);  // smallest to largest method  // {55 ....... 100}

        System.out.println(Arrays.toString(scores));  // last storage of scores

        System.out.println("Minimum score: " + scores[0]);
        System.out.println("Maximum score: " + scores[scores.length-1]);

        String [] names = {"Esra","Omer","Ilhan","Orhan"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        String[] words ={ "Anna","ANNA"};

        Arrays.sort(words);

        System.out.println(Arrays.toString(words));  // first, the name ANNA will be printed, as the uppercase in ascii table has a smaller number than lowercase

        System.out.println("----------------------------------------------------");

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,3,2};

        boolean r1 = Arrays.equals(arr1, arr2);   // false because the order is not equal

        System.out.println(r1);

        Arrays.sort(arr1);  // {1,2,3}
        Arrays.sort(arr2);  // {1,2,3}

        boolean r2 = Arrays.equals(arr1,arr2);  // true because the order assigned is equal

        System.out.println(r2);

        System.out.println("-----------------------------------------------------");
        
        char[] ch1 = {'a', 'c', 'b'};
        char[] ch2 = {'b', 'a', 'c'};
        
        Arrays.sort(ch1);  // {'a', 'b', 'c'}
        Arrays.sort(ch2);  // {'a', 'b', 'c'}
        
        boolean anagram = Arrays.equals(ch1,ch2);

        System.out.println("anagram = " + anagram);
        



    }
}
