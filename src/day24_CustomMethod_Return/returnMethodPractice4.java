package day24_CustomMethod_Return;

public class returnMethodPractice4 {

    public static void main(String[] args) {

        String str = "aaaaabbbcccddd";

        str = removeDuplicate(str);

        System.out.println(str);


    }


    //1. create a method that can remove duplicated characters from a string and returns the new value
    public static String removeDuplicate(String str) { // "aaaabbbccc"======> "abc"

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains("" + each)) {  // "" ==== used for returning chat value to the String
                result += each;


            }
        }
                 return result;

    }


}
