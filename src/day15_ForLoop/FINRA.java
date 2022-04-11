package day15_ForLoop;

public class FINRA {

    public static void main(String[] args) {

        System.out.println();   // I printed this line for making the lines on console readable..

        for (int i =1; i <= 100; i++){

            if(i % 15 == 0) {   // OR (i % 3== 0 && i % 5==0){  //  ====> the first number which is divisible by 3 & 5 is the number 15.
                System.out.print("FINRA ");
            }else if(i%3==0){
                System.out.print("FIN ");

            }else if(i % 5 == 0){
                System.out.print("RA ");
            }else{
                System.out.print(i +" ");
            }
        }


        System.out.println();   // I printed this line for making the lines on console readable!
    }
}
/*
2. Write a method which prints out the numbers from 1 to 100 but for numbers
 which are a multiple of both 3 and 5, print "FINRA" instead of the number,
 for numbers which are a multiple of 3, print "FIN" instead of the number and
 for numbers which are a multiple of 5, print "RA" instead of the number.

        ex:
            output:
                1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN

 */