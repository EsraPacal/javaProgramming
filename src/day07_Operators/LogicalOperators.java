package day07_Operators;

public class LogicalOperators {

    public static void main(String[] args) {

        String name = "Steven",
                name2 = "Daniel";

        int age = 19,
                age2 = 25;

        String citizen = "UK",
                citizen2 = "USA";

        boolean isEligible = age >= 18 && citizen == "USA";
                              // 19 >= 18  && "UK" == "USA"
                              //   true    &&     false ======> false

        boolean isEligible2 = age2 >= 18 && citizen2 == "USA";

        System.out.println(name + " is eligible to vote: " + isEligible);
        System.out.println(name2 + " is eligible to vote: " + isEligible2);

        System.out.println("_____________________________________");

        String name3 = "josh";

        int creditScore = 720;
        int age3 = 23;
        int income = 50000;

        boolean isEligible3 = creditScore >= 700 && age3 >= 21 && income >= 60000;

        System.out.println(name3 + " is eligible for loan: " + isEligible3);


        System.out.println("___________________________________________________");

        String name4 = "Shay";
        int age4 = 21;
        char gender = 'F';

        boolean isEligible4 = age4 >= 18 && (gender == 'F' || gender == 'M');
        //                        21 >= 18  &&  ('F' == 'F' || 'M' =='M')

        System.out.println(name + " is eligible to register: " + isEligible4);

        System.out.println("______________________________________________");

        String name5 = "James";

        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = false;

        boolean isEligible5 = countryOfBirth == "USA" || marriedToUSCitizen == true;

        System.out.println(name5 + " is eligible to apply for US citizenship: " + isEligible5);

        //  one of the values or all of the values must be true in order to return true

        System.out.println("_______________________________________________________");

        String student = "Anna";

        double gpa = 2.5;
        int familyIncome = 50000;

        boolean isEligible6 = gpa >= 3.5 || familyIncome <= 60000;
      //                      false
        System.out.println(student + " is eligible for scholarship: " + isEligible6);

        System.out.println("_______________________________________________________________");
        
        boolean result2 = true;
        System.out.println("result2 = " + result2);

        boolean result3 = !result2;
        System.out.println("result3 = " + result3);

        System.out.println("_______________________________________________________");

        int score = 85;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("failed = " + failed);
        System.out.println("passed = " + passed);






    }
}

