package utilities;

import java.util.Arrays;

public class StringUtility {

    //prints each character of the given string
    public static void printEachChar(String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }
    }

    // reverses the given string and returns the reversed string
    public static String reverse(String str) {

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            result += str.charAt(i);

        }
        return result; // "avaJ"
    }

   // checks if the given String is palindrome or not..., returns boolean
    public static boolean isPalindrome(String str){ //  result will be boolean ====   the given value ==> String
        return reverse(str).equalsIgnoreCase(str);
    }

    // checks if the given string is "anagram", returns boolean
    public static boolean anagram (String str1, String str2){  //  "abc"  , "bca"
        char[] ch1 = str1.toCharArray();  // checking all the char in the string str1
        char[] ch2 = str2.toCharArray();  // checking "    "    "    "     "     str2

        Arrays.sort(ch1);
        Arrays.sort(ch2);

       return Arrays.equals(ch1,ch2);

    }

    // removes the duplicates from given string, returns String    "aaaabbbc"
    public static String removeDuplicates(String str){

        String result = "";

        for (int i = 0; i < str.length() ; i++) {

            char each  = str.charAt(i);   // aaaabbbc

            if(!result.contains("" +each)){  // we add "" in order to change the char into the string

                result += each;
            }
        }
        return result;
    }


}
