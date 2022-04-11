package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str= "aaaaabccceeefggggghiiiikkkkl";
        
        String[] arr = str.split("");  // non-primitive Array. This array contains all the chars of the array
        // We need to create an Array out of the ArrayList in order to find unique elements of String
        // then, it will be converted into the ArrayList =====(arr)
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr) );  // converting the String to the ArrayList

        System.out.println("list = " + list);

        String unique = ""; 

        for (String each : list) {
            int frequency = Collections.frequency(list, each);
            if(frequency== 1){
                unique += each;  // for the String we have to use concatenation. it doesn't have add method ex; each++;
            }
        }

        System.out.println("unique = " + unique);
    }
}
