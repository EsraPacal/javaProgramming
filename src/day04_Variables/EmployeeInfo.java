package day04_Variables;

public class EmployeeInfo {

    public static void main(String[] args) {

      /*
        6. Create a class named EmployeeInfo. declare the following variables:
                1. name (String)
                2. age (int)
                3. gender (char)
                4. company (String)
                5. jobTitle (String)
                6. yearsOfExpereince (double)
                7. salary (int)
                8. isFullTime (boolean)
                9. isMarried (boolean)
               10. employeeId (String)
               11. SSN (String)
       */

        String name = "Esra";
        int age = 32;
        char gender = 'F';
        String company = "SAMSUNG";
        String job_Title = "SDET";
        double years_Of_Experience = 3.5;
        int salary = 120000;
        boolean isFullTime = true; // char isFullTime = 'Y';
        boolean isMarried = true;   // char isM
        String employeeId = "125463987C";
        String SSN = "A123654875CB";

        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Gender = " + gender);
        System.out.println("Company = " + company);
        System.out.println("Job Title = " + job_Title);
        System.out.println("Experience = " + years_Of_Experience);
        System.out.println("Salary = $" + salary);
        System.out.println("FullTime = " + isFullTime);
        System.out.println("Married = " + isMarried);
        System.out.println("Employee Id = " + employeeId);
        System.out.println("SSN = " + SSN);



    }
}
