package day16_ForLoopStringPractice;

public class Reverse {    // interview question

    public static void main(String[] args) {

        String str = "Wooden Spoon";
        //     index: 0123456789

        String result = "";   // contains the reversed version of str

        /*
        result += str.charAt(11); // n
        result += str.charAt(10); // o
        result += str.charAt(9);  // o
        result += str.charAt(8);  // p
        result += str.charAt(7);  // S
        result += str.charAt(6);  //' '  space
        result += str.charAt(5);  // n
        result += str.charAt(4);  // e
        result += str.charAt(3);  // d
        result += str.charAt(2);  // o
        result += str.charAt(1);  // o
        result += str.charAt(0);  // W

         */

       // for (int i = 11; i >= 0 ; i--) { // If you don't give the iteration, this condition is not going to be

        for (int i = str.length() -1; i >= 0 ; i--){// i: index numbers of str (starting last index to index 0)

                     result += str.charAt(i);   // ( += ): adding each character to result

        }
        System.out.println(result);
    }
}


/*
1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW

 */