package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        String[] group1 = {"esra","Sevil","Ilhan",};
        String[] group2 = {"Omer","Muaz","Orhan","Ayse","Seda"};

        String[] students = new String[group1.length+ group2.length];  // 8 students

        int i = 0;   //  i : index // we declare int, so we can store the index numbers of the chars
        for (String each : group1)  {
            students[i++] = each;

        }
        for (String each :  group2) {
            students[i++] = each;

        }
        System.out.println(Arrays.toString(students));

        System.out.println("--------------------------------------------------");

        char[] ch1 = {'A','B','C'};
        char[] ch2 = {'D','E','F','G','H'};

        char[] chars = new char[ch1.length+ ch2.length];   // new char ARRAY for collecting the chars of ch1 and ch2

        int index= 0;   // new indexes of the new chars created

        for (char c : ch1) {
            chars [index++] = c;
        }
        for (char c : ch2) {
            chars[index++] = c;

        }

        System.out.println(Arrays.toString(chars));



        // INTERVIEW QUESTION  !!!!


    }
}
