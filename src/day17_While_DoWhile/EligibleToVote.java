package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");

        int age = scan.nextInt();     // Valid age: 1-120
        boolean eligible = age>=21  && age <=120 ;

        while(  !( age>= 1  && age<=120) ){    // while the age number is invalid
            System.err.println("Invalid age. Please re-enter:");
            age= scan.nextInt();
        }
        // System.out.println( (eligible)? "Eligible" : "Not eligible");

        System.out.println("Are you a US citizen? yes/no");
        String answer = scan.next().toLowerCase();

        while( !(answer.equals("yes") || answer.equals("no")) ){
            System.err.println("Invalid answer. Please re-enter:");
            System.out.println("Are you a US citizen? yes/no");
            answer= scan.next().toLowerCase();
        }

        if(eligible && answer.equals("yes") ){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }



    }
}
