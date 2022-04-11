package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {

        int score= 85;

        /*
        if(score>=0 && score <= 100){
             if(score>=60){
                 System.out.println("Passed");
             }else{
                 System.out.println("Failed");
             }

        }else{
            System.out.println("Invalid score");
        }

         */

        String result = (score>=0 && score<=100)? (score>=60)? "Passed" : "Failed": "Invalid score";
        System.out.println(result);


    }
}
