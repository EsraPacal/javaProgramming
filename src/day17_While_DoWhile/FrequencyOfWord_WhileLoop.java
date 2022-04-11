package day17_While_DoWhile;

import java.util.Locale;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {

        String str = "Java Java Python Python";

        int frequency= 0;

        while(str.contains("Java") ) {

            str= str.replaceFirst("Java", "");

            frequency++;

        }
        System.out.println(frequency);

        System.out.println("-----------------------------------------");

        String sentence = "cat cat cat cat dog dog dog cat cat ";

        sentence= sentence.toLowerCase();

        int countcat = 0;

        while (sentence.contains("cat") ) {         // used for executing the word cat
            sentence = sentence.replaceFirst("cat", "");  // used for removing the words "cat"

            countcat++; // used for deleting the words cat one by one and for shoving how mny times the word is deleted
        }      // !!! this expression is just for this solution method

        System.out.println(countcat);

        System.out.println("---------------------------------------");

        String s= "java java java python python python";

        int countJava= 0;
        int countPython= 0;

        while( s.contains("java") || s.contains("python") ){

            if (s.contains("java")){
                s= s.replaceFirst("java", "");
                countJava++;
            }
            if(s.contains("python")){
                s= s.replaceFirst("python", "");
                countPython++;
            }

        }
        System.out.println(countJava);
        System.out.println(countPython);


    }
}
