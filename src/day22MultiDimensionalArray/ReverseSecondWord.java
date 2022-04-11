package day22MultiDimensionalArray;

public class ReverseSecondWord {

    public static void main(String[] args) {

        String sentence = "I Love Java";

        String[] words= sentence.split(" ");

        String reverse= " ";

        for (int i = words[1].length() - 1; i >= 0; i--) {   // words[1].length() - 1  ======>  second word
            reverse += words[1].charAt(i);  // words[1] ===> second word //  words[1].charAt(i) ====> chars of second word
             //   += ====> adding one by one chars or words or numbers ....
        }

        System.out.println(reverse);

        /*
        sentence = sentence.replaceFirst(words[1], reverse);

        System.out.println(sentence);  // I evoL Java

         */

        // second solution for sentence with the second word reversed

        words[1]=reverse;

        for (String word : words) {
            System.out.print(word+" ");

        }


    }
}


/*

	2. Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";

			output:
				I evoL Java


 */
