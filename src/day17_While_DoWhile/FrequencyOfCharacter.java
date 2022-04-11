package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "AAABBBC";

        char ch = 'A';

        int frequency = 0;

        for (int i = 0; i < str.length() ; i++) {  // OR; i<= str.length() -1;  // i : indexes of str

            char eachChar = str.charAt(i);

            System.out.print(eachChar);

            if(ch  == eachChar){ // if the given ch is matching with the eacChar, then ch is appeared in the string

                frequency++;  // in order to find the frequency of the given ch(How many times is it written in string?)
                // frequency += 1;

            }

        }

        System.out.println("\n"+frequency);

    }
}
/*
1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3

 */