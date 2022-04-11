package day11_Switch_Scanner;

public class Grade2_OrLogic {
    public static void main(String[] args) {

        char ch= 'A';

        // String result= " ";

        switch (ch){

            case 'A':              // case 'A': case 'B': case 'C': case 'D':
            case 'B':
            case 'C':                          // can be also written in one line.
            case 'D':
                System.out.println("Passed");      // OR: result= "Passed";
                break;

            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid");
                break;




            // OR Logic  ( || ) in switch statement


        }

    }
}



/*
   If the grade is A or B or C or D =======> "Passed"
   otherwise = "Failed"
 */