package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {

        char grade = 'C';
        
        String result= " ";

        switch (grade){

            case 'A':
                //System.out.println("Excellent");
                result= "Excellent";
                break;

            case 'B':
                //System.out.println("Great Job");
                result= "Great Job";
                break;

            case 'C':
                //System.out.println("Good");
                result= "Good";
                break;

            case 'D':
                //System.out.println("Passed");
                result= "Pssed";
                break;

            case 'F':
                //System.out.println("Failed");
                result= "Failed";
                break;

            default:
                //System.out.println("Invalid");
                result = "Invalid";
                break;
                

        }

        System.out.println(result);

    }
}


             /*
             3. a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid

              */
