package day13_StringClass;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();


        System.out.println("Enter your age: ");
        int age= input.nextInt();


        System.out.println("Enter your gender: ");
        String gender= input.next();


        System.out.println("Enter your phone number: ");

        long phoneNumber= input.nextLong();

        System.out.print("Enter your building number: ");
        int buildingNumber= input.nextInt();

        input.nextLine();
        System.out.println("Enter your Street name: ");
        String street= input.nextLine();

        System.out.println("Enter your city name: ");
        String cityName= input.next();

        System.out.println("Enter your state name: ");
        String state= input.next();

        System.out.println("Enter your zip code: ");
        int zipCode= input.nextInt();


        input.nextLine();
        System.out.println("Enter your school name: ");
        String schoolName= input.nextLine();

        input.close();

        System.out.println(fullName);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(phoneNumber);
        System.out.println("adress:");
        System.out.println("\t\t\t"+buildingNumber+" "+street);

        System.out.println("\t\t\t"+cityName+", "+state+" "+zipCode);

        System.out.println(schoolName);










    }
}
