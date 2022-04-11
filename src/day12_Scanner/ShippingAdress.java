package day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter your building number: ");
        String building = scan.next();

        scan.nextLine();    // we have to rewrite scan method

        System.out.println("Enter your Street Name: ");
        String street = scan.nextLine();

        System.out.println("Enter your city name: ");
        String city= scan.nextLine();

        System.out.println("Enter your state: ");
        String state = scan.next();

        System.out.println("Enter your Zip code");
        String zipCode = scan.next();

        scan.nextLine();    // we have to import that scan method after all the other scan methods

        System.out.println("Enter your country name: ");
        String country= scan.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("building = " + building);
        System.out.println("street = " + street);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);
        System.out.println("country = " + country);



    }
}

/*
1.Enter your full name
2.Enter your building number
3. Enter your Street name
4. Enter your city name
5. Enter your state
6. Enter your Zip code

Display the shipping address
 */