package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposal {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Will you marry me? Yes/No");
        String answer= scan.next().toLowerCase();

        String result = "";

        /*
        if(answer == "yes" ) {
            result = "Congrats";
            System.out.println(result);

        }else if(answer == "no") {
            result= "Goodbye";
            System.out.println(result);

        }else{

         */

            while( !(answer.equals("yes") || answer.equals("no") ) ) {
                System.out.println("Invalid answer, please re-enter: ");

                System.out.println("Will you marry me?");

                answer = scan.next();

            }
            if(answer.equals("yes") ){
                result= "Congrats";
                System.out.println(result);

            }else{
                result= "Goodbye";
                System.out.println(result);
            }



    }
}
