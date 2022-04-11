package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,1,1,2,5,6,7,8,5,7,7,8,9));
        
        ArrayList<Integer> unique = new ArrayList<>();

        for (Integer each : list) {
            int frequency = Collections.frequency(list, each);  // finds the frequency of each element
            if(frequency==1){
                unique.add(each);
            }
            
        }

        System.out.println("unique = " + unique);

        System.out.println("------------------------------------------");

        // the other solution for the frequency by using "removeIf" method

        ArrayList<Integer> list2 = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,1,1,2,5,6,7,8,5,7,7,8,9));

        ArrayList<Integer> unique2 = new ArrayList<>(list2);  // list2 in the list of unique2

        unique2.removeIf(p-> Collections.frequency(list2, p) > 1) ;  // finding the frequency by using RemoveIf
        //                                              p=====> each element of the list2
        System.out.println("unique2 = " + unique2);

    }
}
