package day15_ForLoop;

public class ForLoopPractices {

    public static void main(String[] args) {

        for(int i=15; i<= 45; i++){

            System.out.print(i+" ");    //  print method not println... all the numbers will be printed in the same line

        }


        System.out.println("\nHello");     // it will be printed in the previous line.


        System.out.println("--------------------------------------");

        for(int i= 100; i>=50; i--){    // 100, 99, 98, ..., 50

            System.out.print(i+" ");
        }


        System.out.println("\nWorld");

        System.out.println("-------------------------------------------------");

        // print all the even number between 1~55


        for (int i = 1; i<= 55; i++){

            if (i % 2==0){
                System.out.print(i+" ");
            }
        }

        System.out.println("\n----------------------------------------");

        // print all the even number between 1~55: 2, 4, ...., 54

        for(int i = 2; i<=54; i +=2){     // i:

            System.out.print(i +" ");


        }

        System.out.println("\n--------------------------------------------");




    }
}
