package day21_ForEachLoop;

import java.util.Arrays;

public class Initials {

    public static void main(String[] args) {

        String [] names = {"Cydeo School","Wooden Spoon","Java Programming","SQL Programming",
                       "Selenium Automation","API Testing","Database Testing","Manual Testing"};

        for( String each  :  names   ){

            String initial = each.charAt(0)+"."+each.charAt(  each.indexOf(" ")+1 );  // after space ...
            System.out.println(initial);


        }


    }
}
