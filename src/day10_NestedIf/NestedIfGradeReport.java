package day10_NestedIf;

public class NestedIfGradeReport {
    public static void main(String[] args) {

        int score = 95;

        // solution1:

        if(score >= 0 && score <= 100){
            // 5 possibilities: A, B, C, D, F

            if(score>=90){            // false: score<90
                System.out.println("Excellent");
            }else if(score>=80){   //false: score <80
                System.out.println("Great");
            }else if(score>=70){         // false: score<70
                System.out.println("Good");
            }else if(score>=60){           //false: score<60
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

        }else{    // If the score is not valid
            System.out.println("Invalid score");
        }

        System.out.println("_____________________________________________________");

        //solution2:   IT'S NOT RECOMMENDED

        String result =(score>=0 && score<=100)? (score>=90)? "Excellent" :(score>=80)? "Great" :(score>=70)? "Good"
                :(score>=60)? "Passed" : "Failed" : "Invalid score";

        System.out.println( result);



        System.out.println("____________________________________________________");

        // Solution3:

        String result2 = " ";

        if(score >= 0 && score <= 100){

            result2 =(score>=90)? "Excellent" :(score>=80)? "Great" :(score>=70)? "Good"
                    :(score>=60)? "Passed" : "Failed";

        }else{
            result2= "Invalid score";

        }

        System.out.println(result2);






    }
}
