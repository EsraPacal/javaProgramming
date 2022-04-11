package day19_LoopPractices;

public class UniqueCharacters<result> {

    public static void main(String[] args) {

        String str = "aabccdeef";

        String result = ""; // "bdf"

        // char ch = 'a';

       // int count = 0;   // represents the frequency of the ch

        for (int j = 0;  j< str.length() ; j++) {

            char ch= str.charAt(j);   // each of the characters
            int count= 0;   // represents the frequency of the characters

            for (int i = 0; i < str.length(); i++) {  // compares the character that outer loop picked, with each character of the String

                char each = str.charAt(i);   // ch: each characters of str
                if (ch == each) {
                    count++;
                }
            }
/*
            if(count== 1) {  // if the frequency of the ch is 1 then the ch is unique

                result += ch;

 */           // the other method

            if(count != 1){
                 continue;

            }
               result += ch;

            }
                  System.out.println(result);


                }

            }










/*
2. Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf
 */