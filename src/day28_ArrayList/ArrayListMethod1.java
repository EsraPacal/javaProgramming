package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethod1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // add(Data) Method:
        numbers.add(10); // 0     // autoboxing
        numbers.add(20); // 1
        numbers.add(30); // 3
        numbers.add(40); // 4
        numbers.add(50); // 6
        numbers.add(60); // 7

        // add(index, Data) Method:
        numbers.add(2, 25);  //  2            // insert a number
        numbers.add(5, 45);  //  5            // inserted between  40 and 50

        System.out.println(numbers);

        System.out.println(numbers.size());  // returns total size of the elements

        // size() Method:  in order to find the last index
        int lastIndex = numbers.size()-1;

        System.out.println("lastIndex = " + lastIndex);

        //
        int num =  numbers.get(3);   // returns the number of index 3

        System.out.println("num = " + num);

        System.out.println("------------------------------------------------");

        for (int i = 0; i <numbers.size() ; i++) {
            System.out.println(numbers.get(i));
           // System.out.print(" "+numbers.get(i));

        }
        System.out.println("-------------------------------------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Rugby");

        list.set(2,"JavaScript");  // replaces the element at the given index with the new element

        System.out.println(list);

        list.set(3,"C++")   ;
        System.out.println( list);

        System.out.println("-------------------------------------------");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Esra");
        employees.add("Sevil");
        employees.add("Omer");
        employees.add("Ilhan");
        employees.add("Orhan");
        employees.add("Ayse");

        System.out.println(employees);

        employees.remove(0); // remove "Suat"

        System.out.println(employees);

        employees.remove(0);  // remove "Esra"

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(1);

        System.out.println(employees);

        employees.remove(employees.size()-1);  // remove the last element at the given last index

        System.out.println(employees);

        boolean r1= employees.remove("Orhan");  // if there are multiple object, then only one will be removed....!

        System.out.println(employees);

        boolean r2 = employees.remove("Omer");

        System.out.println(employees);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);


    }
}
