package day16_ForLoopStringPractice;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str= "AABCCD";
                   //012345
        String result= "";




        for (int i = 0; i <= str.length()-1; i++) {  // i: index numbers of str // we can use i < str.length() , also. i: i

            char ch = str.charAt(i);   // ch: each characters of str

             //     3     ==     3
        if(str.indexOf(ch) == str.lastIndexOf(ch)) {  // if the first and last index numbers of the character are same, then the character is unique
            result += ch;


        }


        }

        System.out.println(result);




    }
}
/*
3. Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

				output:
					BD

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique



				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1


				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2


 */