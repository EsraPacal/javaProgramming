package day13_StringClass;

public class StringMethods {
    public static void main(String[] args) {
        
        String word= "Cydeo";
            // index: 01234
        
        char thirdChar= word.charAt(2);                // .charAt()

        System.out.println("thirdChar = " + thirdChar);
        
      /* 
      
        char tenthChar = word.charAt(9);
        System.out.println("tenthChar = " + tenthChar);
        
       */

        System.out.println("---------------------------------------");
        
        String s1 = "Batch 25 is the best batch";
        
        int totalChar = s1.length();

        System.out.println("totalChar = " + totalChar);
        
        char lastChar = s1.charAt( totalChar -1 );    // last index number

        System.out.println("lastChar = " + lastChar);

        System.out.println("----------------------------------------");

        String str = "wooden spoon";
          str = str.toUpperCase();  // "WOODEN SPOON"

        System.out.println( str);


        String sentence = " Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();

        System.out.println(sentence);


    }
}
