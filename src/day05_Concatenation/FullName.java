package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

        String firstName = "Esra";
        String lastName = "Pacal";
        int age = 32;
        String jobTitle = " SDET";
        String companyName = "Cydeo";
        double salary = 100000.50;


        String fullName = firstName + " " + lastName;

        // Full name of the person is ______

        System.out.println("Full name of the person is  " + fullName + ".");

        // ____ is _____ years nold.
        System.out.println(fullName + " is " + 32 + " years old." );       //
        // FullName is JobTitle, works at CompanyName.
        System.out.println(fullName + " is an" + jobTitle + ", works at " + companyName + ", and " + fullName + "'s salary is $" + salary + ".");





    }
}
