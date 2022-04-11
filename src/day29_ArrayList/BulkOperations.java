package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,3,4,5,6,7,8,8,9,10));

        System.out.println(list);

        list.removeAll(Arrays.asList(3,5,8));  // even if the element which will be removed are the multiple, all the elements will be removed

        System.out.println(list);

        System.out.println("---------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(100,200,300,400,600,700,100,200,300,800,900));

        numbers.retainAll(Arrays.asList(100,200,300));  // remove all the non-matching elements

        System.out.println(numbers);

        System.out.println("---------------------------------------------------");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA","SDET","Developer","QA","SDET","Scrum Master","BA","BA"));

        jobTitles.retainAll(Arrays.asList("QA","SDET"));

        System.out.println(jobTitles);

        System.out.println("------------------------------------------------");

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));

        boolean r1= nums.contains(10);

        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);  // one solution

        boolean r3 = nums.containsAll(Arrays.asList(2,5,10));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("-----------------------------------------------");

        // converting the Array to the ArrayList
        String[] names = {"Josh","Jack","Daniel","Shay","Esra"};

        ArrayList<String> nameList = new ArrayList<String>(Arrays.asList(names));

        System.out.println(nameList);

        System.out.println("-------------------------------------------");

        // int[] arr = {1,2,3,4,5,6,7,8,9,10};   // we can not use the "Array.asList" for the primitives

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};    // convert it into the non-primitives

        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(arr));

        System.out.println(arrList);

        System.out.println("-----------------------------------------------");
        
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        
        ArrayList<Integer> list3= new ArrayList<>(convertArrayToArrayList(arr2));

        System.out.println("list3 = " + list3);
        
        
        
        
        
    }
    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        
        ArrayList<Integer> list = new ArrayList<>();

        for (Integer each : array) {
            list.add(each);
            
        }
        return list;
    }
}
