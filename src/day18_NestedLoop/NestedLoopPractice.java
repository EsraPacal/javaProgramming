package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your age: ");

        int age= scan.nextInt();

        while (!(age>= 1  && age<=120)) {  // while the age is invalid
            System.err.println("Invalid Entry, Please re-enter your age:");
            age = scan.nextInt();

        System.out.println("Would you like to continue?");
        String answer= scan.next().toLowerCase();

        while(!(answer.equals("yes") || answer.equals("no") ) ){
            System.err.println("Invalid Entry, please re-enter. Would you like to continue?");
            answer= scan.next().toLowerCase();

        }

        if(answer.equals("no")) {
            break;

        }

        }

        scan.close();

    }
}
