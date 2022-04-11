package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        // create a variable that's capable enough to contain 5 names
        // String [] myGroup;            //   OR ====>      String myGroup[];
        String [] myGroup= new String[5];    // 0-4    (don t exceed the given range)
        myGroup[0]="Gunay";
        myGroup[1]="Neira";
        myGroup[2]="Suat";
        myGroup[3]="Hulya";
        myGroup[4]="Mikael";   // myGroup[3] = "Mikael" in this cas Hulya assign to Mikael



        // System.out.println(myGroup);    // hashcode
        System.out.println(Arrays.toString(myGroup));

        System.out.println("------------------------------------------------------------");

        String [] days= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        //index             0         1          2           3         4        5          6

        // days[7] = "JavaDay";   we cannot change the data

        System.out.println(Arrays.toString(days));

        int number = 5;

        if(number<1 || number>7){
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number]);

        System.out.println("-------------------------------------------------------------");

        String [] months ={"January","February","March","April","May","June",
                "July","August","September","October","November","December"};   //  0-11 (length -1)
        int num= 1 ;

        if(num<1 || num>12){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        for (int i = 0; i < months.length; i++) {  // index number [i] is always less than length(size)
                                                   // index num starts with 0 but size, with 1

            System.out.println(months[i]);
        }

       /*
        System.out.println(months[num-1]);   // Or  [0]
        System.out.println(months[1]);
        System.out.println(months[2]);
        System.out.println(months[3]);
        System.out.println(months[4]);
        System.out.println(months[5]);
        System.out.println(months[6]);
        System.out.println(months[7]);
        System.out.println(months[8]);
        System.out.println(months[9]);
        System.out.println(months[10]);
        System.out.println(months[11]);

        */

        System.out.println("-----------------------------------------------------");

        for (int i = months.length-1; i >= 0 ; i--) {
            System.out.println(months[i]);

        }








    }
}
