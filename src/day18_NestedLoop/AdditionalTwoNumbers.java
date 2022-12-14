package day18_NestedLoop;

import java.util.Scanner;

public class AdditionalTwoNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true){

            System.out.println("Enter your first number: ");
            int num1 = scan.nextInt();

            System.out.println("Enter your second number: ");
            int num2= scan.nextInt();

            System.out.println("Addition: "+ (num1 +num2));

            System.out.println("Would you like to continue?");
            String answer= scan.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no")) )  {

                System.err.println("Invalid entry, please re enter");

                answer= scan.next().toLowerCase();
            }

            if(answer.equals("no")){   // if the answer is yes, it will continue asking to enter a first and second nums
                break;     // exist the outer loop
            }
        }

    }
}
