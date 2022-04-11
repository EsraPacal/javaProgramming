package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        String[] countries = {"France","Turkey", "Hungary", "United Kingdom","United States","Canada"};

        // converting array to arrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));

        list.removeIf(p-> p.length()>=10);

        // converting the ArrayList back to the Array

        countries = list.toArray(new String[0]);  // size of new array is depending on the list

        System.out.println(Arrays.toString(countries));
    }
}
  /*
  1. create an Array of String called country names

  2. write a program  that can remove all the country  names that have length of 10 or greater
   */