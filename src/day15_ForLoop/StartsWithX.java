package day15_ForLoop;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {


        System.out.println("Enter a word:");

        String word= new Scanner(System.in).next();  // xcodex  //...........................................!



        if(word.charAt(0) =='x'){

             word = word.replace("x","a");  //"acodex"
            System.out.println( word);

            // in this method of Scanner, we don't need to close the Scanner!!!


        }



    }
}
     /*
     1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
        Input:
        xcodex
        Output:
        acodex

      */



