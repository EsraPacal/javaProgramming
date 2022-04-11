package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethod2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);

        /*
        int num= 1;

        list.remove(num);      // removes the element at the index number 1  =======>200
 */
        Integer num = 200;
        boolean r = list.remove(num);      // removes the object 200 from the Array List

        System.out.println(list);
        System.out.println(r);

        System.out.println("---------------------------------------");

        System.out.println(list.size());

        list.clear();

        System.out.println(list.size());
        System.out.println(list);

        System.out.println("----------------------------------------");

        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A');      // 4
        int b = characters.lastIndexOf('A');  // 4

        System.out.println(a);
        System.out.println(b);

        System.out.println("----------------------------------------------");

       boolean r2 =  characters.contains('A');

       boolean r3 = characters.contains('Z');

        System.out.println("r3 = " + r3);
        System.out.println("r2 = " + r2);

        System.out.println("-----------------------------------------------");

        // in the heap, list1 and list2 is contained separately, because both of them are new object.
        // so, if we use "==" operator for comparing them, result will be always false else if the elements are same.
        // in this case, we should use "equals()" method for comparing if the elements of both lists are the same or not...

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();  //

        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1==list2);   // false
        System.out.println(list1.equals(list2));   // true  // but the order of two lists is not same, then it returns also false.

        System.out.println("-------------------------------------------");

        list1.clear();  //  removes everything in the list1

        boolean r4 = list1.isEmpty();   // true

        System.out.println("r4 = " + r4);

        System.out.println("--------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();

        // Bulk Operation: CollectionType
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8) );

        System.out.println(numbers);

    }
}
