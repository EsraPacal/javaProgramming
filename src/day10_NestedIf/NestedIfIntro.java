package day10_NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 95;

        if (score > 100 && score < 0) {


            if (score >= 60) {     // if the score is valid
                System.out.println("Passed");   // if the student passed the exam
            } else {
                System.out.println("Failed");     // If the student failed the exam

            }


        } else {        // If the score is NOT valid
            System.out.println("Invalid score");

        }

        System.out.println("______________________________________________");

        int age = 25;
        boolean hasId = true;

        if (hasId) {     // If the person has Id


            if (age >= 21) {
                System.out.println("Eligible to buy alcohol");
            } else {
                System.out.println("Not eligible to buy alcohol");
            }

        } else {
            System.out.println("You must have an Id to buy alcohol");    // If the person doesn't have an Id
        }


        System.out.println("_______________________________________________");


        int number = 5;

        // 1<=number <=7
        if (number >= 1 && number <= 7) {

            if (number == 1) {
                System.out.println("Monday");
            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("Wednesday");
            } else if (number == 4) {
                System.out.println("Thursday");
            } else if (number == 5) {
                System.out.println("Friday");
            } else if (number == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }

        } else {   // If the number is invalid
            System.out.println("Invalid number");
        }





    }
}
