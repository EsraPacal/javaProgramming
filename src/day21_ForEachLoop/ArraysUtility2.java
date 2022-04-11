package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {

    public static void main(String[] args) {

        String[] students = {"Elif", "Sinem", "Gunay","Cihad","David","Aeron","James","Daniel"};
        String[] earlyBirds = Arrays.copyOf(students,3);   // starting from first ELEMENT number to another ELEMENT num

        System.out.println(     Arrays.toString    (earlyBirds)   );

        System.out.println("-----------------------------------------------------");

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        numbers = Arrays.copyOf(numbers, 5);  // assigning to a new array object // ELEMENT number

        System.out.println(Arrays.toString(numbers));


        System.out.println("-----------------------------------------------------");

        char[] ch1 = {'A','B','C','D','E','F','G','H','I'};
        char[] ch2 = Arrays.copyOfRange(ch1,3,8+1);   // starting from any INDEX number to another excluded INDEX num
                                                 // to: 8 =======> the 8 is not included, it's excluded
        System.out.println(Arrays.toString(ch2));

        System.out.println("-------------------------------------------------------");
        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80,90,100};
         // index:       0   1   2   3   4   5   6   7  8   9
        int[] copies = Arrays.copyOfRange(scores,3,8);

        System.out.println(Arrays.toString(copies));

        System.out.println("--------------------------------------------------------");
        int [] result = Arrays.copyOfRange(scores,3,scores.length);

        System.out.println(Arrays.toString(result));



    }
}
